package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket01Controller {

	// Socket 01 - Alumno JSON y XML
	private static final int PORT = 301;
	private static final String IP = "localhost";
	private static final String FILE_ALUMNO_JSON = AppSettings.FILE_CLIENT + "alumno.json";
	private static final String FILE_ALUMNO_XML = AppSettings.FILE_CLIENT + "alumno.xml";
	private static final String FILE_ALUMNO_ZIP = AppSettings.FILE_CLIENT + "alumno.zip";

}
