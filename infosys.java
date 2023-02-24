package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class infosys {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring", "root", "root");
			Statement statement=connection.createStatement();
			statement.execute("insert into infosysemp values(101,'Nandini',23,'Female',9876543123,'Teacher',15000)");
			statement.execute("insert into infosysemp values(102,'Divya',45,'Female',9876544980,'Coacher',25000)");
			statement.execute("insert into infosysemp values(103,'Pooja',67,'Female',9876388490,'Associate',35000)");
			statement.execute("insert into infosysemp values(104,'Kavya',22,'Female',9876556409,'Senioesoftwareengineer',65000)");
			statement.execute("insert into infosysemp values(105,'Shubha',76,'Female',9876383456,'TeamLead',45000)");
			statement.execute("insert into infosysemp values(106,'Vyshu',45,'Female',8874323454,'specialist',55000)");
			statement.execute("insert into infosysemp values(107,'Karan',56,'male',9912862234,'Tracker',33000)");
			statement.execute("insert into infosysemp values(108,'Ram',23,'male',9976593460,'Player',39000)");
			statement.execute("insert into infosysemp values(109,'Nandan',20,'male',9876593492,'Senioesoftwareengineer',67000)");
			statement.execute("insert into infosysemp values(110,'Josh',28,'male',9871223453,'Gainer',95000)");
			connection.close();
			System.out.println("Data Inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
