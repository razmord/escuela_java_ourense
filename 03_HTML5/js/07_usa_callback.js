function operarArrays(arrX, arrY, opera){
    if(arrX.length == arrY.length){
        var arrayResult = new Array(arrX.length);
        for (var i=0;i<arrX.length;i++){
            arrayResult[i]=opera(arrX[i],arrY[i]);
        }
        return arrayResult;
    }
}
var arrayEjemplo = [];
arrayEjemplo.push("Primer Elemento");
arrayEjemplo[10]="lo que sea;"