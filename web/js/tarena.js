function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.0
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && document.getElementById) x=document.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function checkForm() {
			var uname = document.reg1.userid.value;
			var pwd1 = document.reg1.password.value;
			//alert(temp1+","+temp2);
			
			if(document.reg1.userid.value == "") {
				alert("用户名不能为空");
				document.reg1.userid.value = "";
				document.reg1.userid.focus();
				return false;
			} else if(uname.length < 4 || uname.length > 16) {
				alert("用户名的长度不能超过 16位 或 小于 4位");
				document.reg1.userid.value = "";
				document.reg1.userid.focus();
				return false;
			}
			if(document.reg1.password.value == "") {
				alert("密码不能为空");
				document.reg1.password.value = "";
				document.reg1.password.focus();  
				return false;
			} else if (pwd1.length < 5 || pwd1.length > 12) {
				alert("密码的长度不能少于5位，或者 多于12位");
				document.reg1.password.value = "";
				document.reg1.password.focus();
				return false;
			}
				document.reg1.submit();
		}

function checkReg() {
	var temp;
	temp = new String(document.reg.password.value);
	if(document.reg.userid.value == "") {
		alert("请输入用户名!");
		document.reg.userid.focus();
		return false;
	}
	else if(document.reg.userid.value.length < 4 || document.reg.userid.value.length > 16) {
				alert("用户名的长度不能超过 16位 或 小于 4位");
				document.reg.userid.value = "";
				document.reg.userid.focus();
				return false;
	}
	if(document.reg.password.value == "") {
		alert("请输入密码!");
		document.reg.password.focus();
		return false;
	}else if(temp.length < 5 || temp.length > 8) {
		alert("您的密码少于5位或多于8位!");
		document.reg.password.focus();
		return false;
	}
	if(document.reg.password2.value == "") {
		alert("请再次输入密码!");
		document.reg.password2.focus();
		return false;
	} else if(document.reg.password.value != document.reg.password2.value) {
		alert("您二次密码输入不一致!");
		document.reg.password.value = "";
		document.reg.password2.value = "";
		document.reg.password.focus();
		return false;
	}

	if(document.reg.email.value == "" | IsEmail(document.reg.email.value)) {
		alert("您的E-mail不符合规范!");
		document.reg.email.focus();
		return false;
	}
	document.reg.submit();
}

function IsEmail(item){
	var etext
	var elen
	var i
	var aa
	var uyear,umonth,uday
	etext=item;
	elen=etext.length;
	if (elen<5)
 		return true;
	i= etext.indexOf("@",0)
	if (i==0 || i==-1 || i==elen-1)/*@符号不能没有,也不能在第一个,或最后一个*/
 		return true;
	else
 		{if (etext.indexOf("@",i+1)!=-1)/*不能有2个@符号*/
  			return true;}
		if (etext.indexOf("..",i+1)!=-1)/*不能有2个.符号连在一起*/
 		return true;
	i=etext.indexOf(".",0)
	if (i==0 || i==-1 || etext.charAt(elen-1)=='.')/*.符号不能没有,也不能在第一个,或最后一个*/
 		return true;
	if ( etext.charAt(0)=='-' ||  etext.charAt(elen-1)=='-')/*不能以-开头和结尾*/
 		return true;
	if ( etext.charAt(0)=='_' ||  etext.charAt(elen-1)=='_')/*不能以_开头和结尾*/
 		return true;
 	if (etext.indexOf("@.",0)!=-1)/*不能有@.符号连在一起*/
 		return true;
	for (i=0;i<=elen-1;i++)
		{ aa=etext.charAt(i)
 		 if (!((aa=='.') || (aa=='@') || (aa=='-') ||(aa=='_') || (aa>='0' && aa<='9') || (aa>='a' && aa<='z') || (aa>='A' && aa<='Z')))
   			return true;
		}
	return false;
}
