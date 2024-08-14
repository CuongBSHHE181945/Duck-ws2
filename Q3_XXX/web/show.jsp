<%-- 
    Document   : show
    Created on : Aug 14, 2024, 4:18:36 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div .col-sm-6>
            List of ID student
            <table border="1">
                <c:forEach var="id" items="${studentIdList}">
                    <tr>
                        <td>
                            <a href="show?studentId=${id}">
                                    ${id}
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div .col-sm-6>
            <form action="show" method="POST">
                <table border="1">
                    <tr>
                        <td>ID:</td>
                        <td>${chosenStudent.getStudentId()}</td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td>${chosenStudent.getStudentName()}</td>
                    </tr>
                    <tr>
                        <td>DATE OF BIRTH:</td>
                        <td>${chosenStudent.getBirthDate()}</td>
                    </tr>
                    <tr>
                        <td>Gender:</td>
                        <td>${chosenStudent.isGender()}</td>
                    </tr>
                    <tr>
                        <td>Major:</td>
                        <td>${chosenStudent.getMajorName()}</td>
                    </tr>
                </table>
                <input type="hidden" name="majorId" value="${chosenStudent.getMajorId()}"> 
                <input type="submit" value="choose">
            </form>
        </div>
    </body>
</html>
