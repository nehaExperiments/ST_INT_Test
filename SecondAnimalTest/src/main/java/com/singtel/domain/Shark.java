package com.singtel.domain;

import com.singtel.behaviour.sound.ISound;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class Shark extends Fish {
    final String color = "Grey";
    final String size = "Large";

}
