package edu.miu.inclassdemo.repo;

import edu.miu.inclassdemo.entity.Product;
import edu.miu.inclassdemo.entity.Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepoImp implements ProductRepo{
    private static List<Product> products;
    static {
      products = new ArrayList<>();
        Review r1a = new Review(123,"I love it",5);
        Review r1b = new Review(145,"It is ordinary",4);
        List<Review> reviews1 = Arrays.asList(r1a,r1b);
        Review r2a = new Review(223,"Not that good",3);
        Review r2b = new Review(245,"It does the job",4);
        List<Review> reviews2 = Arrays.asList(r2a,r2b);
        Product p1 = new Product(111,"iPhone13",1100,reviews1);
        Product p2 = new Product(112,"galaxy",1050,reviews2);
        products.add(p1);
        products.add(p2);
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        return products.stream().filter(p->p.getId()==(id)).findFirst().get();
    }

    @Override
    public void save(Product p) {
        products.add(p);
    }

    @Override
    public void delete(int id) {
     var product= products.stream().filter(p->p.getId()==id).findFirst().get();
      products.remove(product);
      //Another way of removing an element from it.
      //  products.removeIf(t->t.getId()==id);
    }

    @Override
    public void update(int id, Product p) {
        for (int i=0; i<products.size(); i++){
            Product t= products.get(i);
            if(t.getId()==id){
                products.set(i, p);
                return;
            }
        }

    }

    @Override
    public Review getReviewByProductId(int pId, int reviewId) {
        var product= getById(pId);
        return product.getReviews().stream().filter(r->r.getId()==reviewId).findFirst().orElse(null);
    }

    @Override
    public List<Product> findAllPriceGreaterThan(int price) {
       return products.stream().filter(p->p.getPrice()>=price).collect(Collectors.toList());
    }
}
