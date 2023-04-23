<%@ page isELIgnored="false" %>
<html>
    <head>
        <h2>Estudando jsp tranquilin</h2>
        <h3>testando 1...</h3>
    </head>
    <body>

    <form action="ServletsLogin" method="post">
        <table>
            <tr>
                <td><label>Login:</label></td>
                <td><input name="login" type="text"></td>
            </tr>

            <tr>
                <td><label>Senha:</label></td>
                <td><input name="senha" type="password"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Enviar"></td>
            </tr>
        </table>
    </form>

    <h4>${msg}</h4>

    </body>
</html>