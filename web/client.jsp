<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./ClientServlet" method="POST">
            <table>
                <tr>
                    <td>Client ID:</td>
                    <td><input type="text" name="id" value="${client.id}"></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="${client.name}"></td>
                </tr>
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age" value="${client.age}"></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input type="text" name="address" value="${client.address}"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="operation" value="Submit"</td>
                </tr>
            </table>
                
        </form>
                <br />
                <table border="1">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                    <c:forEach items="${allClients}" var="cli">
                    <tr>
                        <td>${cli.id}</td>
                        <td>${cli.name}</td>
                        <td>${cli.age}</td>
                        <td>${cli.address}</td>
                    </tr>
                    
                    </c:forEach>
                </table>
    </body>
</html>
