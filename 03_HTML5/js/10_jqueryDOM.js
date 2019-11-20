jQuery(document).ready(function(){
    $("article").each(function(index){
        $(this).attr("style","display:none");   
    });
    jQuery("section").append("<div>Leyenda de lo que sea</div>");
    $("tr").append("<td>Info</td>");
    $(".articulo").append("<p>Un parrafo en cada elem con class articulo</p>");
    $("tr:nth-child(5)").attr("style", "background-color:red; color:white;");
    $("tr:nth-child(5)").click(()=>{alert('Un click desde JQ')});
    $("#otro_menu").append("<h2>Menu de articulos</h2><br/><br/>");
  /*  $("#otro_menu").click(function(){
        $("#otro_menu").fadeOut();
    });*/

    $("article").each(function(index){
        $(this).attr("id","articulo_"+index);
        $("#otro_menu").append("</br><a href='#articulo_"+index+"' onclick=mostrar('#articulo_"+index+"')>Articulo "+index+"</a>");  
    }
    );
    

    
});
function mostrar(id) {              
    $("article").each(function(index){
        $(this).slideUp();
    });
    $(id).slideDown(1400);
}