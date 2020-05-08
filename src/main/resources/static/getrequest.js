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

							$('#getResultDiv.list-group li').remove();

                var data = result.studentList;
                var userData = "<table border='1'>";
                    userData += "<tr>";

                      	userData += "<th>";
                        	userData += 'id';
                        userData += "</th>";

                        userData += "<th>";
                        	userData += 'first name';
                        userData += "</th>";

                        userData += "<th>";
                        	userData += 'Last name';
                        userData += "</th>";

                      userData += "</tr>";
                    for(i=0;i<data.length;i++)
                    {
                      userData += "<tr>";

                      	userData += "<td>";
                        	userData += data[i].id;
                        userData += "</td>";

                        userData += "<td>";
                        	userData += data[i].studentFirstName;
                        userData += "</td>";

                        userData += "<td>";
                        	userData += data[i].studentLastName;
                        userData += "</td>";

                      userData += "</tr>";
                    }
                    userData += "</table>";

                    $("#getResultDiv").html(userData);

			        },
					error : function(e) {
					//	$("#getResultDiv").hide();
						//alert(e);
                      //  console.log("Anushka"+ result);
                       alert("Error!");
                        console.log(e);
					 console.log("ERROR: ", e);
					}
				});
			}
		})