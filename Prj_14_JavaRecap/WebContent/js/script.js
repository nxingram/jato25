/**
 * 
 */
const lista = document.getElementById("lista");
const btn = document.getElementById("btnCliccami");
const nota = document.getElementById("nota");

var output = '';

var args = ['tipi primitivi', 'tipi riferimento'];

btn.onclick = function(){
	args.push(nota.value);
	lista.innerHTML = '';
	for(let arg of args){
		output += '<li>'+arg+'</li>';
	}
	
	lista.innerHTML = output;
}


console.log('collegato!');