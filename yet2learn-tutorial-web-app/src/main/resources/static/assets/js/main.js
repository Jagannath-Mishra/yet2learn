function validateLoginForm() {
	console.log("login validation started");
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	let email = document.forms["loginForm"]["email"];
	if (email.value == "") {
		document.getElementById("valid-email").innerHTML = "Please enter your email address!";
		email.focus();
		return false;
	}
	if (!email.value.match(mailformat)) {
		document.getElementById("valid-email").innerHTML = "You have entered an invalid email address!";
		email.focus();
		return false;
	}

	let password = document.forms["loginForm"]["password"];
	if (password.value == "") {
		document.getElementById("valid-password").innerHTML = "Please enter your password!";
		password.focus();
		return false;

	}


}

