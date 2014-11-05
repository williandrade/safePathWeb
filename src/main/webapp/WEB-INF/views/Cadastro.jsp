<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>safePath</title>

<!-- Bootstrap core CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="<c:url value="/resources/js/ie-emulation-modes-warning.js" />"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<div class="container">
	<h1>Preencha os Campos!</h1>
	<p>Cadastrando-se você tem acesso a adicionar novos assaltos e
		traçar rotas inteligentes para seu destino.</p>
	<div class="panel panel-default">
		<div class="panel-body">
			<form role="form" method="POST" action="Cadastro" >
				<div class="form-group">
					<label for="nomeInput">Nome</label> <input type="text"
						id="nome" name="nome" class="form-control"
						placeholder="Digite seu Nome completo" required >
				</div>
				<div class="form-group">
					<label for="usuarioInput">Usuario</label> <input type="text"
						id="usuario" name="usuario" class="form-control"
						placeholder="Digite um usuário válido" required >
				</div>
				<div class="form-group">
					<label for="sehaInput">Senha</label> <input type="password"
						id="senha" name="senha" class="form-control"
						placeholder="Digite um senha" required >
				</div>
				<div class="form-group">
					<label for="emailInput">email</label> <input type="email"
						id="email" name="email" class="form-control"
						placeholder="Digite um e-mail válido" required >
				</div>
				<button type="submit" class="btn btn-primary">Enviar</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>