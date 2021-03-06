package com.amdocs.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.dao.FeedbackDao;
import com.amdocs.jdbc.Create_Connection;
import com.amdocs.model.Feedback;

public class FeedbackDaoImp implements FeedbackDao{
	Connection conn = null;
	public boolean saveFeedback(Feedback feedback) {
		String query = "insert into feedback values(?,?,?,?,?)";
		try {
			Connection conn = Create_Connection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, feedback.getUser_id());
			ps.setString(2, feedback.getName());
			ps.setString(3, feedback.getEmail());
			ps.setInt(4, feedback.getF_id());
			ps.setString(5, feedback.getFeedback());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
