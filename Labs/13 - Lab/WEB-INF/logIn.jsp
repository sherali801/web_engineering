<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn</title>
    </head>
    <body>
        <form action="/13 - Lab/login" method="post">
            <table>
                <tr>
                    <td>Login:</td>
                    <td><input type="text" name="logInName" placeholder="LogIn Name"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" placeholder="********"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="LogIn!"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
