<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

<body>
	<div class="content">
		<div class="logo">
			<h1>
				<strong>Safe</strong>Path
			</h1>
		</div>
		<div class="apollo">
			<div class="apollo-container clearfix">
				<div class="apollo-facebook">
					<div class="apollo-image"></div>
				</div>

				<div class="apollo-register">
					<form class="form-signin" id="apollo-register-form" method="POST" action="Cadastro">
						<div class="control-group">
							<input type="text" value="" id="registerEmail"
								class="input-block-level email" name="email"
								placeholder="E-mail" required>
						</div>

						<div class="control-group">
							<input type="text" value="" id="registerLogin" 
							class="input-block-level"
								placeholder="Login" name="login" required>
						</div>

						<div class="control-group">
							<input type="password" value="" id="registerSenha" 
							class="input-block-level"
								placeholder="Senha" name="senha" required>
						</div>


						<p class="apollo-seperator">Sobre Você</p>

						<div class="control-group">
							<input type="text" value="" class="input-block-level"
								id="firstName" placeholder="Primeiro Nome" name="primeiroNome" required>
						</div>

						<div class="control-group">
							<input type="text" value="" class="input-block-level"
								id="lastName" placeholder="Ultimo Nome" name="segundoNome" required>
						</div>


						<button class="btn btn-large btn-block btn-primary" type="submit">Registrar</button>
					</form>

					<p class="apollo-back">
						<a href="#"><i class="icon-arrow-left"></i> Voltar ao Login</a>
					</p>
				</div>

				<div class="apollo-login">
					<button class="btn btn-block btn-facebook btn-large">
						Conectar usando o <strong>Facebook</strong>
					</button>

					<p class="apollo-seperator">ou</p>

					<form class="form-signin" id="apollo-login-form" method="POST" action="login">
						<div class="control-group">
							<input type="text" value="" class="input-block-level email"
								placeholder="Usuario" id="usuario" name="usuario">
						</div>

						<div class="control-group">
							<input type="password" value="" class="input-block-level"
								placeholder="Senha" id="senha" name="senha">
						</div>

						<button class="btn btn-large btn-block" type="submit">Entrar</button>
					</form>

					<p class="apollo-register-account">
						<a href="#" class="register-link">Não possui uma conta? <strong>Registre
						</strong><i class="icon-arrow-right"></i></a><br> <a href="Principal"
							class="password-link"><small>Entrar sem Login</small></a>
					</p>
				</div>

				<div class="apollo-forgotten-password">
					<form class="form-signin" id="apollo-forgotten-password-form">
						<div class="control-group">
							<input type="text" value="" class="input-block-level email"
								placeholder="Email" name="email">
						</div>
						<button class="btn btn-large btn-block btn-primary" type="submit">Resetar
							Senha</button>
					</form>

					<p class="apollo-back">
						<a href="#"><i class="icon-arrow-left"></i> Voltar ao Login</a>
					</p>
				</div>

				<div class="apollo-logging-in">
					<h2>
						Welcome back<span class="user-name"></span>!
					</h2>
					<p>
						<strong>Please wait whilst we securely log you in…</strong>
					</p>

					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Phasellus dignissim enim suscipit massa ornare rutrum.</p>
				</div>

				<div class="apollo-registering">
					<h2>
						Obrigado por se registrar <span class="user-name"></span>!
					</h2>
					<p>
						<strong>We've sent you an activation email, blah blah...</strong>
					</p>
					<p>Nullam ac erat nunc. Donec in orci purus, vel tempor tortor.
						Integer tincidunt ipsum sed ipsum scelerisque malesuada.</p>
				</div>

				<div class="apollo-password-reset">
					<h2>Check your email</h2>
					<p>
						<strong>We've sent you a link, blah blah...</strong>
					</p>
					<p>Nullam ac erat nunc. Donec in orci purus, vel tempor tortor.
						Integer tincidunt ipsum sed ipsum scelerisque malesuada.</p>
				</div>
			</div>
		</div>
	</div>
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"
		type="text/javascript"></script>
	<script type="text/javascript" charset="utf-8"
		src="<c:url value="/resources/js/jquery.tubular.1.0.js" />"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value="/resources/js/md5.js" />"></script>
	<script type="text/javascript" charset="utf-8" src="<c:url value="/resources/js/index.js" />"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$().ready(function() {
			$('.content').tubular({
				videoId : 'CDMN1aQ6I6c',
				mute : true,
				repeat : true
			});
		});
	</script>
</body>
</html>
