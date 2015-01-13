/*清空省的下拉列表*/
function clearProvinceOptions(Province){
	var count=Province.options.length;
	for(var i=0;i<count;i++){
		Province.remove(0);//清空 因为你清空一个后 原来第二个位置的会移到第一个位置,所以就一直清第0个位置上的数据
	}
	Province.options[Province.options.length]=new Option("-----请选择(省)-----","-1","",true);
}
/*初试化年的回调方法,也就是后台的业务方法调用完后,要调用该方法处理数据,填充年的级联列表*/
function countryCallback(data){
	var country=document.getElementById('country');
	
	for(var i=0;i<data.length;i++){
		country.options[country.options.length]=new Option(data[i].name,data[i].id);//将数据填充到下来列表中
	}
	
}
/*初试化省后的回调方法*/
function provinceCallback(data){
	var province=document.getElementById('province');
	clearProvinceOptions(province);
	for(var i=0;i<data.length;i++){
		province.options[province.options.length]=new Option(data[i].name,data[i].id);//将数据填充到下来列表中
	}
	
}
/*初试化省下拉列表*/
function initCountry(){
	CountryProvinceService.getAllCountry(countryCallback);
}
/*当选择某一个国家后就会初试化该国家中的省,要调用后台的业务方法,查询出所有属于该国家的省,然后调用回调方法provinceCallback*/
function initProvince(countryid){
	if(countryid!=-1){
		CountryProvinceService.getProvinceOfCountry(countryid,provinceCallback);
	}else{
		var province=document.getElementById('province');
		clearProvinceOptions(province);/*如果没有选种任何的国家 那么就要清空省的下拉列表*/
	}
}
