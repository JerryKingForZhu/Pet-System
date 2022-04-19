package com.JerryZzhu.foranimal.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 宠物百科
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AnimalInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 宠物名称
     */
    private String animalInfoName;

    /**
     * 宠物类型
     */
    private String animalInfoType;

    /**
     * 宠物介绍
     */
    private String animalInfoContent;


}
