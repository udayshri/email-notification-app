$(document).ready(function() {
	$('#sendEmail').click(function(event) {
		$("#sendEmailResponse").html('');
		var fullName = $('#name').val();
		var emailId = $('#emailId').val();
		var emailBody = $("#emailBody").val();
		if(fullName.trim() != '' && emailId.trim() != '' && emailBody.trim() != '')	{
			$.ajax({
				type: "POST",
				contentType: "application/json; charset=utf-8",
				url: "/sendEmail",
				data: JSON.stringify({'fromName': fullName, 'toEmailId': emailId, 'emailBody' : emailBody}),
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