<%@ page language ="java" contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <title>Editar Plataformas</title>
    <link href="https://cdn.jsdelivr.net/npm/boostrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

  </head>
  <body>
    <div class="container">
        <h1>Editar Plataforma</h1>
        <form action="/plataforma/update" method="post">
            <input type="hidden" name="id" value="${plataforma.id}"/>
            <div class="form-group">
                <label for="nome">Nome:</label>
                <input type="text" name="nome" class="form-control" value="${plataforma.nome}"/>
            </div>
            <br />
            <a href="/plataforma/list" class="btn btn-primary"> Voltar</a>
            <button type = "submit" class="btn btn-sucess">Salvar</button>
        </form>
    </div>
  </body>
</html>