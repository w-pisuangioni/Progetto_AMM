<%-- 
    Document   : cercaAmici
    Created on : 15-giu-2017, 17.15.11
    Author     : pisuw
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="William Pisu">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/javascript.js"></script>
    </head>
    <body>
       <div id="divBody">
            <div id="searchUser">
                <input id="searchField" type="text" placeholder="Cerca..." value="">
                <button id="cerca">Invia</button>
            </div>
            <div id="ListaUtenti">
                <c:forEach var="utente" items="${utenti}">
                    <div class="user"> <!-- creare classe user per gestire la visualizzazione dei dati di un utente -->
                        <div class="profilePic"> <!-- gestione dell' immagine di profilo -->
                            <img alt="Foto Profilo" src="${utente.img}">
                        </div>
                        <div class="userData">
                            <a href="index.html?user=${utente.id}">${utente.nome} ${utente.cognome}</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div> 
    </body>
</html>
