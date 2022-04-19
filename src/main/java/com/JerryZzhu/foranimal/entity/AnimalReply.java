package com.JerryZzhu.foranimal.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AnimalReply implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 评论id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 所回复的评论id
     */
    private String animalCommentId;

    /**
     * 回复评论的内容
     */
    private String animalReplyContent;

    /**
     * 评论用户id
     */
    private String animalUserId;

    /**
     * 评论给目标用户的id
     */
    private String animalTargetUserId;

    /**
     * 评论时间
     */
    private LocalDate animalReplyTime;

    private String animalDelStatus;


}
