package com.cg.mobile.services;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDAOImpl;

public class MobileServicesImpl implements IMobileService{

	IMobileDAO imd=new MobileDAOImpl();
	
	@Override
	public int insertPurchaseDetails(PurchaseDetails pd) throws SQLException, IOException {
		// TODO Auto-generated method stub
		return imd.insertPurchaseDetails(pd);
	}

}
