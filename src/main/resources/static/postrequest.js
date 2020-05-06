		POST :
$(document).ready(
		function() {

			// STUDENT FORM
			$("#studentForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// FORM DATA
				var formData = {
					id : $("#id").val(),
					studentFirstName : $("#studentFirstName").val(),
					studentLastName : $("#studentLastName").val()
				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "addStudent",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						//if (result.status == "success") {
						alert("success response")
						console.log(result);
							$("#postResultDiv").html(
									"" + result.studentFirstName
											+ " Registered Successfully! Congratualations !!!!<br>");
						//} else {
					     /*   console.log("Investigating error");
					        alert(result.status);
					        console.log("Anushka"+ result);

							$("#postResultDiv").html("<strong>Error123</strong>");

						}*/

					},
					error : function(e) {

						alert("Error!");
						console.log(e);
						console.log("ERROR: ", e);
					}
				});

			}
		})