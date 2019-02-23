<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Emre Gedikoğlu</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="application/x-javascript">
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 




</script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet"
	media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
<link href="css/font-awesome.css" rel="stylesheet">
<!-- font-awesome icons -->

<!-- //Custom Theme files -->
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script>
<!-- //js -->

</head>
<body>
	<!-- main -->
	<div class="header">
		<div class="header-center">
			<a class="active" href="/aboutme">About Me</a> <a href="/experiences">Experience
				and Education</a> <a href="/skills">Skills</a> <a href="/contact">Contact</a>
		</div>
	</div>

	<!-- contact -->
	<div class="contact">
		<div class="container">
			<h3 class="agileits-title">Contact Me</h3>
			<div class="contact-w3lsrow">

				<div class="col-md-8 contact-wthree-right">
					<form modelAttribute="contact" method="post">
						<input type="text" name="Name" placeholder="Name" required=""
							path="name"> <input type="email" class="email"
							name="Email" placeholder="Email" required="" path="email">
						<textarea name="Message" placeholder="Message" required=""
							path="message"></textarea>
						<input type="submit" value="SUBMIT" name="submit">
					</form>
					<c:if test="${not empty message}">
						<div style="color: white;">${message}</div>
					</c:if>
				</div>
				<div class="clearfix"></div>
			</div>

		</div>
	</div>
	<!-- //contact -->

	<!-- footer -->
	<div class="agile-footer">
		<p>© 2018 Emre Gedikoğlu</p>
	</div>
	<!-- //footer -->

	<!-- //main -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/bootstrap.js"></script>
</body>
</html>