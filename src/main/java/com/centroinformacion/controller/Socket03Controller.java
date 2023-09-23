package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket03Controller {
	
	//Socket 03 - Editorial JSON y XML
	private static final int PORT = 303;
	private static final String IP = "localhost";
	private static final String FILE_EDITORIAL_JSON = AppSettings.FILE_CLIENT + "editorial.json";
	private static final String FILE_EDITORIAL_XML = AppSettings.FILE_CLIENT + "editorial.xml";
	private static final String FILE_EDITORIAL_ZIP = AppSettings.FILE_CLIENT + "editorial.zip";
	
	
		
	
}
