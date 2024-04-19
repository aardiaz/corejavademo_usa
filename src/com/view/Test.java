package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {

	
	 public static void main(String[] args) {
		//add();
		//showAll();
		delete();
		//show products after deleted
		//showAll();
	}
	 
	 //add product
	 static void add() {
		 
		 ProductService  ps = new ProductServiceImpl();
		 Scanner sc = new Scanner(System.in);
		 char flag = 'y';
		
		do { 
			 Product  p = new Product();
			 
			 System.out.println("Enter id ");
			 p.setId(sc.nextInt());
			 
			 System.out.println("Enter name ");
			 p.setName(sc.next());
			 
			 System.out.println("Enter price ");
			 p.setPrice(sc.nextInt());
			 
			 System.out.println("Enter company ");
			 p.setCompany(sc.next());
			 
			 ps.addProduct(p);
			 
			 System.out.println("do you want to add more[y/n]");
			 flag = sc.next().charAt(0);
			 
		}while(flag == 'y');
		 
	 }
	 
	 // show all products
     static void  showAll() {

    	 ProductService  ps = new ProductServiceImpl();
    	 List<Product> plist =  ps.getAllProducts();
    	 System.out.println(plist);
     }
     
     //delete product
     static void delete() {
    	 ProductService ps = new ProductServiceImpl();
    	 ps.deleteProduct(0);
     }
}





