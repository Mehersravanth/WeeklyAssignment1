package com.prodapt.WA1;

public class SchoolRecords {
	
	 int schoolid;
	 String schoolname;
	 String schooladdress;
	 void ddRecords(int schoolid,String schoolname,String schooladdress) {
		 System.out.println("Add School id = " +schoolid);
		 System.out.println("Add School name = " +schoolname);
		 System.out.println("Add School Address = " +schooladdress);
	}
	 void dispRecords() {
		 System.out.println("Display School id = " +schoolid);
		 System.out.println("Display School name = " +schoolname);
		 System.out.println("Display School Address" +schooladdress);

	 }
	}
