package com.qf.detravel.utils;


import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

/**
 * 发邮件工具类
 */
public final class MailUtils {

    private static final String USER = "452737801@qq.com"; // 发件人称号，同邮箱地址
    private static final String PASSWORD = "mvwhccknnwjqbidh"; // 如果是qq邮箱可以使户端授权码，或者登录密码

    /**
     *
     * @param to 收件人邮箱
     * @param text 邮件正文
     * @param title 标题
     */
    /* 发送验证信息的邮件 */
    public static boolean sendMail(String to, String text, String title){
        try {
            final Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", "smtp.qq.com");

            //开启Debug调试
            props.setProperty("mail.debug", "true");
            //端口号
            props.setProperty("mail.smtp.port", "465");
            //发送邮件协议
            props.setProperty("mail.transport.protocol", "smtp");
            //开启ssl加密（并不是所有的邮箱服务器都需要，但是qq邮箱服务器是必须的）
            MailSSLSocketFactory msf= new MailSSLSocketFactory();
            msf.setTrustAllHosts(true);
            props.put("mail.smtp.ssl.enable", "true");
            props.put("mail.smtp.ssl.socketFactory",msf);

            // 发件人的账号
            props.put("mail.user", USER);
            //发件人的密码
            props.put("mail.password", PASSWORD);



            // 构建授权信息，用于进行SMTP进行身份验证
            Authenticator authenticator = new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    // 用户名、密码
                    String userName = props.getProperty("mail.user");
                    String password = props.getProperty("mail.password");
                    return new PasswordAuthentication(userName, password);
                }
            };
            // 使用环境属性和授权信息，创建邮件会话
            Session mailSession = Session.getInstance(props, authenticator);
            // 创建邮件消息
            MimeMessage message = new MimeMessage(mailSession);
            // 设置发件人
            String username = props.getProperty("mail.user");
            InternetAddress form = new InternetAddress(username);
            message.setFrom(form);

            // 设置收件人
            InternetAddress toAddress = new InternetAddress(to);
            message.setRecipient(Message.RecipientType.TO, toAddress);

            // 设置邮件标题
            message.setSubject(title);

            // 设置邮件的内容体
            message.setContent(text, "text/html;charset=UTF-8");
            // 发送邮件
            Transport.send(message);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static String getValidateCode(int  num){

        Random random = new Random();
        String validateCode = "";
        for (int i=0;i<num;i++){

            int result  = random.nextInt(10);
            validateCode +=result;

        }
        return validateCode;
    }

    public static void main(String[] args) throws Exception { // 做测试用
        MailUtils.sendMail("452737801@qq.com","你好，这是一封测试邮件，无需回复。","测试邮件随机生成的验证码是："+getValidateCode(6));
        System.out.println("发送成功");
    }
}
