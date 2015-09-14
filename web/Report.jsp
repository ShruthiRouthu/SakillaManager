<%--
    Document   : Report
    Created on : Sep 14, 2015, 11:10:03 AM
    Author     : Professional
--%>

<%@page import="Model.Actor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
    </head>
    <body>
        
        <c:if test = "${actorList != null}">
            <h1> Actors </h1>
            <table class="table table-bordered table-striped table-condensed">
                <%
                    Object obj = request.getAttribute("actorList");
                    Actor[] actList = (Actor[])obj;
                    for(Actor i: actList)
                    {
                       out.print( "<tr> <td>" + i.getActorID() + "</td>" +
                                      "<td>" + i.getFirstName() + "</td>" +
                                      "<td>" + i.getLastName() + "</td> </tr> " );
                                      
                    }
                %> 
            </table>
        </c:if>
       
    </body>
</html>
