var divBis = document.getElementById("contenido_bis");
divBis.style="background-color:lightgrey";
var mostrarTodosParam = new function(primerParam){
    divBis.innerHTML+="<p>Primer parametro : "+primerParam+ "</p>";
    for (argumento of arguments){
        divBis.innerHTML+="Argumento : "+argumento+ "<br/>";
    }
    if(typeof(primerParam)=== "undefined")
    divBis.innerHTML+="primerParam no está definida";
    if(primerParam == "1"){
        divBis.innerHTML+="Es parecido";
    }else{
        divBis.innerHTML+="No es parecido>";
    }
    if(primerParam == "1"){
        divBis.innerHTML+="Es identico";
    }else{
        divBis.innerHTML+="No es identico>";
    }
}
mostrarTodosParam("Un parámetro");
var intentoConversion=parseFloat("20");
divBis.innerHTML+="</br> Convirtiendo resultado = "+(intentoConversion);    
divBis.innerHTML+="</br>Infinito: "+ 1/0;
divBis.innerHTML+="</br>Valor máx "+ 1.234567890123456789;

