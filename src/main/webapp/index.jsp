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
	<div class="blur"></div>
	<div class="container">
<div>
	<a href="Cadastro" class="btn btn-lg btn-success btn-block pull-right cadastre" role="button">Cadastre-se</a>
</div>

		<form class="form-signin" role="form" method="POST" action="login">
			<h2 class="form-signin-heading">Login</h2>
			<input type="text" class="form-control" placeholder="Usuario"
				required name="usuario" autofocus> <input type="password"
				class="form-control" placeholder="Senha" name="senha" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="lembre-me">
					lembre-me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
		</form>

	</div>
	<!-- /container -->


	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script type="text/javascript">
		/*!
		 * IE10 viewport hack for Surface/desktop Windows 8 bug
		 * Copyright 2014 Twitter, Inc.
		 * Licensed under the Creative Commons Attribution 3.0 Unported License. For
		 * details, see http://creativecommons.org/licenses/by/3.0/.
		 */

		// See the Getting Started docs for more information:
		// http://getbootstrap.com/getting-started/#support-ie10-width
		(function() {
			'use strict';
			if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
				var msViewportStyle = document.createElement('style')
				msViewportStyle.appendChild(document
						.createTextNode('@-ms-viewport{width:auto!important}'))
				document.querySelector('head').appendChild(msViewportStyle)
			}
		})();
	</script>
</body>
</html>
