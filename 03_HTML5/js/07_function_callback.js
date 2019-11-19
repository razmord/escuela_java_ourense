function suma(x,y){
    return x+y;
}

function multiplica(x,y){
    return x*y;
}
let divide= new Function("x","y","return x/y;");
let resta =(x,y) =>{
    return x-y;
}
let punto=(x,y)=>{
    return "("+x+","+y+")";
}