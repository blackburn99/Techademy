package com.amdocs.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.dao.CourseDao;
import com.amdocs.jdbc.Create_Connection;
import com.amdocs.model.Course;

public class CourseDaoImp implements CourseDao{
	Connection conn = null;
	public boolean saveCourse(Course course) {
		String query = "insert into course values(?,?,?,?,?)";
		try {
			Connection conn = Create_Connection.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, course.getCourse_id());
			ps.setString(2, course.getC_name());
			ps.setDouble(3, course.getC_fees());
			ps.setString(4, course.getC_desp());
			ps.setString(5, course.getC_resource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}
