package com.sonata.productJdbcApp;

	
import com.sonata.ProductImplJDBC.ProductImplJDBC;
import com.sonata.productJDBC.ProductJdbc;


	public class ProdApp {
		public static void main(String[] args) {
			ProductJdbc p1 = new ProductJdbc();
			ProductJdbc p2 = new ProductJdbc();
			ProductJdbc p3 = new ProductJdbc();
			ProductJdbc p4 = new ProductJdbc();
			// ProductJdbc - 1
			p1.setProId(1);
			p1.setProName("Chocolate");
			p1.setProPrice(50.00);
			// ProductJdbc - 2
			p2.setProId(2);
			p2.setProName("Phone");
			p2.setProPrice(50000.00);
			// ProductJdbc - 3
			p3.setProId(3);
			p3.setProName("table");
			p3.setProPrice(25000.00);
			// ProductJdbc - 2 Update
			p4.setProId(4);
			p4.setProName("T-Shirt");
			p4.setProPrice(5000.00);
			
			ProductImplJDBC pImpl = new ProductImplJDBC();
			
			// Adding Products to Database
			System.out.println(pImpl.addProduct(p1));
			System.out.println(pImpl.addProduct(p2));
			System.out.println(pImpl.addProduct(p3));
			System.out.println(pImpl.addProduct(p4));
			pImpl.displayProduct();	// Display 'product' Table
			System.out.println("\n");
			
			// Deleting ProductJdbc - 1
			System.out.println(pImpl.deleteProduct(p1));
			pImpl.displayProduct();	// Display 'product' Table
			System.out.println("\n");
			
			// Updating ProductJdbc - 2
			System.out.println(pImpl.updateProduct(p4));
			pImpl.displayProduct();	// Display 'product' Table
			System.out.println("\n");
		}
    }