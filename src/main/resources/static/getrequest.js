$(document).ready(
		function() {

$("#getStudents").click(function(event) {
            // Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxGet();
			});
$(document).ready(function(){
                  $('#getStudents').click(function(){
                        if(($('#getResultDiv').val()) == '')
                         {
                            alert("List is Empty!")
                          }
                         });
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
                        	userData += 'Id';
                        userData += "</th>";

                        userData += "<th>";
                        	userData += 'Full name';
                        userData += "</th>";

                        userData += "<th>";
                        	userData += 'Email';
                        userData += "</th>";



                      userData += "</tr>";
                    for(i=0;i<data.length;i++)
                    {
                      userData += "<tr>";

                      	userData += "<td>";
                        	userData += data[i].id;
                        userData += "</td>";

                        userData += "<td>";
                        	userData += data[i].studentFullName;
                        userData += "</td>";

                        userData += "<td>";
                        	userData += data[i].email;
                        userData += "</td>";



                      userData += "</tr>";
                    }
                    userData += "</table>";

                    $("#getResultDiv").html(userData);

			        },
					error : function(e) {

                       alert("Error!");
                        console.log(e);
					 console.log("ERROR: ", e);
					}
				});
			}
		})




