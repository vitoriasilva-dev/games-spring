<%@ page language ="java" contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
   <head>
    <meta charset="UTF-8"/>
    <title> Nova Categoria</title>
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
       <div class="container">
        <h1>Nova Categoria</h1>
        <form action="/categoria/insert" method="post">
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" name="nome" class="form-control"/>
                </div>
      
        <br />
        <a hreaf="/categoria/list" class="btn btn-primary" >Voltar</a>
        <button type="submit" class="btn btn-sucess">Salvar</button>
        </form>
    </div>
    </body>
    </html>