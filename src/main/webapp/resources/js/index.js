;
(function () {
    var app = {
        init: function () {
            this.form.setup();
        },
        //fim_init
        form: {
            setup: function () {

                $('.apollo-register-account .register-link').click(function (e) {
                    e.preventDefault();

                    $('.apollo-login').fadeOut(350, function(){
                    	$('.apollo-register').fadeIn(350, function(){
                    		$('.apollo-register input:first').focus();
                    	});
                    	$('.apollo').addClass('register');
                    });
                });

                $('.apollo-back a').click(function (e) {
                    e.preventDefault();

                     $('.apollo-register:visible, .apollo-forgotten-password:visible').fadeOut(350, function(){
                    	$('.apollo-login').fadeIn(350);
                    	// $('.apollo').removeClass('register forgotten-password');
                    });
                });

                $('.apollo-register-account .password-link').click(function (e) {
                    e.preventDefault();

                    $('.apollo-login').fadeOut(350, function(){
                    	$('.apollo-forgotten-password').fadeIn(350, function(){
                    		$('.apollo-forgotten-password input:first').focus();
                    	});
                    	$('.apollo').addClass('forgotten-password');
                    });
                });

                $('#apollo-register-form').submit(function(e){
                	e.preventDefault();
                	
                	app.form.handleRegister($(this), e);
                });

                 $('#apollo-forgotten-password-form').submit(function(e){
                	app.form.handleForgottenPassword($(this));
                });

               
            },
            handleStandardLogin: function (form) {
            	if(app.checkUserAccount('standard', form)){ // The user has an account and the details are valid...
            		$('.apollo-login').fadeOut(350, function(){
						$('.apollo-logging-in').fadeIn(350);
					});
            	}
            	else { // The details were invalid...
            		var login = $('.apollo-login'),
            			email = login.find('[type="text"]').parents('.control-group'),
            			password = login.find('[type="password"]').parents('.control-group');

            		password.addClass('error');
            		email.addClass('error').find('input').popover({
            			title: 'Ooops!',
            			content: 'Your email address / password appear to be incorrect. Please verify them and try logging in again.',
            			trigger: 'manual',
            			placement: 'right'
            		}).popover('show');
        		}	           	
            },
            handleRegister: function (form, event) {
            		if($('#registerEmail').val() == " " && $('#registerLogin').val() == " " && $('#registerSenha').val() == " "){
            			alert("Todos os campos são obrigaórios");
            		}
            		else{
<<<<<<< HEAD
            			var datastring = form.serialize();
            			            			
            			$.ajax({
            	            type: "POST",
            	            url: "Cadastro",
            	            data: datastring,
            	            dataType: "json",
            	            
            	            beforeSend: function(xhr) {
            	                xhr.setRequestHeader("Accept", "application/json");
            	            },
            	            success: function(data) {
            	            	console.log("Success");
            	                console.log(data);

            	                $('.apollo-register:visible, .apollo-forgotten-password:visible').fadeOut(350, function(){
            	                	$('.apollo-login').fadeIn(350);
            	                	$('#usuario').val(data['login']);
            	                	$('#senha').val(data['senha']);
            	                });
            	            },
            	            error: function(data){
            	            	console.log(data);
            	            	alert(data);
            	            }
            	        });
=======
            			console.log($('#registerEmail').val());
            			
            			$.ajax({
            		        url: "Cadastro",
            		        type: "POST",
            		        data: form.serialize(),
            		        beforeSend: function(xhr) {
            		            xhr.setRequestHeader("Accept", "application/json");
            		        },
            		        success: function(resp) {
            		        	console.log(resp);
            		        },
            		        error: function(errorMessage) {
            	                   console.log(errorMessage);
        	                }
            		    });
>>>>>>> FETCH_HEAD
            		}
            },
            handleForgottenPassword: function(form){
            	if(app.checkUserAccount('forgottenPassword', form)){
            		$('.apollo-forgotten-password').fadeOut(350, function(){
						$('.apollo-password-reset').fadeIn(350);
					});
            	}
            	else {
					var fPassword = $('.apollo-forgotten-password'),
            			email = fPassword.find('[type="text"]:first').parents('.control-group');

            		email.addClass('error').find('input:first').popover({
            			title: 'Ooops!',
            			content: 'It looks like we don\'t have an account registered with that email address.',
            			trigger: 'manual',
            			placement: 'right'
            		}).popover('show');
            	}

				// Handle the user's details (data) here via AJAX...
            }
        },
        //fim_form
     	checkUserAccount: function(loginType, data){
     		// This is where you'd check the account details via Ajax...
     		return ($('[name="optionsRadios"]:checked').val() == 'yes');
        },
        domReady: function () {},
        windowLoad: function () {}
    };
    //fim_app
    app.init();
    $(function () {
            app.domReady();

            $(window).load(app.windowLoad);
        });

})(jQuery)