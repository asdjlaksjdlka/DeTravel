package com.qf.detravel.controller;

import com.qf.detravel.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dynamic")
public class DynamicController {

    @Autowired
    DynamicService dynamicService;



}
