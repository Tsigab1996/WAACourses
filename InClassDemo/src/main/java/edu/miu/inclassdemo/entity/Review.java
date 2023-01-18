package edu.miu.inclassdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Review {

    private int id;
    private String comment;
    private int numberOfStars;
}
