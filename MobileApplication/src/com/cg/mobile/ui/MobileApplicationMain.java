package com.cg.mobile.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.mobile.bean.PurchaseDetails;
import com.cg.mobile.services.IMobileService;
import com.cg.mobile.services.MobileServicesImpl;

public class MobileApplicationMain {

	
	public static void main(String[] args) throws IOException, SQLException {
		
	//DbUtil.getConnection();
		
		
		PurchaseDetails pd = new PurchaseDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FName");
		pd.setfName(sc.nextLine());
		System.out.println("Enter LName");
		pd.setlName(sc.nextLine());
		System.out.println("Enter Mobile Id");
		pd.setMobile_id(sc.nextInt());
		IMobileService ims = new MobileServicesImpl();
		int res = ims.insertPurchaseDetails(pd);
		System.out.println(res+" rows inserted");
	}
}
