package com.niit.E_commerce_backend1;

//import org.hibernate.Hibernate;


import org.springframework.context.ApplicationContext;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Hibernate_config;
import com.dao.ProductDaoImpl;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello World !");
    	  ApplicationContext context=new AnnotationConfigApplicationContext
    			  (Hibernate_config.class,ProductDaoImpl.class);
    	//  ProductService productService=(ProductService)context.getBean("productServiceImpl");
    	  
    	  
    	/*  Product product=new Product();
    	  product.setName("Titian Raga");
    	  product.setPrice(3000);
    	  product.setQuantity(20);
    	  product.setDescription("Titan Raga Mother of Pearl Dial Analog Watch for Women");*/
    	  
    	  // productService.saveProduct(product);
       
    }
}
