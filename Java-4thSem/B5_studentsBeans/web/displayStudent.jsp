<%-- 
    Document   : displayStudent
    Created on : 4 Mar, 2026, 2:52:38 PM
    Author     : PRO
--%>
<%@page import="myBeans.StudentBeans"%>
<%@page  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Student Information</title>
    </head>
    <body>
        <h2>Student information</h2>
        <%
        StudentBeans student=(StudentBeans)
        session.getAttribute("student");
        if(student!=null){
            %>
            <p>Name:<%=student.getName()%></p>
            <p>Age:<%=student.getAge()%></p>
            <p>Course:<%=student.getCourse()%></p>
            <%
        }else{
            %>
            <p>No Student information available.please submit the form first.</p>
            <%
                }
            %>
    </body>
</html>
