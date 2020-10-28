package com.zhihao.entity;

import lombok.Data;

/**
 * amount正式情况应该是BigDecimal类型, 演示使用int
 *
 * @author: ZhiHao
 * @date: 2020/10/27
 */
@Data
public class Account {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userId;
    private Double money;

}
