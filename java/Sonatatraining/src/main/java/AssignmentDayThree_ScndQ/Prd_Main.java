package AssignmentDayThree_ScndQ;

import java.util.List;
public class Prd_Main {
	public List<Product>sortprice()throws Prd_Excp{
		List<Product> prd =new Prod_List().addproducts();
		prd.sort((Product p1,Product p2)->p1.getPrdPrice()-p2.getPrdPrice());
		return prd;
	}
	public static void myException(Product p1)throws Prd_Excp {
	
		if(p1.prdPrice<0)
			throw new Prd_Excp("Value is less than 0");
		else
			System.out.println("Price is good");
		
	}
		public static void main(String args[])throws Prd_Excp {
			System.out.println(new Prd_Main().sortprice());
			
		}
}
