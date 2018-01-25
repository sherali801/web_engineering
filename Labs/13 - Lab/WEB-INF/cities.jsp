<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>City</title>
    </head>
    <body>
        <table>
            <tr>
                <td>Student Name:</td>
                <td><input type="text" name="studentName"></td>
            </tr>
            <tr>
                <td>
                    <select name="province">
                        <option value="1">Punjab</option>
                        <option value="2">KPK</option>
                        <option value="3">Baluchistan</option>
                        <option value="4">Sindh</option>
                    </select>
                </td>
            </tr>
        </table>
        <div id="cities"></div>
    </body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>
        document.querySelector("select").addEventListener("change", getCities);
        function getCities() {
            current = this;
            var xhr = new XMLHttpRequest();
            xhr.open("POST", "getcities", true);
            xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
            xhr.setRequestHeader('X-Requested-With', 'XMLHttpRequest');
            xhr.onreadystatechange = function () {
                if (xhr.readyState == 4 && xhr.status == 200) {
                    var result = xhr.responseText;
                    var myNode = document.querySelector("#cities");
                    while (myNode.firstChild) {
                        myNode.removeChild(myNode.firstChild);
                    }
                    var select = document.createElement("select");
                    $.each(JSON.parse(result),function(index, value){
                        var option = document.createElement("option");
                        var text = document.createTextNode(value);
                        option.appendChild(text);
                        select.appendChild(option);
                    });
                    document.querySelector("#cities").appendChild(select);
                }
            };
            xhr.send("province=" + current.value);
        }
        </script>
</html>
