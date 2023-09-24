package com.centroinformacion.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.centroinformacion.entity.Pais;
import com.centroinformacion.service.PaisService;
import com.centroinformacion.util.AppSettings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.extern.apachecommons.CommonsLog;

@Controller
@CommonsLog
public class SocketEjemploController {

	private static final int PORT = 300;
	private static final String IP = "localhost";
	private static final String FILE_PAIS_JSON = AppSettings.FILE_CLIENT +"pais.json";
	
	
	@Autowired
	private PaisService paisService;
	
	ServerSocket servidor = null;
	
	@PostMapping("/socketClientStart")
	@ResponseBody
	public Map<?, ?> socketClientStart() {	
		log.info(">>> [ini] socketClientStart ");
		HashMap<String, String> map = new HashMap<String, String>();
		
		File fileRutaCliente = new File(AppSettings.FILE_CLIENT);
		File fileRutaServer = new File(AppSettings.FILE_SERVER);
		try {
			if (!fileRutaCliente.exists()) fileRutaCliente.mkdirs();
			if (!fileRutaServer.exists()) fileRutaServer.mkdirs();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			//1 Se genera el archivo pais json
			List<Pais> lstPais = paisService.listaTodos();
			FileWriter fileGenerator = null;
			try {
				fileGenerator = new FileWriter(FILE_PAIS_JSON);
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				gson.toJson(lstPais, fileGenerator);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fileGenerator.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			

			Socket cliente = new Socket(IP, PORT);

			// 2 Se envía del nombre del archivo
			ObjectOutputStream ous = new ObjectOutputStream(cliente.getOutputStream());
			
			File fileInicio = new File(FILE_PAIS_JSON);
			String fileName = fileInicio.getName();
			log.info(">>> [ini] socketClientStart >>> fileName >>> " + fileName);
			ous.writeObject(fileName);

			
			// 3 Se envía de los paquetes de bytes del archivo
			
			File file = new File(FILE_PAIS_JSON);
			FileInputStream fis = new FileInputStream(file);
			DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
			
			int byteLeidos;
			while( (byteLeidos = fis.read()) != -1) {
				salida.write(byteLeidos);
			}
			
			fis.close();
			salida.close();
			cliente.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		map.put("MENSAJE", "Registro exitoso");
		log.info(">>> [fin] socketClientStart ");
		return map; 
	}
	
	@PostMapping("/socketServerStart")
	@ResponseBody
	public Map<?, ?> socketServerStart() {	
		log.info(">>> [ini] socketServerStart ");
		HashMap<String, String> map = new HashMap<String, String>();
		
		Socket cliente = null;
		try {
			servidor = new ServerSocket(PORT);
			while (true) {
				cliente = servidor.accept();

				// 1 Se Recibe del nombre del archivo
				ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());

				String fileName = (String)ois.readObject();
				log.info(">>> [ini] socketServerStart >>> fileName >>> " + fileName);
				
				// 2 Se Recibe los bytes del archivo
				File fileDestino = new File(AppSettings.FILE_SERVER +fileName);
				FileOutputStream fos = new FileOutputStream(fileDestino);
				DataInputStream entrada = new DataInputStream(cliente.getInputStream());
				
				int byteLeidos;
				while( (byteLeidos = entrada.read()) != -1) {
					fos.write(byteLeidos);
				}
				
				fos.close();
				entrada.close();
				cliente.close();
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		map.put("MENSAJE", "Registro exitoso");
		log.info(">>> [fin] socketServerStart ");
		return map; 
	}

	@PostMapping("/socketServerStop")
	@ResponseBody
	public Map<?, ?> socketServerStop() {	
		log.info(">>> [ini] socketServerStop ");
		HashMap<String, String> map = new HashMap<String, String>();
		
		try {
			if (servidor != null) {
				servidor.close();	
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		map.put("MENSAJE", "Registro exitoso");
		log.info(">>> [fin] socketServerStop ");
		return map; 
	}
	
	
	
}
