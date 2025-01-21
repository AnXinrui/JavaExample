package com.axr.example.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author xinrui.an
 * @date 2025/01/08
 */
@Data
@Builder
@AllArgsConstructor
public class Result <T> {
    private int code;
    private String message;
    private T data;

    public static <T> Result<T> success(T data) {
        return Result.<T>builder().code(200).message("success").data(data).build();
    }
}
