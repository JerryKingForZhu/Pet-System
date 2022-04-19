package com.JerryZzhu.foranimal.service.impl;

import com.JerryZzhu.foranimal.entity.AnimalComment;
import com.JerryZzhu.foranimal.mapper.AnimalCommentMapper;
import com.JerryZzhu.foranimal.service.IAnimalCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户评论表 服务实现类
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Service
public class AnimalCommentServiceImpl extends ServiceImpl<AnimalCommentMapper, AnimalComment> implements IAnimalCommentService {

}
