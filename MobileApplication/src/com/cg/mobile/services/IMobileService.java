package com.cg.mobile.services;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.mobile.bean.PurchaseDetails;

public interface IMobileService {
	
	public int insertPurchaseDetails(PurchaseDetails pd) throws SQLException, IOException;
	
}
