package AssignmentDayThree_ScndQ;
import java.util.LinkedList;
import java.util.List;
public class Prod_List {
	public List<Product>addproducts(){
		List<Product> prd=new LinkedList<Product>();
		prd.add(new Product(101,"Pen",-1));
		prd.add(new Product(102,"Pencil",350));
		prd.add(new Product (103,"Eraser",550));
		prd.add( new Product(104,"writing pad",660));
		prd.add(new Product(105,"A4 paper",230));
		return prd;
	}


}
