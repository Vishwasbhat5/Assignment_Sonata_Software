package Assignments_DayOne;

public class Product {
		int proID;
		String proName;
		double proPrice;

		Product( int ID , String Name , double Price ) 
		{
			this.proID = ID;
			this.proName = Name;
			this.proPrice = Price;
		}		
	public double gstCalc (double p)
	{
		double finalPrice = proPrice + (proPrice*0.2);
		return finalPrice;
	}
	public static void main(String[] args)
	{
		Product p1 = new Product( 123 , "HP keyboard" ,1000);
		System.out.println( "ID: " + p1.proID + ", " + p1.proName);
		System.out.println("\nPrice = " + p1.proPrice + "\n" + "GST = " + (p1.proPrice*0.2) + "\nFinal Price = " + p1.gstCalc(p1.proPrice));
	}
}

