		POST :
$(document).ready(
		function() {

			// STUDENT FORM
			$("#studentForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxPost();
			});

			$(document).ready(function(){
                   $('#submit').click(function(){
                        if($.trim($('#studentFullName').val()) == '')
                       {
                           $('#studentFullName').css("border-color", "red");
                           alert("Full name is empty !");
                       }
                 });
            });

            $(document).ready(function(){
                               $('#submit').click(function(){
                                    if($.trim($('#id').val()) == '')
                                   {
                                       $('#id').css("border-color", "red");
                                       alert("ID is empty!");
                                   }
                             });
                        });

                        $(document).ready(function(){
                                           $('#submit').click(function(){
                                                if($.trim($('#email').val()) == '')
                                               {
                                                   $('#email').css("border-color", "red");
                                                   alert("Email is empty!");
                                               }
                                         });
                                    });

			function ajaxPost() {

				// FORM DATA
				var formData = {
					id : $("#id").val(),
					studentFullName : $("#studentFullName").val(),
					email : $("#email").val()

				}



				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "addStudent",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						console.log(result);
							$("#postResultDiv").html(
									"<b>Student Name : " + result.studentFullName + " with <b>Student ID : " +  result.id
											+ "<b> Registered Successfully!<br><p>");
                                        reset();

					},
					error : function(e) {

						alert("Error!");
						console.log(e);
						console.log("ERROR: ", e);
					}
				});

			}
		})


		function reset(){
		    $('#id').val('');
		    $('#studentFullName').val('');
		    $('#email').val('');
		}