package com.framework.report;

import com.business.rules.FooterSectionData;
import com.business.rules.HeaderSectionData;
import com.business.rules.ReportBodyData;
import com.framework.exception.EmptyReportException;

public interface ReportGeneratorInterface {

	public void generateReport();
	public HeaderSectionData headerSectionData();
	public ReportBodyData reportBodyData() throws EmptyReportException;
	public FooterSectionData footerSectionData();
	public void writeDataToFile(HeaderSectionData header, ReportBodyData bodydata, FooterSectionData footerSectionData);
	
}
