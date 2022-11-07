package com.singtel.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Clownfish extends Fish {
    final String color = "Rainbow";
    final String size = "Small";
}
