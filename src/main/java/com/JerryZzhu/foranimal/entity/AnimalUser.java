package com.JerryZzhu.foranimal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 宠物论坛用户表
 * </p>
 *
 * @author Jerry
 * @since 2022-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AnimalUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "animal_user_id", type = IdType.AUTO)
    private Integer animalUserId;

    private String animalUserName;

    private String animalUserPassword;

    private String animalUserHeaderAddress;

    private String animalUserSessionId;


}
