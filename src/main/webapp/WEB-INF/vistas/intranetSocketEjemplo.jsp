<jsp:include page="intranetValida.jsp" />
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Expires" content="-1" />
<meta http-equiv="Cache-Control" content="private" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<script type="text/javascript" src="js/global.js"></script>

<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>

<title>Intranet</title>
</head>
<body>
<jsp:include page="intranetCabecera.jsp" />
<div class="container" style="margin-top: 4%"><h4>Socket Ejemplo</h4></div>

<div class="container" style="margin-top: 1%">

	<form  id="id_form" method="post"> 
		  <div class="col-md-12" style="margin-top: 2%">
			<div class="row">
				<div class="form-group col-md-4">
					<button id="id_socket_server_start" type="button" class="btn btn-primary" >Socket Server Start</button>
				</div>
				<div class="form-group col-md-4">
					<button id="id_socket_server_stop" type="button" class="btn btn-primary" >Socket Server Stop</button>
				</div>
				<div class="form-group col-md-4">
					<button id="id_socket_client_start" type="button" class="btn btn-primary" >Socket Client Start</button>
			    </div>
			</div>
		</div>
	</form>
	
</div>

<script type="text/javascript">
$("#id_socket_server_start").click(function (){ 
	$.ajax({
    	type: "POST",
        url: "socketServerStart", 
        success: function(data){},
        error: function(){
           	mostrarMensaje(MSG_ERROR);
        }
   });
});

$("#id_socket_server_stop").click(function (){ 
	$.ajax({
    	type: "POST",
        url: "socketServerStop", 
        success: function(data){},
        error: function(){
           	mostrarMensaje(MSG_ERROR);
        }
   });
});

$("#id_socket_client_start").click(function (){ 
	$.ajax({
    	type: "POST",
        url: "socketClientStart", 
        success: function(data){},
        error: function(){
           	mostrarMensaje(MSG_ERROR);
        }
   });
});


</script>   		
</body>
</html>