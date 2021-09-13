package edu.java.training.chapter13;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLRequestor {

	public void SelectInformation(String sql) {
		try (Connection connection = ConnectionCreator.createConnection();
				Statement statement = connection.createStatement()) {
			ResultSet result = statement.executeQuery(sql);
			ResultSetMetaData rsmd = result.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (result.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1)
						System.out.print(" | ");
					String columnValue = result.getString(i);
					System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
				}
				System.out.println("");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
