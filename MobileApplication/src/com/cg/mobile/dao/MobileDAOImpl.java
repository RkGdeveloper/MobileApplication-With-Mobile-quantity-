package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.dbconfig.DbUtil;

public class MobileDAOImpl implements IMobileDAO{

	@Override
	public int insertPurchaseDetails(PurchaseDetails pd) throws SQLException, IOException {
		Connection con = DbUtil.getConnection();
		String sql = "Insert into purchasedetails values(p_seq_id.nextval,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, pd.getfName());
		pst.setString(2,pd.getlName());
		pst.setInt(3, pd.getMobile_id());
		int res = pst.executeUpdate();
		
		
		String s ="Update mobile set quantity = quantity - 1 where mobile_id = ?";
		PreparedStatement ps = con.prepareStatement(s);
		ps.setInt(1, pd.getMobile_id());
		int up = ps.executeUpdate();
		
		System.out.println("Mobile Table is updated");
		
		
		return res;
	}

}
