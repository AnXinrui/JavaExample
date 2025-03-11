package com.axr.example.enums;

import com.axr.example.model.ExampleModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author xinrui.an
 * @date 2025/03/11
 */
public class EnumSort {
    public static void main(String[] args) {
        List<ExampleModel> list = new ArrayList<ExampleModel>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(7) + 1;
            list.add(new ExampleModel(randomNumber, null));
        }
        list.sort((o1, o2) -> {
            Integer v1 = ExampleEnum.getOrder(o1.getCustomsType());
            Integer v2 = ExampleEnum.getOrder(o2.getCustomsType());
            return v1.compareTo(v2);
        });
        for (ExampleModel exampleModel : list) {
            System.out.println(exampleModel.getCustomsType());
        }
    }
}
