console.log("ok");
console.error("Mensaje de error");
var varDinamica="Ahora soy un texto";
document.write("<h1>Javascript</h1>");
document.write("<p>varDinamica "+varDinamica+"</p>");
document.write("No más código spagetti. Es un anti-patrón de diseño");
varDinamica = 999;
var parrafo = document.createElement("p");
var textoParrafo = document.createTextNode("varDinamica = "+varDinamica);
parrafo.appendChild(textoParrafo);
var body=document.getElementsByTagName("body")[0];
body.appendChild(parrafo);
var arrayParrafos = document.getElementsByTagName("p");
for (p of arrayParrafos){
    p.setAttribute("style","background-color:lightgrey");
alert(body.innerHTML);
}