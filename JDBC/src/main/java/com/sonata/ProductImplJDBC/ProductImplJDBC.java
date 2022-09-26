package com.sonata.ProductImplJDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sonata.productJDBC.ProductJdbc;



public class ProductImplJDBC implements ProductIntfJdbc {
	DBConnectionProd db = new DBConnectionProd();
	PreparedStatement ps = null;
	int status = 0;
	
	
	@Override
	public int addProduct(Object object) {
		ProductJdbc p = (ProductJdbc) object;
		// INSERT INTO table_name VALUES()
		try {
			ps = db.getConnection().prepareStatement("INSERT INTO product VALUES(?,?,?)");
			
			ps.setInt(1, p.getProId());
			ps.setString(2, p.getProName());
			ps.setDouble(3, p.getProPrice());
			
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record added ");
		return status;
	}
	
	
	@Override
	public int deleteProduct(Object object) {
		ProductJdbc p = (ProductJdbc) object;
		// DELETE FROM table_name WHERE condition
		try {
			ps = db.getConnection().prepareStatement("DELETE FROM product WHERE proId = ?");
			
			ps.setInt(1, p.getProId());
			
			status = ps.executeUpdate();
			db.closeConnection();
		} 
		catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record deleted ");
		return status;
	}
	@Override
	public int updateProduct(Object object) {
		ProductJdbc p = (ProductJdbc) object;
		/*	
		 * 	UPDATE table_name
		 *  SET column1 = value1, column2 = value2, ...
		 *  WHERE condition;
		 */
		try {
			ps = db.getConnection().prepareStatement("UPDATE product SET proId = ? , proName = ? WHERE  proPrice= ?");
			ps.setInt(1, p.getProId());
			ps.setString(2, p.getProName());
			ps.setDouble(3, p.getProPrice());
			
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record updated ");
		return status;
	}
	
	
	@Override
	public void displayProduct() {
		// SELECT * FROM table_name
		try {
			ps = db.getConnection().prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("proID \t proName \t proPrice");
				do {
				   System.out.println(rs.getInt("proId") + "\t\t" + rs.getString("proName") + "\t\t" + rs.getDouble("proPrice"));
				} while (rs.next());
			} else {
				System.out.println("No Records Found!!");
			}
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
	}
	public void closeStatement() {
		if (ps != null) {
			try { ps.close(); } catch (SQLException e) {e.printStackTrace();}
		}
	}
}