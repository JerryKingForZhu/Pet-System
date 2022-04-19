package com.JerryZzhu.foranimal.service;

import com.JerryZzhu.foranimal.entity.AnimalInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 宠物百科 服务类
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
public interface IAnimalInfoService extends IService<AnimalInfo> {

    List<AnimalInfo> getAll();

}
