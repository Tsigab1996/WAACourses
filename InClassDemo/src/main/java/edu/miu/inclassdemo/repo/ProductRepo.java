package edu.miu.inclassdemo.repo;

import edu.miu.inclassdemo.entity.Product;
import edu.miu.inclassdemo.entity.Review;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo {
    public List<Product> findAll();

    public Product getById(int id);

    public void save(Product p);

    public void delete(int id);

    public void update(int id, Product p);


    public Review getReviewByProductId(int pId, int reviewId);

    List<Product>findAllPriceGreaterThan(int price);
}
