package com.JerryZzhu.foranimal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 帖子详情表
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AnimalCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "animal_cart_id", type = IdType.AUTO)
    private Integer animalCartId;

    /**
     * 帖子标题
     */
    private String animalCartTitle;

    /**
     * 文章类型
     */
    private String animalCartType;

    /**
     * 文章详情
     */
    private String animalCartContent;

    /**
     * 浏览次数
     */
    private String animalCartViewCounts;

    /**
     * 发表时间
     */
    private LocalDate animalCartSendTime;


}
