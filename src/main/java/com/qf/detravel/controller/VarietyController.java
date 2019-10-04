package com.qf.detravel.controller;

import com.qf.detravel.common.JsonResult;
import com.qf.detravel.entity.Variety;
import com.qf.detravel.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/variety")
@Controller
@ResponseBody
public class VarietyController {

    @Autowired
    VarietyService varietyService;

    @GetMapping("/list.do")
    public JsonResult listVariety(){
        List<Variety> list = varietyService.findAllVariety();
        return new JsonResult(1,list);
    }
}
