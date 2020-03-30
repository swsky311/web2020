$(function(){
	//$.ajax({
	//	url:"header.html",
	//	type:"post", // get(·ÎµùÈÄ)/post(¿äÃ»½Ã)
	//	success:function(data){
	//		$("#header").html(data);
	//	}
	//});
	$(".menu1").click(function(){
		$.ajax({
			url:"sub1.html",
				type:"post",
				success:function(data){
					$("#section").html(data);
				}
		});
		$("#section").css("background","#f00");
		return false;
	});
	$(".menu2").click(function(){
		$.ajax({
			url:"sub2.html",
				type:"post",
				success:function(data){
					$("#section").html(data);
				}
		});
		$("#section").css("background","#ff0");
		return false;
	});
	$(".menu3").click(function(){
		$.ajax({
			url:"sub3.html",
				type:"post",
				success:function(data){
					$("#section").html(data);
				}
		});
		$("#section").css("background","#0f0");
		return false;
	});
	$(".menu4").click(function(){
		$.ajax({
			url:"sub4.html",
				type:"post",
				success:function(data){
					$("#section").html(data);
				}
		});
		$("#section").css("background","#00f");
		return false;
	});


	
});