package com.hexin.enums;

import java.text.MessageFormat;

/**
 * @param
 * @return
 * @description Enums模板
 * @author: xiaoying@hexindai.com V1.0 2017/11/29 14:50
 */
public enum TemplateEnum {
    ;

    private int index;

    private int code;

    private String desc;

    TemplateEnum(int index, int code, String desc) {

        this.index = index;
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public int getCode() {
        return code;
    }

    public int getIndex() {
        return index;
    }

    /**
     * @param
     * @return
     * @description 通过状态码返回实例对象
     * @author: xiaoying@hexindai.com V1.0 2017/10/30 11:00
     */
    public static TemplateEnum getEnum(int index) {
        for (TemplateEnum templateEnum : values()) {
            if (templateEnum.getIndex() == index) {
                return templateEnum;
            }
        }
        return null;
    }

    /**
     * @Author: huey获得完整信息
     * <p>@Description: 替换占位符 this {0} hueytest new String[]{"is"} 会返回 this is hueytest</p>
     * @Date: 17:38 2017/8/4
     */
    public static String getFullMsg(TemplateEnum templateEnum, Object... args) {
        return MessageFormat.format(templateEnum.getDesc(), args);
    }
}
