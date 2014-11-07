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

                	app.form.handleRegister($(this));
                });

                 $('#apollo-forgotten-password-form').submit(function(e){
                	e.preventDefault();

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
            handleRegister: function (form) {
            	var fName = $('#firstName').val(),
            		data = form.serialize();

            	if(app.checkUserAccount('register', form)){
					var register = $('.apollo-register'),
            			email = register.find('[type="text"]:first').parents('.control-group');

            		email.addClass('error').find('input:first').popover({
            			title: 'Ooops!',
            			content: 'It looks like you already have an account with that email address.',
            			trigger: 'manual',
            			placement: 'right'
            		}).popover('show');
            	}
            	else {
            		if(fName.length){
	            		$('.user-name').text(', '+fName);
	            	}

					$('.apollo-register').fadeOut(350, function(){
						$('.apollo-registering').fadeIn(350);
					});
            	}

				// Handle the user's details (data) here via AJAX...
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