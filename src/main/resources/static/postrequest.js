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
						console.log(result);
							$("#postResultDiv").html(
									"<b>Student Name : " + result.studentFirstName + " " + result.studentLastName + " with <b>Student ID : " +  result.id
											+ "<b> Registered Successfully!<br><p>");

					},
					error : function(e) {

						alert("Error!");
						console.log(e);
						console.log("ERROR: ", e);
					}
				});

			}
		})