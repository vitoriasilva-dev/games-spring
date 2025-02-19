<%@ page language ="java" contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
   <head>
    <meta charset="UTF-8"/>
    <title>Categoria</title>
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h1>Categorias</h1>
            <a hreaf="/categoria/insert" class=""btn btn-primary">Novo Categoria</a>
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>&nbsp;</th>
                </tr>
                <c:forEach var="item" items="${categorias}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.nome}</td>
                        <td>
                            <a hreaf="/categoria/update?id=${item.id}" class="btn btn-warning">Editar</a>
                            <a hreaf="/categoria/delete?id={item.id}" class="btn btn-danger"</a>
                        </td>
                    </tr>
                </c:forEach>
                </table>
        </div>
        </body>
        </html>