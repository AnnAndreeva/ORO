<%@page contentType="text/html;charset=UTF-8"%>
<%@page isErrorPage="true"%>
<html>
    <head>
        <title>Error Page</title>
    </head>

    <body>
        Ошибка!
        <%= exception.getMessage() %>
        <input type="button" onclick="history.back();" value="OK"/>
    </body>
</html>
