function atualizaCachorro (element){
	var dog = (element.parentNode.parentNode.parentNode.parentNode.getAttribute('id'));
	window.location.href="/Sweet_Home/dogUpdate?cachorro="+dog;
}


function deletaCachorro (element){
	var dog = (element.getAttribute('id'));
	
	window.location.href="/Sweet_Home/dogRemove?cachorro="+dog;
}
