package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.ConnectionApp;

public class TransactionsDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionApp.appConn();
		String insert = "insert into employee values(?,?,?)";
		PreparedStatement pst = conn.prepareStatement(insert);
		conn.setAutoCommit(false);
		pst.setInt(1, 11);
		pst.setString(2, "kk");
		pst.setString(3, "NY");
		pst.addBatch();
		pst.setInt(1, 22);
		pst.setString(2, "ss");
		pst.setString(3, "PA");
		pst.addBatch();
		pst.setInt(1, 33);
		pst.setString(2, "bb");
		pst.setString(3, "CL");
		pst.addBatch();
		int tc[] = pst.executeBatch();
		if(tc.length > 0) {
			conn.commit();
		}
	}
}
