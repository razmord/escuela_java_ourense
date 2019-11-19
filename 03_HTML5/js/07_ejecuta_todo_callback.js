let array_A=[1,2,3,4,5];
let array_B=[2,3,4,5,6];

let arraySumaAB = operarArrays(array_A,array_B,suma);
let arrayMultiplica = operarArrays(array_A,array_B,multiplica);
let arrayResta = operarArrays(array_A,array_B,resta);
let arrayDivide = operarArrays(array_A,array_B,divide);
let arrayPunto = operarArrays(array_A,array_B,punto);
function arrayEnTabla(array){
    let tabla = "<table border=2><tr>";
    for (let index = 0; index < array.length;index++){
        const element = array[index];
        tabla += "<td>" +element +"</td>";
    }
    return tabla + "</tr></table>";
}
function arrayEnTabla2(array){
    let tabla = "<table border=2><tr><td> index  </td><td> element </tr></td>";
    for (let index = 0; index < array.length;index++){
        const element = array[index];
        tabla += "<tr><td>"+index+"</td><td>" +element +"</tr></td>";
    }
    return tabla + "</table>";
}
document.getElementById("contenido").innerHTML += arrayEnTabla(arraySumaAB);
document.getElementById("contenido").innerHTML += "</br>"+ arrayEnTabla(arrayMultiplica);
document.getElementById("contenido").innerHTML += "</br>" + arrayEnTabla(arrayResta);
document.getElementById("contenido").innerHTML += "</br>"+ arrayEnTabla(arrayDivide);
document.getElementById("contenido").innerHTML += "</br>"+ arrayEnTabla2(arrayPunto );