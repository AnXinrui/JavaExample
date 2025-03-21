package com.axr.example.enums;

import lombok.Getter;

/**
 * @author xinrui.an
 * @date 2025/03/11
 */
@Getter
public enum ExampleEnum {
    /**
     * 保税区进区报关费
     */
    ENTER_CUSTOMS(1, "保税区进区报关费", 1),
    /**
     * 境外存储货物保税区出区报关费
     */
    CUSTOMS_GOODS(2, "境外存储货物保税区出区报关费", 2),
    /**
     * 非境外存储货物保税区出区报关费
     */
    NON_CUSTOMS_GOODS(3, "非境外存储货物保税区出区报关费", 5),
    /**
     * 境外存储货物保税区出区报关费-出境
     */
    CUSTOMS_GOODS_EXIT(4, "境外存储货物保税区出区报关费-出境", 3),

    /**
     * 境外存储货物保税区出区报关费-入境
     */
    CUSTOMS_GOODS_ENTRY(5, "境外存储货物保税区出区报关费-入境", 4),

    /**
     * 非境外存储货物保税区出区报关费-出境
     */
    NON_CUSTOMS_GOODS_EXIT(6, "非境外存储货物保税区出区报关费-出境", 6),

    /**
     * 非境外存储货物保税区出区报关费-入境
     */
    NON_CUSTOMS_GOODS_ENTRY(7, "非境外存储货物保税区出区报关费-入境", 7);


    /**
     * 报关费用价格类型
     */
    private final Integer customsType;

    /**
     * 名称
     */
    private final String name;

    /**
     * 顺序
     */
    private final Integer order;

    ExampleEnum(Integer customsType, String name, Integer order) {
        this.customsType = customsType;
        this.name = name;
        this.order = order;
    }

    public static Integer getOrder(Integer customsType) {
        for (ExampleEnum value : ExampleEnum.values()) {
            if (value.getCustomsType().equals(customsType)) {
                return value.getOrder();
            }
        }
        return null;
    }
}
