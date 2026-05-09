<%-- 
    Document   : process
    Created on : 4 Mar, 2026, 2:36:18 PM
    Author     : PRO
--%>

<%@page import="myBeans.StudentBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Processing Student Information</title>
    </head>
    <body>
        <%
        StudentBeans student =new StudentBeans();
        String name= request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));
        String course=request.getParameter("course");
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        session.setAttribute("student",student);
        %>
        <h2>Student Information Processed Successfully!</h2>
        <a href="displayStudent.jsp">Click Here</a>to view Student Information.
    </body>
  </html>
