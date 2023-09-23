package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket06Controller {
	
	//Socket 06 - Préstamo  XLSX y XML
	private static final int PORT = 306;
	private static final String IP = "localhost";
	private static final String FILE_PRESTAMO_XLSX = AppSettings.FILE_CLIENT + "prestamo.xlsx";
	private static final String FILE_PRESTAMO_XML = AppSettings.FILE_CLIENT + "prestamo.xml";
	private static final String FILE_PRESTAMO_ZIP = AppSettings.FILE_CLIENT + "prestamo.zip";
	
	
		
	
}
