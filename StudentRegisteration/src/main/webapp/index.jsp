<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>

<body>

    <h1>Student Registration Form</h1>

    <form action="register" method="post">

        <label>Name:</label>
        <input type="text" name="name">
        <br><br>

        <label>Email ID:</label>
        <input type="text" name="email">
        <br><br>

        <label>Course:</label>
        <input type="text" name="course">
        <br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>