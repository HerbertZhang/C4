//按国家获取省份
function showProvince(countryElement){
	var country_cn = "	<select name=\"province\" >" +
	"		            <option value=\"安徽\">安徽</option>" +
	"		            <option value=\"北京\">北京</option>" +
	"		            <option value=\"重庆\">重庆</option>" +
	"		            <option value=\"福建\">福建</option>" +
	"		            <option value=\"广东\">广东</option>" +
	"		            <option value=\"甘肃\">甘肃</option>" +
	"		            <option value=\"广西\">广西</option>" +
	"		            <option value=\"贵州\">贵州</option>" +
	"		            <option value=\"河南\">河南</option>" +
	"		            <option value=\"湖北\">湖北</option>" +
	"		            <option value=\"河北\">河北</option>" +
	"		            <option value=\"海南\">海南</option>" +
	"		            <option value=\"香港\">香港</option>" +
	"		            <option value=\"黑龙江\">黑龙江</option>" +
	"		            <option value=\"湖南\">湖南</option>" +
	"		            <option value=\"吉林\">吉林</option>" +
	"		            <option value=\"江苏\">江苏</option>" +
	"		            <option value=\"江西\">江西</option>" +
	"		            <option value=\"辽宁\">辽宁</option>" +
	"		            <option value=\"澳门\">澳门</option>" +
	"		            <option value=\"内蒙古\">内蒙古</option>" +
	"		            <option value=\"宁夏\">宁夏</option>" +
	"		            <option value=\"青海\">青海</option>" +
	"		            <option value=\"四川\">四川</option>" +
	"		            <option value=\"山东\">山东</option>" +
	"		            <option value=\"上海\">上海</option>" +
	"		            <option value=\"陕西\">陕西</option>" +
	"		            <option value=\"山西\">山西</option>" +
	"		            <option value=\"天津\">天津</option>" +
	"		            <option value=\"台湾\">台湾</option>" +
	"		            <option value=\"新疆\">新疆</option>" +
	"		            <option value=\"西藏\">西藏</option>" +
	"		            <option value=\"云南\">云南</option>" +
	"		            <option value=\"浙江\">浙江</option>" +
	"		            <option value=\"其它\">其它</option>" +
					"	</select> ";
						
	var country_hk = "	<select name=\"province\">" +
					"		<option value=\"中国香港\">中国香港</option>" +
					"	</select> ";
						
	var country_tw = "	<select name=\"province\">" +
					"		<option value=\"中国台湾\">中国台湾</option>" +
					"	</select> ";
					
	if(countryElement.value == "中国"){
		document.getElementById("province").innerHTML = country_cn;
	}else if(countryElement.value == "中国香港"){
		document.getElementById("province").innerHTML = country_hk;
	}else if(countryElement.value == "中国台湾"){
		document.getElementById("province").innerHTML = country_tw;
	}
}

