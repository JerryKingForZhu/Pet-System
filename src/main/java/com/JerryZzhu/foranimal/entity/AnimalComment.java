package com.JerryZzhu.foranimal.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户评论表
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AnimalComment implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 评论文章的id
     */
    private String animalCartId;

    /**
     * 评论内容
     */
    private String animalCommentContent;

    /**
     * 评论时间
     */
    private LocalDate animalCommentCreateTime;

    /**
     * 评论的作者
     */
    private String animalUserId;

    /**
     * 评论状态 0 存在  1删除
     */
    private String animalDelStatus;


}
