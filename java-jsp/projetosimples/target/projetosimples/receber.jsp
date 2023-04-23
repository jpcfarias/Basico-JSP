<html>
<body>
<%
    String nome = request.getParameter("nome");
    out.print("Nome: "+ nome);
%>
<br/>
<%
    String idade = request.getParameter("idade");
    out.print("Idade: "+ idade);
%>
</body>
</html>