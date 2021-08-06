package com.coffee.latte4.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Latte4Beans {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String address;
}
