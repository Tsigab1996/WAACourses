package edu.miu.inclassdemo.service;

import edu.miu.inclassdemo.entity.Product;
import edu.miu.inclassdemo.entity.Review;
import edu.miu.inclassdemo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProudctServiceImp implements ProductService{


    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepo.getById(id);
    }

    @Override
    public void save(Product p) {
      productRepo.save(p);
    }

    @Override
    public void delete(int id) {
       productRepo.delete(id);
    }

    @Override
    public void update(int id, Product p) {
       productRepo.update(id, p);
    }

    @Override
    public Review getReviewByProductId(int pId, int reviewId) {
        return productRepo.getReviewByProductId(pId, reviewId);
    }

    @Override
    public List<Product> findAllPriceGreaterThan(int price) {
        return productRepo.findAllPriceGreaterThan(price);
    }
}
