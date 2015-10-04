function atualizaCachorro (element){
	var dog = (element.parentNode.parentNode.parentNode.parentNode.getAttribute('id'));
	window.location.href="/Sweet_Home/dogUpdate?cachorro="+dog;
}
