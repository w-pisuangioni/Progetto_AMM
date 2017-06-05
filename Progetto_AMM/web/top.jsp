<%-- 
    Document   : header
    Author     : William Pisu 
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <div id="top">
            <header>
                <div id="Title">
                    <h1>NerdBook</h1>  
                </div> 
            </header>
            <nav> <!-- Barra di navigazione  -->  
                <ul>
                    <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.html"> Profilo </a></li>
                    <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="bacheca.html"> Bacheca </a></li>
                    <li <c:if test="${page=='descrizione'}">class="active"</c:if>><a href="descrizione.html"> Descrizione </a></li>
                    <li <c:if test="${page=='login'}">class="active"</c:if>><a href="login.html"> Login </a></li>
                </ul>
            </nav>
            <div id="log">
                <h4>USER</h4>
              <!--  img username 
                      link log out -->
            </div>
  </div>
        
        