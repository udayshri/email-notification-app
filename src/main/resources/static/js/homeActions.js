$(document).ready(function() {
	$('#sendEmail').click(function(event) {
		$("#sendEmailResponse").html('');
		var fullName = $('#name').val();
		var emailId = $('#emailId').val();
		var emailBody = $("#emailBody").val();
		
		var host = $('#host').val();
		var hostUserName = $('#hostUserName').val();
		var hostUserPassword = $('#hostUserPassword').val();
		if( host.trim() != '' && hostUserName.trim() != '' && hostUserPassword.trim() != '' &&
			fullName.trim() != '' && emailId.trim() != '' && emailBody.trim() != ''
		)	{
			$.ajax({
				type: "POST",
				contentType: "application/json; charset=utf-8",
				url: "/sendEmail",
				data: JSON.stringify(
					{
						'fromName': fullName, 
						'toEmailId': emailId, 
						'emailBody' : emailBody,
						'host' : host,
						'userName':  hostUserName,
						'password' : hostUserPassword
					}
				),
				cache: false,
				success: function(result) {
					$("#sendEmailResponse").html(result);
					console.log(result);
					$('#name').val('');
					$('#emailId').val('');
					$("#emailBody").val('');
				},
				error: function(err) {
					
				}
			});
		}
		event.preventDefault();
	});
	
});