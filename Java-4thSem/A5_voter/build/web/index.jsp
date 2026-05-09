<%-- 
    Document   : index
    Created on : Mar 11, 2026, 11:59:35 AM
    Author     : mr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                margin:1rem;
                background: aqua;
                border-radius:5px;
                border:2px solid #3100d9;
                padding:0.5rem;
            }
            td{
                text-align: center;
                font-size: 2vw;
                color:#170067;
            }
            input[type="submit"] {
                background:#170067;
                padding:0.5rem;
                color:aqua;
                border-radius: 200px;
                border:none;
            }
        </style>
    </head>
    <body>
        <form method="POST" action="CheckvoterServlet.java">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><input type="number" name="userage"></td>
                </tr>

                <tr>
                    <td>Submit</td>
                    <td><input type="submit" name="username" value="Check voting eligibility"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
