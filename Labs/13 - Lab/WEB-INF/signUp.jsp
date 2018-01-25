<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>
    </head>
    <body>
        <form action="/13 - Lab/signup" method="post">
            <table>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstName" placeholder="First Name"></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastName" placeholder="Last Name"></td>
                </tr>
                <tr>
                    <td>Mobile:</td>
                    <td><input type="text" name="mobile" placeholder="Mobile"></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" placeholder="Email"></td>
                </tr>
                <tr>
                    <td>LogIn Name:</td>
                    <td><input type="text" name="logInName" placeholder="LogIn Name"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" placeholder="********"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="SignUp!"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
