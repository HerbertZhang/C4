function updateNum(url,name) {
	var v1 = "";
	var value = "v1=document.cartForm." + name + ".value" ;
	eval(value);
	url += v1;

	//document.location.href=url;
	location=url;
	//alert(url);
}

function test(){
	alert("test");
}
