package Assignments_DayOne;

public class Tshirts

	 {
		String color;
		String material;
		String design;

		Tshirts ( String color , String material , String design )
		{
			this.color = color;
			this.material = material;
			this.design = design;
		}
		
		
		public static void main(String[] args) {	
			
			Tshirts[] small = new Tshirts[3];
			small[0] = new Tshirts( "White" , "Wool" , "DC:Superman" );
			small[1] = new Tshirts( "Red" , "Nylon" , "Michael Jordon" );
			small[2] = new Tshirts( "Blue" , "Denim" , "Plain" );
			System.out.println("\nS size\n");
			for (int i = 0; i < small.length; i++)
			{
			System.out.println("Color: " + small[i].color + "\nMaterial: " + small[i].material + "\nDesign: " + small[i].design + "\n");		
			}
			
			
			Tshirts[] large = new Tshirts[3];
			large[0] = new Tshirts( "White" , "Wool" , "DC:Superman" );
			large[1] = new Tshirts( "Red" , "Nylon" , "Michael Jordon" );
			large[2] = new Tshirts( "Blue" , "Denim" , "Plain" );	
			System.out.println("\nL size\n");	
			for (int i = 0; i < large.length; i++) {
			System.out.println("Color: " + large[i].color + "\nMaterial: " + large[i].material + "\nDesign: " + large[i].design + "\n");		
			}
			
			Tshirts[] xLarge = new Tshirts[3];
			xLarge[0] = new Tshirts( "White" , "Wool" , "DC:Superman" );
			xLarge[1] = new Tshirts( "Red" , "Nylon" , "Michael Jordon" );
			xLarge[2] = new Tshirts( "Red" , "Nylon" , "Michael Jordon" );		
			System.out.println("\nXL size\n");	
			for (int i = 0; i < small.length; i++) {
			System.out.println("Color: " + xLarge[i].color + "\nMaterial: " + xLarge[i].material + "\nDesign: " + xLarge[i].design + "\n");		
			}
		}
		}

