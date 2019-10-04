package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Dynamic;
import com.qf.detravel.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


@Controller
@RequestMapping("/dynamic")
public class DynamicController {

    @Autowired
    DynamicService dynamicService;

    @PostMapping("/dynamic.do")
    public JsonResult insertDynamic(MultipartFile file, Dynamic dynamic) throws Exception {

        String path ="/usr/local/tomcat/webapps/images";
        File pare = new File(path);

        String rand = UUID.randomUUID().toString().replace("-","");
        String name = file.getOriginalFilename();
        name = rand + "_" +name;

        file.transferTo(new File(pare,name));
        //设置时间
        dynamic.setdTime(new Date());
        dynamic.setdPhoto(name);
        dynamicService.insertDynamic(dynamic);
        return new JsonResult(1,dynamic);
    }

}
