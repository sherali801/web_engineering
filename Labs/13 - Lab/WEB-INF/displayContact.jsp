<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
    </head>
    <body>
        <jsp:useBean id="user" class="bean.UserBean" scope="request" />
        <jsp:setProperty name="user" property="*" />
        <table>
            <tr>
                <th>Name</th>
                <th>Mobile</th>
                <th>Eamil</th>
                <th>LogIn Name</th>
            </tr>
            <tr>
                <td><jsp:getProperty name="user" property="name" /></td>
                <td><jsp:getProperty name="user" property="mobile" /></td>
                <td><jsp:getProperty name="user" property="email" /></td>
                <td><jsp:getProperty name="user" property="logInName" /></td>
            </tr>
        </table>
    </body>
</html>
