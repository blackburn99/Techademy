package com.amdocs.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.dao.AdminDao;
import com.amdocs.jdbc.Create_Connection;
import com.amdocs.model.Admin;


public class AdminDaoImp implements AdminDao{
	Connection conn = null;
	public boolean saveAdmin(Admin admin) {
		String query = "insert into admin values(?,?,?,?)";
		try {
			Connection conn = Create_Connection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getPassword());
			ps.setString(4, admin.getEmail());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
