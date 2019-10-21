window.onload = async function () {
	let xhr = new XMLHttpRequest();

	xhr.open('GET', 'http://localhost:8080/marketplace/view/item', false);

	xhr.setRequestHeader('Content-Type', 'application/json');

	try {
	  xhr.send();
	  if (xhr.status != 200) {
		alert(`Error ${xhr.status}: ${xhr.statusText}`);
	  } else {
		    replace(xhr.response);
	  }
	} catch(err) { // instead of onerror
	  alert("Request failed");
	}
}
var replace = function(json){

    var produtos = JSON.parse(json);
    var divProdutos = $('#produtos');    
    var divcontent = "";
    
    for(var i = 0; i < produtos.length; i++){
    	var template = $('#template').html();
    	var produto = produtos[i];
        template = template.replace('NomeProduto', produto.title);
        template = template.replace('PrecoProduto', produto.price);
        template = template.replace('DescricaoProduto', produto.description);
        divcontent += template;
        
    } 

    divProdutos.html(divcontent);
}