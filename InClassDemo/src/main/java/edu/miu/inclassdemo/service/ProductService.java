package edu.miu.inclassdemo.service;

import edu.miu.inclassdemo.entity.Product;
import edu.miu.inclassdemo.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {


    public List<Product> findAll();

    public Product getById(int id);

    public void save(Product p);

    public void delete(int id);

    public void update(int id, Product p);


    public Review getReviewByProductId(int pId, int reviewId);

    List<Product>findAllPriceGreaterThan(int price);
}
