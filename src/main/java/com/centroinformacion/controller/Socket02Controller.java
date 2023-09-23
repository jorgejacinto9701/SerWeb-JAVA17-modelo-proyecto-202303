package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket02Controller {
	
	//Socket 02 - Autor XLSX y JSON
	private static final int PORT = 302;
	private static final String IP = "localhost";
	private static final String FILE_AUTOR_JSON = AppSettings.FILE_CLIENT + "autor.json";
	private static final String FILE_AUTOR_XML = AppSettings.FILE_CLIENT + "autor.xml";
	private static final String FILE_AUTOR_ZIP = AppSettings.FILE_CLIENT + "autor.zip";
	
	
		
	
}
