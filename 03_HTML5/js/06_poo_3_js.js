var unObjeto = {};
var otroObj = {
    "prop_1": "Propiedad uno",
    "prop_2": "Propiedad dos",
    "prop_3": "Propiedad tres",
    "prop_4": "Propiedad cuatro",
    "noimprimir" : "Fallo",
    toString: function(){
        return "propiedades: "+this.prop_1 + ";" +this.prop_2 + ";" +this.prop_3 + ";" +this.prop_4 + ";" +this.prop_5 + ";";
    },
    toStringZaira: function(){
        var strProp = "Lista de propiedades modo Zaira: ";
        var largo = Object.keys(this).length;
        var j = 1;
        for(var i=0;i<largo;i++){
            if(Object.keys(this)[i].indexOf("toString")>=0)
            j++;
            if(Object.keys(this)[i]=== "prop_" +j){
                strProp += Object.values(this)[i];
                j++;
            }
          
        }
        return strProp;
    }
}
otroObj.prop_5="Propiedad cinco";
var divTris = document.getElementById("contenido_bis");
divTris.innerHTML += otroObj.toString();

divTris.innerHTML += "</br></br>" + otroObj.toStringZaira();
for (var i in otroObj){
    if(i.includes("prop_"))
     divTris.innerHTML+= "</br> "+i+ " - " + otroObj[i];
} 