package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket10Controller {
	
	//Socket 10 - Tesis  XLSX y XML
	private static final int PORT = 310;
	private static final String IP = "localhost";
	private static final String FILE_TESIS_XLSX = AppSettings.FILE_CLIENT + "tesis.xlsx";
	private static final String FILE_TESIS_XML = AppSettings.FILE_CLIENT + "tesis.xml";
	private static final String FILE_TESIS_ZIP = AppSettings.FILE_CLIENT + "tesis.zip";
	
	
		
	
}
