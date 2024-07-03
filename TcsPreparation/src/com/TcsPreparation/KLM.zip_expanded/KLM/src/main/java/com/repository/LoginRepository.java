package com.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dto.UserDTO;

@Repository
public class LoginRepository {

	
	public boolean validateLogin(UserDTO userDTO) {
		String userName = userDTO.getUserName();
		String password = userDTO.getPassword();

		Object[] input = { userName, password };
		int count=0;
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root", "root1234");
			PreparedStatement pst = connection.prepareStatement("select count(*) from users where userId=? and password=?");
			pst.setString(1, userName);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				count=rs.getInt(1);
			}
			
			System.out.println("count s"+count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (count == 0)
			return false;

		return true;

	}

}
