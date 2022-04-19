package com.JerryZzhu.foranimal.service.impl;

import com.JerryZzhu.foranimal.entity.AnimalInfo;
import com.JerryZzhu.foranimal.mapper.AnimalInfoMapper;
import com.JerryZzhu.foranimal.service.IAnimalInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 宠物百科 服务实现类
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Service
public class AnimalInfoServiceImpl extends ServiceImpl<AnimalInfoMapper, AnimalInfo> implements IAnimalInfoService {

    @Override
    public List<AnimalInfo> getAll() {
        return baseMapper.selectList(null);
    }
}
