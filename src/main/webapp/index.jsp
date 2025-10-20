<%@page import="dao.ListaCliente"%>
<%@page import="dao.ListaSimpleCliente"%>
<%@page import="dto.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <%
            Cliente c1= new Cliente("Carlos");
            Cliente c2= new Cliente("Juan");
            
            ListaSimpleCliente lista= new ListaSimpleCliente();
            lista.agregar(c1);
            lista.agregar(c2);
            out.print(lista.imprimir());
                 
            ListaCliente listadoble= new ListaCliente();
            listadoble.agregar(c1);
            listadoble.agregar(c2);
            out.print(listadoble.imprimir());
        %>
    </body>
</html>
