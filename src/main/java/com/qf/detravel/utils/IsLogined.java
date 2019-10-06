package com.qf.detravel.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class IsLogined {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private IsLogined isLogined;

    public boolean getloginStatus(String token){
        if (token==null){
            return false;
        }
        String id = stringRedisTemplate.opsForValue().get(token);
        if (id==null || "".equals(id)){
            //如果获取的id为空，则没有登录
            return false;
        }else {
            String token2 = MD5Utils.md5(id+ "haha");
            if (token.equals(token2)){
                //如果根据id生成的token2和相同，
                return true;
            }else {
                //如果根据id生成的token不同，验证登录失败
                return false;
            }
        }
    }

    //获取已登录登录用户的id，其中0为没有登录
    public int getUserId(String token){
        if (isLogined.getloginStatus(token)){
            String id = stringRedisTemplate.opsForValue().get(token);
            return Integer.parseInt(id);
        }else{
            return 0;
        }
    }
}
