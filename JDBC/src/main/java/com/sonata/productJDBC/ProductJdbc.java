package com.sonata.productJDBC;

public class ProductJdbc {
    private int proId;
    private String proName;	
    private double proPrice;
    
    public ProductJdbc() {}	
    public ProductJdbc(int proId, String proName, double proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
	}
	
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productID=" + proId + ", productName=" + proName + ", productPrice=" + proPrice
				+ "]";
}
}