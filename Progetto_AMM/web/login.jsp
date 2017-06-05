<%-- 
    Document   : login
    Created on : 12-mag-2017, 22.23.25
    Author     : pisuw
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>       
    <head>
        <title>NerdBook - Login </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="William Pisu">
        <meta name="keywords" content="NerdBook, login">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>    
    
    <body>
        <c:set var="title" value="Login" scope="request"/>
 
        
        <div id="topLogin">
            <header class="loginold">
                <div id="Title">
                    <h1><span>NerdBook</span></h1>  
                </div> 
            </header>
        </div>
        
        <div id="LoginBody">
            <div id="Logincontenent">
                <c:if test="${invalidData == true}">
                    <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                </c:if>
                <form action="login.html" method="post">  
                    
                    <div class="inp">
                        <label for="username">User Name: </label>
                        <input type="text" name="username" id="username" value="inserisci qui l'username" />
                    </div>
                    <div class="inp">
                        <label for="password"> Password: </label>
                        <input type="password" name="password" id="password" value="oscurato" />
                    </div>
                    <div class="inp">
                        <button type="submit">Login</button>
                    </div>



                </form>
            </div>
        </div>
    </body>
</html>
