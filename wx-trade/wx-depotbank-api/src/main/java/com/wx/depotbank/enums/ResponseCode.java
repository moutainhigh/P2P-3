/******************************************************************************
 * Copyright (C) 2015 ShenZhen WuXingCaiFu Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳五星财富互联网金融服务有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.wx.depotbank.enums;

/**
 * @ClassName: ResponseCode
 * @version 1.0
 * @Desc: ResponseCode
 * @author xiaojun.zhou
 * @date 2018年3月22日下午2:24:27
 * @history v1.0
 */
public enum ResponseCode
{
    SUCCESS("RD000000");
    private String value;

    private ResponseCode(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
