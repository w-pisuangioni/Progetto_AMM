<%-- 
    Document   : left-bar
    Created on : 5-giu-2017, 10.47.00
    Author     : pisuw
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <!--<div id="leftbar">-->
            <p id="Persone">
                  <c:forEach items="${utenti}" var="utente" >
                     <li>${utente.nome}</li>
                  </c:forEach>
            </p>
            <p id="Gruppi">
                <strong>Gruppi</strong> 
                                
                  <c:forEach items="${gruppi}" var="gruppo" >
                     <li>${utente.nome}</li>
                  </c:forEach>
                
            </p>  
        <!--</div>-->
    </body>
</html>
