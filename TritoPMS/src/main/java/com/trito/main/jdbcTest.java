package com.trito.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcTest {
	public static void main(String[] args){
		try{
			
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/redmine", "root", "Trito114");
			
			Statement st = null;
			ResultSet rs = null;
			
			st = con.createStatement();
			rs = st.executeQuery("SHOW TABLES");
			
			if(st.execute("SHOW TABLES")){
				rs = st.getResultSet();
			}
			
			while(rs.next()){
				String str = rs.getNString(1);
				System.out.println("@@@@@@@@@@@@@@@@@@@ :: " + str);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
