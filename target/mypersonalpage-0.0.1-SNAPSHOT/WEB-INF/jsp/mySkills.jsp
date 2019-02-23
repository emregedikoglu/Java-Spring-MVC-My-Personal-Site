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

	<!-- skills -->
	<div class="skills">
		<div class="container">
			<div class="col-md-8 skills-w3lsleft">
				<h3 class="agileits-title">My Skills</h3>
				<div class="skill-agileinfo">
					<div class="skillbar" data-percent="90">
						<span class="skillbar-title" style="background: #2c3e50;">JAVA</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<!-- End Skill Bar -->
					<div class="skillbar" data-percent="90">
						<span class="skillbar-title" style="background: #2c3e50;">C++</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<!-- End Skill Bar -->
					<div class="skillbar" data-percent="90">
						<span class="skillbar-title" style="background: #2c3e50;">C</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<!-- End Skill Bar -->
					<div class="skillbar" data-percent="75">
						<span class="skillbar-title" style="background: #2c3e50;">SPRING(FRAMEWORK)</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<div class="skillbar" data-percent="60">
						<span class="skillbar-title" style="background: #2c3e50;">HTML5</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<!-- End Skill Bar -->
					<!-- End Skill Bar -->
					<div class="skillbar" data-percent="60">
						<span class="skillbar-title" style="background: #2c3e50;">JAVASCRIPT</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<!-- End Skill Bar -->
					<div class="skillbar" data-percent="60">
						<span class="skillbar-title" style="background: #2c3e50;">NODE.JS</span>
						<p class="skillbar-bar" style="background: #2c3e50;"></p>
						<span class="skill-bar-percent"></span>
					</div>
					<!-- End Skill Bar -->
				</div>
			</div>

			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //skills -->
	<!-- footer -->
	<div class="agile-footer">
		<p>© 2018 Emre Gedikoğlu</p>
	</div>
	<!-- //footer -->



	<!-- //main -->
	<!-- Skill Bar js -->
	<script src="js/skill.bars.jquery.js"></script>
	<script>
		$(document).ready(function() {

			$('.skillbar').skillBars({
				from : 0,
				speed : 4000,
				interval : 100,
				decimals : 0,
			});

		});
	</script>
	<!-- //End Skill Bar js -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/bootstrap.js"></script>
</body>
</html>