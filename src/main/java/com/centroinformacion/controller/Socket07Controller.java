package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;

import com.centroinformacion.util.AppSettings;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class Socket07Controller {
	
	//Socket 07 - Proveedor XLSX y JSON
	private static final int PORT = 307;
	private static final String IP = "localhost";
	private static final String FILE_PROVEEDOR_JSON = AppSettings.FILE_CLIENT + "proveedor.xlsx";
	private static final String FILE_PROVEEDOR_XML = AppSettings.FILE_CLIENT + "proveedor.json";
	private static final String FILE_PROVEEDOR_ZIP = AppSettings.FILE_CLIENT + "proveedor.zip";
	
	
		
	
}
