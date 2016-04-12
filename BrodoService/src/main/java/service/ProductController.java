package service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;

@Controller
public class ProductController {
    @CrossOrigin(origins = "file://")
    @RequestMapping("products")
    @ResponseBody
        public ProductList products() {
            ProductList productList = new ProductList();
            List<Product> list = new ArrayList<Product>();
            
            Product product1 = new Product();
            product1.setPicture("img/lion.jpg");
            product1.setName("Lion");
            product1.setPrice("$10000");
            product1.setCategory("Animal");
            product1.setDescription("King of Jungle");
            
            Product product2 = new Product();
            product2.setPicture("img/duck.jpg");
            product2.setName("Duck");
            product2.setPrice("$10");
            product2.setCategory("Animal");
            product2.setDescription("Duckling Duck");
            
            Product product3 = new Product();
            product3.setPicture("img/chicken.jpg");
            product3.setName("Chicken");
            product3.setPrice("$8");
            product3.setCategory("Animal");
            product3.setDescription("Chicken Cunk");
            
            Product product4 = new Product();
            product4.setPicture("img/monkey.jpg");
            product4.setName("Monkey");
            product4.setPrice("$200");
            product4.setCategory("Animal");
            product4.setDescription("King of Naughty");
            
            Product product5 = new Product();
            product5.setPicture("img/rose.jpg");
            product5.setName("Rose");
            product5.setPrice("$20");
            product5.setCategory("Plant");
            product5.setDescription("Red Rose");
            
            Product product6 = new Product();
            product6.setPicture("img/orchid.jpg");
            product6.setName("Orchid");
            product6.setPrice("$15");
            product6.setCategory("Plant");
            product6.setDescription("Purple Orchid");

            list.add(product1);
            list.add(product2);
            list.add(product3);
            list.add(product4);
            list.add(product5);
            list.add(product6);

            productList.setData(list);

            return productList;
        }
    
    @CrossOrigin(origins = "file://")
    @RequestMapping("cart")
    @ResponseBody
        public ProductList cart() {
            ProductList productList = new ProductList();
            List<Product> list = new ArrayList<Product>();
            
            Product product4 = new Product();
            product4.setPicture("img/monkey.jpg");
            product4.setName("Monkey");
            product4.setPrice("$200");
            product4.setCategory("Animal");
            product4.setDescription("King of Naughty");
            
            Product product5 = new Product();
            product5.setPicture("img/rose.jpg");
            product5.setName("Rose");
            product5.setPrice("$20");
            product5.setCategory("Plant");
            product5.setDescription("Red Rose");
            
            list.add(product4);
            list.add(product5);

            productList.setData(list);

            return productList;
        }
}


