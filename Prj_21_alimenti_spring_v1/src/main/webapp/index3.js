/**
 * 
 */
const URL ="http://localhost:9002/api/alimenti/";
const out = document.getElementById("output");
var testo = "";

fetch(URL)
    .then(function(risposta){
        return risposta.json();
        })
    .then(function(data){
        //console.log(data);
        // forof
        for (let alimento of data) {
            testo+="<li>"+alimento.prodotto+"</li>";
        }

        out.innerHTML=testo;

    });

    