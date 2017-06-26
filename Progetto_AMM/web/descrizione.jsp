<%-- 
    Document   : descrizione
    Created on : 3-giu-2017, 10.43.26
    Author     : pisuw
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <jsp:include page="head.jsp"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="William Pisu">
        <meta name="keywords" content="NerdBook, descrizione">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    
    <body>
        <c:set var="title"/>
        <jsp:include page="top.jsp"/>
        
        <div id="central">
            
            <div id="leftbar">
              <!--<div class="Cerca">
                </div> -->
                <p id="Persone">
                  <strong>Persone</strong> 
                  <span>Utente 1</span>
                  <span>Utente 2</span>
                  <span>Utente 3</span>
                </p>
                <p id="Gruppi">
                  <strong>Gruppi</strong> 
                  <span>Gruppo 1</span>
                  <span>Gruppo 2</span>
                  <span>Gruppo 3</span>
                </p>  
            </div>

            <div id="divBody"> <!-- INIZIO CONTENUTI PAGINA -->
                <h1>Descrizione di NerdBook</h1>
                <div id="sommario"> <!-- Inserite un sommario con link interni alle sezioni all’inizio della pagina.-->
                    <ul>
                        <li><a href="#faq">faq</a></li>
                        <li><a href="#rivolto">A chi si rivolge?</a></li>
                        <li><a href="#iscrizione">Come iscriversi?</a></li>
                        <li><a href="#costo">E gratis o a pagamento?</a></li>
                    </ul>
                </div>
                <div id="faq">
                    <h2> - FAQ - </h2>      
                    <div class="faq">
                        <h3 id="rivolto" > A chi si rivolge? </h3>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla a odio lobortis, dictum arcu sit amet, egestas odio. Quisque interdum massa non mauris blandit interdum. Pellentesque non tempor leo, in interdum nunc. Sed sed purus in justo sodales dapibus et et justo. Aenean condimentum mi eget sem fringilla tincidunt. Aenean rutrum finibus massa. Etiam elementum ultrices ex eget volutpat. Quisque sit amet lacus libero. Praesent vitae ultrices ligula, vitae venenatis elit. Sed malesuada nisi maximus, cursus sem ac, placerat magna. Sed quis pellentesque ante. 
                        </p>     
                    </div>
                    <div class="faq">
                        <h3 id="iscrizione" > Come iscriversi?  </h3>
                        <p>
                            Quisque et tincidunt mi. Fusce non neque dapibus, malesuada lorem sed, viverra ligula. Aenean id justo ac orci blandit egestas sit amet eu arcu. Nunc posuere mauris sed erat rutrum, id scelerisque odio vulputate. Pellentesque nec rutrum diam. Sed dictum congue massa semper sollicitudin. Aliquam erat volutpat. Sed suscipit a magna euismod bibendum. Duis a tempor mi, ut finibus massa. Morbi tincidunt arcu diam, vitae aliquam purus aliquet eget. Proin imperdiet fermentum erat, sed tempus libero pellentesque eu. 
                        </p>
                    </div>
                    <div class="faq">
                        <h3 id="costo" > E gratis o a pagamento? </h3>
                        <p>
                            Donec nunc justo, eleifend tincidunt consectetur ac, sollicitudin accumsan orci. Integer sem nulla, imperdiet eu facilisis quis, auctor imperdiet velit. Duis facilisis egestas felis, eget malesuada magna semper at. Sed vitae dui ac diam auctor commodo. Fusce tincidunt id metus sed posuere. Etiam porttitor diam ut risus iaculis, at tempus libero tristique. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas in quam ut lacus efficitur cursus. Pellentesque laoreet arcu eget erat tincidunt, pellentesque auctor sapien egestas.  
                        </p>
                    </div>
                </div>
            </div>   
        </div>
    </body>
    
</html>

