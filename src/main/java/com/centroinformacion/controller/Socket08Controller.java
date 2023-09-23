package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket08Controller {
	
	//Socket 08 - Revista JSON y XML
	private static final int PORT = 308;
	private static final String IP = "localhost";
	private static final String FILE_REVISTA_JSON = AppSettings.FILE_CLIENT + "revista.json";
	private static final String FILE_REVISTA_XML = AppSettings.FILE_CLIENT + "revista.xml";
	private static final String FILE_REVISTA_ZIP = AppSettings.FILE_CLIENT + "revista.zip";
	
	
		
	
}
