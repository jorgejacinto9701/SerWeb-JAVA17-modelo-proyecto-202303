package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket04Controller {
	
	//Socket 04 - Libro  XLSX y JSON
	private static final int PORT = 304;
	private static final String IP = "localhost";
	private static final String FILE_LIBRO_XLSX = AppSettings.FILE_CLIENT + "libro.xlsx";
	private static final String FILE_LIBRO_JSON = AppSettings.FILE_CLIENT + "libro.json";
	private static final String FILE_LIBRO_ZIP = AppSettings.FILE_CLIENT + "libro.zip";
	
	
		
	
}
