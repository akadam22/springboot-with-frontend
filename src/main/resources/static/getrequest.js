/*
GET: $(document).ready(
		function() {

			// GET REQUEST
			$("#getStudents").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					contentType : "application/json",
					url : "getStudent",
					success : function(result) {
						//if (result.status == "success") {

							$('#getResultDiv ul').empty();
							var stuList = "";
							$.each(result.data,
									function(i, student) {
										var user = "Student ID  "
												+ student.id
												+ ", Student First Name  = " + student.studentFirstName
												+ ", Student Last Name  = " + student.studentLastName +"<br>";
										$('#getResultDiv .list-group').append(student)
									});
							console.log("Success: ", result);
						//} else {
							*/
/*$("#getResultDiv").html("<strong>Error</strong>");
							alert(result.status);
							console.log("Fail: ", result);
						}*//*

					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						//alert("Error !!")
						//alert(result.status);
						console.log("ERROR: ", e);
					}
				});
			}
		})*/


$(document).ready(
		function() {

$("#getStudents").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "getStudent",
					contentType : "application/json",
					success : function(result) {
						if (result.status == "Done") {

							$('#getResultDiv.list-group li').remove();
							var stuList = "";
							$.each(result.data,
									function(i, student) {
										var user = "Student " + i + ": FirstName : " + student.studentFirstName + " , LastName : " + student.studentLastName + "<br>";
										$('#getResultDiv .list-group').append(student)
									});
							console.log("Success: ", result);
						} else {
                           $("#getResultDiv").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
			        },
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
			          	alert(e);
					    console.log("ERROR: ", e);
					}
				});
			}
		})