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
        <style>
            .container {
                display: table;
                width: 100%;
            }
            .col {
                display: table-cell;
                vertical-align: top;
                padding-right: 10px; /* Minimal spacing between columns */
            }
            .col:last-child {
                padding-right: 0; /* No padding for the last column */
            }
        </style>
    </head>
    <body>
        <div class="container">
            <!-- List of ID student -->
            <div class="col">
                <h3>List of ID student</h3>
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

            <!-- Student Information -->
            <div class="col">
                <form action="show" method="POST">
                    <h3>Student Information</h3>
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
                            <td>Date of Birth:</td>
                            <td>${chosenStudent.getBirthDate()}</td>
                        </tr>
                        <tr>
                            <td>Gender:</td>
                            <td>
                                <img src="${chosenStudent.isGender()? 'male.png' : 'female.png'}" 
                                     alt="${chosenStudent.isGender()? 'Male' : 'Female'}" />
                            </td>
                        </tr>
                        <tr>
                            <td>Major:</td>
                            <td>${chosenStudent.getMajorName()}</td>
                        </tr>
                    </table>
                    <input type="hidden" name="majorId" value="${chosenStudent.getMajorId()}"> 
                    <input type="hidden" name="studentId" value="${chosenStudent.getStudentId()}"> 
                    <input type="submit" value="Choose">
                </form>
            </div>
        </div>

        <!-- List of students by major -->
        <div class="container">
            <div class="col">
                <c:forEach var="student" items="${studentListByMajor}">
                    <h3>Student Details</h3>
                    <table border="1">
                        <tr>
                            <td>ID:</td>
                            <td>${student.getStudentId()}</td>
                        </tr>
                        <tr>
                            <td>Name:</td>
                            <td>${student.getStudentName()}</td>
                        </tr>
                        <tr>
                            <td>Date of Birth:</td>
                            <td>${student.getBirthDate()}</td>
                        </tr>
                        <tr>
                            <td>Gender:</td>
                            <td>
                                <img src="${student.isGender()? 'male.png' : 'female.png'}" 
                                     alt="${student.isGender()? 'Male' : 'Female'}" />
                            </td>
                        </tr>
                        <tr>
                            <td>Major:</td>
                            <td>${student.getMajorName()}</td>
                        </tr>
                    </table>        
                </c:forEach>
            </div>
        </div>
    </body>
</html>
