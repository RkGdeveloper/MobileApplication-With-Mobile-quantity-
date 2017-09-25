package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.mobile.bean.PurchaseDetails;

public interface IMobileDAO {

	int insertPurchaseDetails(PurchaseDetails pd) throws SQLException, IOException;

}
