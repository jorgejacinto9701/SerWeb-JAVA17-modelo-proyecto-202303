package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class SocketAlumno02Controller {

	private static final int PORT = 301;
	private static final String IP = "localhost";
	private static final String FILE_ALUMNO_JSON = AppSettings.FILE_CLIENT +"alumno.json";
	private static final String FILE_ALUMNO_XLSX = AppSettings.FILE_CLIENT +"alumno.xlsx";
	private static final String FILE_ALUMNO_ZIP = AppSettings.FILE_CLIENT +"alumno.zip";
	
	
		
	
}
