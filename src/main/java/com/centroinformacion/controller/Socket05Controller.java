package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket05Controller {

	// Socket 05 - País JSON y XML
	private static final int PORT = 305;
	private static final String IP = "localhost";
	private static final String FILE_PAIS_JSON = AppSettings.FILE_CLIENT + "pais.json";
	private static final String FILE_PAIS_XML = AppSettings.FILE_CLIENT + "pais.xml";
	private static final String FILE_PAIS_ZIP = AppSettings.FILE_CLIENT + "pais.zip";

}
