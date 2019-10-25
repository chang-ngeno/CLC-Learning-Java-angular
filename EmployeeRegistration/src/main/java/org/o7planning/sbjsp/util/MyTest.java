package org.o7planning.sbjsp.util;

public class MyTest {
	public static void main(String[] args) {

		DBUtil dbUtil= new DBUtil();
		//dbUtil.readProps();
		dbUtil.getConnection();
		dbUtil.closeConnection();
		
	}
}