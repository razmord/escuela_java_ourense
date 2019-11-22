/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $("#btn_peticion_ajax_jq").click(function(){
        $.ajax({
            "url":"./datos.json",
            "success":function(respuestaJson){
                $("#div_datos_json").html(JSON.stringify(respuestaJson));
            },
            "error":function(jqXHR,textStatus,errorThrown){
                console.error("No se ha podido obtener la info");
                console.warn(jqXHR);
                console.warn(textStatus);
                console.warn(errorThrown);
                
            }
            
        });
    });
    $("#btn_peticion_ajax_post").click(function(){
        let nombre=document.getElementById("nombre").value;
        let email=document.getElementById("email").value;
        if(""!==nombre && nombre.length > 1 && email !== ""){
            let expresionNombre=new RegExp("^[A-Z][a-z]+?[A-Za-z]*S");
            let expresionEmail=new RegExp("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");
            if(expresionNombre.test(nombre)){
                alert("Primera letra mayus, mínimo una minúscula. Apell opcional");
                return;
            }else if(!expresionEmail.test(email)){
                alert("Email inválido");
                return;
            }else{

                let datosUsuario={
                nombre: nombre,
                email: email
            };
                $.post("./datosJson",datosUsuario,function(resp){
                    $("div_datos_json").html(JSON.stringify(resp));
                });
            }
        }else{
            alert("Los datos no son válidos");
        }
    });
    
});

