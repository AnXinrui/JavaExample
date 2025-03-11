package com.axr.example.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author xinrui.an
 * @date 2025/02/26
 */
@Getter
@Setter
public class User {
    private String name;

    private List<Integer> scores;
}
