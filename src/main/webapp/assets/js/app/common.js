/**
 * 
 */

jQuery(function($) {
			 $(document).on('click', '.toolbar a[data-target]', function(e) {
				e.preventDefault();
				var target = $(this).data('target');
				$('.widget-box.visible').removeClass('visible');//hide others
				$(target).addClass('visible');//show target
			 });
			
										
				$('#login-form').validate({
					errorElement: 'div',
					errorClass: 'help-block',
					focusInvalid: false,
					rules: {
						username: {
							required: true,
							username:true
						},
						password: {
							required: true,
							password:true
						},
						
					},
			
					messages: {
						username: {
							required: "Please provide username.",
							username: "Please provide username."
						},
						password: {
							required: "Please provide Password.",
							username: "Please provide Password."
						},
						
					},
			
			
					highlight: function (e) {
						$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
					},
			
					success: function (e) {
						$(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
						$(e).remove();
					},
			
					errorPlacement: function (error, element) {
						   error.insertAfter(element.parent());
					},
			
					submitHandler: function (form) {
					},
					invalidHandler: function (form) {
					}
				});
				
				$('#retrieve-form').validate({
					errorElement: 'div',
					errorClass: 'help-block',
					focusInvalid: false,
					rules: {
						retrieve_email: {
							required: true,
							email:true
						},
											
					},
			
					messages: {
						retrieve_email: {
							required: "Please provide Email.",
							retrieve_email: "Please provide a valid Email."
						},
											
					},
			
			
					highlight: function (e) {
						$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
					},
			
					success: function (e) {
						$(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
						$(e).remove();
					},
			
					errorPlacement: function (error, element) {
						   error.insertAfter(element.parent());
					},
			
					submitHandler: function (form) {
					},
					invalidHandler: function (form) {
					}
				});
				
				
				
				
				$('#registration-form').validate({
					errorElement: 'div',
					errorClass: 'help-block',
					focusInvalid: false,
					rules: {
						reg_email: {
							required: true,
							email:true
						},
						reg_username: {
							required: true,
							reg_username:true
						},
						reg_password: {
							required: true,
							reg_password:true
						},
						reg_cnf_password: {
							required: true,
							reg_password:true
						},
											
					},
			
					messages: {
						reg_email: {
							required: "Please provide Email.",
							retrieve_email: "Please provide a valid Email."
						},
						reg_username: {
							required: "Please provide username.",
							reg_username:"Please provide username."
						},
						reg_password: {
							required: "Please provide password.",
							reg_password:"Please provide password."
						},
						reg_cnf_password: {
							required: "Please reenter password.",
							reg_cnf_password:"Please reenter password."
						},
																	
					},
			
			
					highlight: function (e) {
						$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
					},
			
					success: function (e) {
						$(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
						$(e).remove();
					},
			
					errorPlacement: function (error, element) {
						   error.insertAfter(element.parent());
					},
			
					submitHandler: function (form) {
					},
					invalidHandler: function (form) {
					}
				});
				
			})