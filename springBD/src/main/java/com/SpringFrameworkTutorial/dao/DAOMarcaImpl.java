package com.SpringFrameworkTutorial.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringFrameworkTutorial.beans.Marca;

@Repository
public class DAOMarcaImpl implements DAOMarca {
	@Autowired
	private DataSource dataSource;

	@Override
	public void registrar( Marca marca ) throws Exception {
		String sql = "Insert into Marca (id, nombre) values (?, ?)";
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw e;
		}
		finally {
			if( connection != null )
			{
				connection.close();
			}
		}
	}
	
}
