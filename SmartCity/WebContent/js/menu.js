var oldId="";
//栏目控制
function menuDisplyController(showDisPlayId){
	$("#tab"+oldId).hide();
	disply(showDisPlayId);
}
function disply(id){
	oldId=id;
	debugger;
	 $("#tab"+id).show();
}

function loadHtml(url){
	$("#con_column_1").load(url);
}
