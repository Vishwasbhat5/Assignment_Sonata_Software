package com.sonata.ProdTestJDBC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sonata.ProductImplJDBC.productImplJdbc;
import com.sonata.productJDBC.ProductJdbc;

public class ProdTestJdbc 
{
	ProductJdbc p1 = new ProductJdbc();
	productImplJdbc p2 = new productImplJdbc();
	

	@Test
	public void DAO_test_positive() 
	{
		p1.setProId(108);
		p1.setProPrice(345.98);
		p1.setProName("flour");
		 int row = p2.save(p1);
		assertEquals(1,row);
	
	}
	
	@Test
	public void DAO_test_negative() 
	{
		p1.setProId(108);
		p1.setProPrice(345.98);
		p1.setProName("flour");
		int row = p2.save(p1);
		assertEquals(0,row);
	
	}

}
