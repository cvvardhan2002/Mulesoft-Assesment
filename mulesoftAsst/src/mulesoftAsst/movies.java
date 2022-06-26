package mulesoftAsst;

import java.sql.*;
import java.sql.Connection;
import java.util.*;

public class movies {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:mulesoftAsst.db");
			System.out.println("The Database Connection has opened.");
			Statement st=con.createStatement();
			st.executeUpdate("create table movieData(movieName varchar(20),actor varchar(20),actress varchar(20),release varchar(10),director varchar(20))");
			System.out.println("Table Created");
			
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Avatar','sam','zeo','2009','James Cameron')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Martian','mat','Mackenzie','2015','Ridley Scott')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Oblivion','tom cruise','olga','2013','Joseph Kosinski')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Ghost Rider','Nicolas','eva mendes','2007','Mark Steven')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Daredevil','Ben','jennifer','2003','Steven Johnson')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Inception','Leonardo','Marion','2010','Christopher Nolan')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Joker','Joaquin Phoenix','Zazie','2019','Todd Phillips')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('The Matrix','Keanu Reeves','Carrie Anne','1999','Lana')");
			st.executeUpdate("INSERT INTO movieData (movieName,actor,actress,release,director) VALUES ('Titanic','leonardo','kate','1997','james cameron')");

			
			
			ResultSet rs = st.executeQuery("select * from movieData");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" : " +(rs.getString(2)+" : "+rs.getString(3)+" : "+ rs.getString(4)+" : "+rs.getString(5)));
			}
			
			con.close();
			System.out.println("The Connection is now closed.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
