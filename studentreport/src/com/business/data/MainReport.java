package com.business.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import com.business.rules.FooterSectionData;
import com.business.rules.HeaderSectionData;
import com.business.rules.ReportBodyData;
import com.framework.exception.UnableToSaveReportException;

public class MainReport {

	public static void main(String[] args) {
		MainReport mr = new MainReport();
		mr.generateReport();
		System.out.println("Report Generated");
	}
	
	public void generateReport() {
		try {
			HeaderSectionData hsd = fetchHeader();
			ReportBodyData rbd = fetchReportBody();
			FooterSectionData fsd = fetchFooter();
			writeDataToFile(hsd, rbd, fsd);
		}catch(Exception e) { 
			
		}
	}
	
	public HeaderSectionData fetchHeader() {
		HeaderSectionData headerSectionData = new HeaderSectionData();
		
		headerSectionData.HeaderMsg="R.NO\tName\tMath\tPhysics\tChemistry\tComScience\tTotal";
		return headerSectionData;
	}

	public ReportBodyData fetchReportBody() {
		StudentData stuData = new StudentData();
		int sortField = 2;
		String sortOrder = "D";
		stuData.sortdata(sortField, sortOrder);
		ReportBodyData reportBody = stuData;
		return reportBody;
	}
	
	public FooterSectionData fetchFooter() {
		FooterSectionData footerSectionData = new FooterSectionData();
		
		footerSectionData.footerMsg="Reports ends here";
		return footerSectionData;
	}
	
	public void writeDataToFile(HeaderSectionData hs, ReportBodyData rd, FooterSectionData fs) throws UnableToSaveReportException {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("studentreport.doc")));
			writer.write(hs.HeaderMsg);
			writer.write("\n");
			Student s = null;
			ArrayList<Student> list = rd.reportData;
			for(int i=0;i<list.size();i++) {
				s = (Student)list.get(i);
				writer.write(s.toString()+ "\n");
			}
			writer.write(fs.footerMsg);
			writer.close();
		}catch(Exception e) { }
	}
}
