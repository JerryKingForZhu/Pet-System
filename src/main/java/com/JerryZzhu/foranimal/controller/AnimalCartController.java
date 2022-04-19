package com.JerryZzhu.foranimal.controller;


import com.JerryZzhu.foranimal.entity.AnimalInfo;
import com.JerryZzhu.foranimal.service.IAnimalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 帖子详情表 前端控制器
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@RestController
@RequestMapping("/animal-cart")
public class AnimalCartController {

    @Autowired
    IAnimalInfoService iAnimalInfoService;

    @RequestMapping("/get")
    public List<AnimalInfo> getInfo()
    {
        return iAnimalInfoService.getAll();
    }
}
