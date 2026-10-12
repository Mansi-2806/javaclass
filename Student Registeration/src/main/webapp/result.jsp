<%@ page contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>

<html>

<head>

    <title>Registration Result</title>

    <style>

        body {
            font-family: Arial;
            background-color: #f2f2f2;
        }

        .container {
            width: 500px;
            margin: 50px auto;
            padding: 25px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        .success {
            color: green;
        }

        .error {
            color: red;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        td {
            padding: 10px;
            border: 1px solid #ddd;
        }

    </style>

</head>

<body>

<div class="container">

    <!-- Check whether registration was successful -->

    <c:choose>

        <c:when test="${not empty error}">

            <h2 class="error">
                Registration Failed
            </h2>

            <p class="error">
                ${error}
            </p>

            <a href="register.jsp">
                Go Back to Registration
            </a>

        </c:when>


        <c:otherwise>

            <h2 class="success">
                Registration Successful
            </h2>

            <table>

                <tr>
                    <td><strong>Student Name</strong></td>
                    <td>${name}</td>
                </tr>

                <tr>
                    <td><strong>Email ID</strong></td>
                    <td>${email}</td>
                </tr>

                <tr>
                    <td><strong>Course</strong></td>
                    <td>${course}</td>
                </tr>

            </table>

            <br>

            <a href="register.jsp">
                Register Another Student
            </a>

        </c:otherwise>

    </c:choose>

</div>

</body>

</html>