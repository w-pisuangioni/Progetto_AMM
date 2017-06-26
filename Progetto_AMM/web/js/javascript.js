/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//crea un elemento div con classe user che rappresenta un utente (contenuto in gtt)
function createElement(utenti){
    var img = $("<img>")
            .attr("alt","Foto Profilo")
            .attr("src",utenti.img);
    var name = $("<h2>").html(utenti.nome);
    var link = $("<a>")
            .attr("href", "index.html?user="+utenti.id)
            .html("Profilo");
    
    var userData = $("<div>")
            .attr("class","userData")
            .append(name)
            .append(link);
    var profilePic = $("<div>")
            .attr("class","profilePic")
            .append(img);
    
    
    return $("<div>")
            .attr("class","user")
            .append(profilePic)
            .append(userData);
}

function stateSuccess(data){
    var userListPage = $("#usersList");
    
    $(userListPage).empty();
    for(var instance in data){
        $(userListPage).append(createElement(data[instance]));
    }
}
function stateFailure(data, state){
    console.log(state);
}

$(document).ready(function(){
    $("#cercaUtente").click(function(){
        
        var utenteCercato = $("#searchField")[0].value;
        
        $.ajax({
            url: "CercaAjax",
            data:{
                cmd:"search",
                nomeUtenteCercato: utenteCercato
            },
            dataType:"json",
            success: function(data, state){
                stateSuccess(data)
            },
            error: function(data, state){
                stateFailure(data, state)
            }
        });
    })
});
