package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket09Controller {
	
	//Socket 09 - Sala JSON y XML
	private static final int PORT = 309;
	private static final String IP = "localhost";
	private static final String FILE_SALA_JSON = AppSettings.FILE_CLIENT + "sala.json";
	private static final String FILE_SALA_XML = AppSettings.FILE_CLIENT + "sala.xml";
	private static final String FILE_SALA_ZIP = AppSettings.FILE_CLIENT + "sala.zip";
	
	
		
	
}
