package edu.miu.inclassdemo.entity.dto;

import edu.miu.inclassdemo.entity.Review;
import lombok.Data;

import java.util.List;

@Data
public class ProductDetailDto {
    private int id;
    private String name;
    private float price;

    private List<Review> reviews;
}
