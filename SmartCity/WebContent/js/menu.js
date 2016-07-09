var oldId="";
//栏目控制
function menuDisplyController(showDisPlayId){
	$("#tab"+oldId).hide();
	debugger;
	$("#con_column_1").load("Adminlogin.html");
	disply(showDisPlayId);
}
function disply(id){
	oldId=id;
	debugger;
	 $("#tab"+id).show();
}