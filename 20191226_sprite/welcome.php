<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>문서 제목</title>
</head>
<body>
	<?
	$yname = $_GET["name"];
	$yemail = $_GET["email"];
	?>

	이름:<?echo $yname; ?>님 반갑습니다.<br>
	이메일: <?echo $yemail; ?>
</body>
</html>