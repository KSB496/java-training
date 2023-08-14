package com.business.data;

import java.util.ArrayList;
import java.util.Collections;

import com.business.rules.ReportBodyData;

public class StudentData extends ReportBodyData {

	public static final int NAME=1;
	public static final int TOTAL=2;
	
	public static final String ASC="A";
	public static final String DES="A";
	
	public StudentData() {
		StudentDAO dao = new StudentDAO();
		reportData = (ArrayList)dao.fetchdata();
	}
	
	@Override
	public void sortdata(int sortField, String sortOrder) {
		// TODO Auto-generated method stub
		switch(sortField) {
			case 1:
				if(sortOrder.equals(ASC))
				{
					NameAsc namesort = new NameAsc();
					Collections.sort(reportData,namesort);
				}
				else if(sortOrder.equals(DES)) {
					NameDesc namesort = new NameDesc();
					Collections.sort(reportData,namesort);
				}
			case 2:
				if(sortOrder.equals(ASC))
				{
					TotalAsc asc = new TotalAsc();
					Collections.sort(reportData,asc);
				}
				else if(sortOrder.equals(DES)) 
				{
					TotalDesc desc = new TotalDesc();
					Collections.sort(reportData,desc);
				}
	}
	}

}
