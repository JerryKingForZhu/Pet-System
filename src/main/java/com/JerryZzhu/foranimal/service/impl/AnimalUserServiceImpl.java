package com.JerryZzhu.foranimal.service.impl;

import com.JerryZzhu.foranimal.entity.AnimalUser;
import com.JerryZzhu.foranimal.mapper.AnimalUserMapper;
import com.JerryZzhu.foranimal.service.IAnimalUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 宠物论坛用户表 服务实现类
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Service
public class AnimalUserServiceImpl extends ServiceImpl<AnimalUserMapper, AnimalUser> implements IAnimalUserService {

}
