package AssignmnetDay3_2ndQuestion;

public class Address_Emp 
{
	int DoorNo,PinCode;
	String street,city;
	Address_Emp () {}
	Address_Emp (int drn , String strt , String cty , int pcode) {
		this.DoorNo = drn;
		this.street = strt;
		this.city = cty;
		this.PinCode = pcode;
	}
	public String toString() {
		return DoorNo+", "+street+", "+city+" - "+PinCode;
	}
}