<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>php layout</title>
	<style>
		*{padding: 0;margin: 0;}
		li{list-style: none}
		a:visited,a:link{text-decoration: none;color:black;}
		.clearfix:after{
			content:"";clear: both;display: block;}

		/* header */
		#header{width: 960px;margin: 0 auto;background-color:skyblue;}
		#header h1{width: 150px; margin: 0 auto;
				   text-align:center; background-color: #0f0;} 
			.gnb>ul>li{float: left;width: 20%;background-color: #00f;}		   
			.gnb>ul>li>a{
				display: block;
				line-height: 30px;
				text-align: center;
				background-color: #f00;}

			/* slider visual */
			.visual{height: 300px;background-color:pink;}	

			/* section */
			section#container{width: 960px;height: 1000px;margin: 0 auto;background-color: #555;}

			/* footer */
			footer#footer{height: 100px;background-color:skyblue;}
	</style>
</head>
<body>
	<header id="header">
		<h1>logo</h1>
		<nav class="gnb">
			<ul class="clearfix">
				<li><a href="#">menu1</a></li>
				<li><a href="#">menu2</a></li>
				<li><a href="#">menu3</a></li>
				<li><a href="#">menu4</a></li>
				<li><a href="#">menu5</a></li>
			</ul>
		</nav>
	</header>