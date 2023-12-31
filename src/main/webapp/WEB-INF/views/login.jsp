<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pl">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Zaloguj mnie</title>
    <link rel="stylesheet" href="<c:url value="/static/css/style.css"/>"/>
  </head>
  <body>
  <%@ include file="header.jsp" %>

    <section class="login-page" id="login">
      <h2>Zaloguj się</h2>
      <form action="/login" method="post">
        <div class="form-group">
          <input type="email" name="email" placeholder="Email" />
        </div>
        <div class="form-group">
          <input type="password" name="password" placeholder="Hasło" />
          <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
          <a href="/register" class="btn btn--without-border">Załóż konto</a>
          <input class="btn" type="submit" value="Zaloguj się"/>
        </div>
      </form>
    </section>

    <%@ include file="footer.jsp" %>
    <script src="<c:url value="/static/js/app.js"/>">
    </script>
  </body>
</html>
