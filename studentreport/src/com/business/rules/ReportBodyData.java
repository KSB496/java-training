package com.business.rules;

import java.util.ArrayList;

public abstract class ReportBodyData {

	public ArrayList reportData;

	public ReportBodyData() {
		reportData = null;
		// TODO Auto-generated constructor stub
	}
	
	abstract protected void sortdata(int sortField,String sortOrder);
	
}
