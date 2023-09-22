package com.centroinformacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EnlaceController {

	//Login
	@GetMapping("/")
	public String verLogin() {	return "intranetLogin";  }
	
	@GetMapping("/verIntranetHome")
	public String verIntranetHome() {	return "intranetHome";  }

	//Registro
	@GetMapping("/verRegistroAlumno")
	public String verRegistroAlumno() {	return "intranetRegistroAlumno";	}

	@GetMapping("/verRegistroLibro")
	public String verRegistroLibro() {	return "intranetRegistroLibro";	}

	@GetMapping("/verRegistroTesis")
	public String verRegistroTesis() {	return "intranetRegistroTesis";	}

	@GetMapping("/verRegistroAutor")
	public String verRegistroAutor() {	return "intranetRegistroAutor";	}

	@GetMapping("/verRegistroSala")
	public String verRegistroSala() {	return "intranetRegistroSala";	}

	@GetMapping("/verRegistroProveedor")
	public String verRegistroProveedor() {	return "intranetRegistroProveedor";	}

	@GetMapping("/verRegistroEditorial")
	public String verRegistroEditorial() {	return "intranetRegistroEditorial";	}

	@GetMapping("/verRegistroRevista")
	public String verRegistroRevista() {	return "intranetRegistroRevista";	}	

	@GetMapping("/verRegistroEjemplo")
	public String verRegistroEjemplo() {	return "intranetRegistroEjemplo";	}
	
	//Crud
	@GetMapping("/verCrudAlumno")
	public String verCrudAlumno() {	return "intranetCrudAlumno";	}

	@GetMapping("/verCrudLibro")
	public String verCrudLibro() {	return "intranetCrudLibro";	}

	@GetMapping("/verCrudTesis")
	public String verCrudTesis() {	return "intranetCrudTesis";	}

	@GetMapping("/verCrudAutor")
	public String verCrudAutor() {	return "intranetCrudAutor";	}

	@GetMapping("/verCrudSala")
	public String verCrudSala() {	return "intranetCrudSala";	}

	@GetMapping("/verCrudProveedor")
	public String verCrudProveedor() {	return "intranetCrudProveedor";	}

	@GetMapping("/verCrudEditorial")
	public String verCrudEditorial() {	return "intranetCrudEditorial";	}

	@GetMapping("/verCrudRevista")
	public String verCrudRevista() {	return "intranetCrudRevista";	}	
	
	//Consulta
	@GetMapping("/verConsultaAlumno")
	public String verConsultaAlumno() {	return "intranetConsultaAlumno";	}

	@GetMapping("/verConsultaLibro")
	public String verConsultaLibro() {	return "intranetConsultaLibro";	}

	@GetMapping("/verConsultaTesis")
	public String verConsultaTesis() {	return "intranetConsultaTesis";	}

	@GetMapping("/verConsultaAutor")
	public String verConsultaAutor() {	return "intranetConsultaAutor";	}

	@GetMapping("/verConsultaSala")
	public String verConsultaSala() {	return "intranetConsultaSala";	}

	@GetMapping("/verConsultaProveedor")
	public String verConsultaProveedor() {	return "intranetConsultaProveedor";	}

	@GetMapping("/verConsultaEditorial")
	public String verConsultaEditorial() {	return "intranetConsultaEditorial";	}

	@GetMapping("/verConsultaRevista")
	public String verConsultaRevista() {	return "intranetConsultaRevista";	}	
	
	//Transaccion
	@GetMapping("/VerAsignacionRol")
	public String VerAsignacionRol() {	return "intranetTransaccionAsignacionRol";	}

	@GetMapping("/VerAsignacionOpcion")
	public String VerAsignacionOpcion() {	return "intranetTransaccionAsignacionOpcion";	}

	@GetMapping("/VerAsignacionLibro")
	public String VerAsignacionLibro() {	return "intranetTransaccionAsignacionLibro";	}

	@GetMapping("/verPrestamoLibro")
	public String verPrestamoLibro() {	return "intranetTransaccionPrestamoLibro";	}

	@GetMapping("/verDevolucionLibro")
	public String verDevolucionLibro() {	return "intranetTransaccionDevolucionLibro";	}

	@GetMapping("/verReservaSala")
	public String verReservaSala() {	return "intranetTransaccionReservaSala";	}

	@GetMapping("/verReporteLibro")
	public String verReporteLibro() {	return "intranetTransaccionReporteLibro";	}

	@GetMapping("/verReporteSala")
	public String verReporteSala() {	return "intranetTransaccionReporteSala";	}	
	
	//Socket
	@GetMapping("/verSocketAlumno01")
	public String verSocketAlumno01() {	return "intranetSocketAlumno01";	}

	@GetMapping("/verSocketAlumno02")
	public String verSocketAlumno02() {	return "intranetSocketAlumno02";	}

	@GetMapping("/verSocketAlumno03")
	public String verSocketAlumno03() {	return "intranetSocketAlumno03";	}

	@GetMapping("/verSocketAlumno04")
	public String verSocketAlumno04() {	return "intranetSocketAlumno04";	}

	@GetMapping("/verSocketAlumno05")
	public String verSocketAlumno05() {	return "intranetSocketAlumno05";	}

	@GetMapping("/verSocketAlumno06")
	public String verSocketAlumno06() {	return "intranetSocketAlumno06";	}

	@GetMapping("/verSocketAlumno07")
	public String verSocketAlumno07() {	return "intranetSocketAlumno07";	}

	@GetMapping("/verSocketAlumno08")
	public String verSocketAlumno08() {	return "intranetSocketAlumno08";	}

	@GetMapping("/verSocketAlumno09")
	public String verSocketAlumno09() {	return "intranetSocketAlumno09";	}

	@GetMapping("/verSocketAlumno10")
	public String verSocketAlumno10() {	return "intranetSocketAlumno10";	}

	@GetMapping("/verSocketEjemplo")
	public String verSocketEjemplo() {	return "intranetSocketEjemplo";	}


}
