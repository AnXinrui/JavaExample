package com.axr.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author xinrui.an
 * @date 2025/03/11
 */
@Data
@AllArgsConstructor
public class ExampleModel {

    private Integer customsType;
    /**
     * 价格
     */
    private BigDecimal price;
}
