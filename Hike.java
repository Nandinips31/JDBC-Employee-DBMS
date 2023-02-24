package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hike {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from infosysemp where sal>50000");
			while(resultSet.next())
			{
				System.out.println("Eid : "+resultSet.getInt(1));
				System.out.println("Ename  :"+resultSet.getString(2));
				System.out.println("Age : "+resultSet.getInt(3));
				System.out.println("Gender : "+resultSet.getString(4));
				System.out.println("PhoneNumber : "+resultSet.getString(5));
				System.out.println("Designation : "+resultSet.getString(6));
				System.out.println("Salary : "+resultSet.getInt(7));
				System.out.println("*******************************");
				
			}
			
			connection.close();
			System.out.println("Data hikeed");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
