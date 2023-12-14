<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<header class="header--main-page">
    <nav class="container container--70">
        <c:choose>
            <c:when test="${empty loggedInUser}">
                <!-- Content for users who are not logged in -->
                <ul class="nav--actions">
                    <li><a href="/login" class="btn btn--small btn--without-border">Zaloguj</a></li>
                    <li><a href="/register" class="btn btn--small btn--highlighted">Zarejestruj</a></li>
                </ul>
            </c:when>
            <c:otherwise>
                <!-- Content for users who are logged in -->
                <ul class="nav--actions">
                    <li><a href="/logout" class="btn btn--small btn--without-border">Wyloguj</a></li>
                    <!-- Add other links for logged-in users here -->
                </ul>
            </c:otherwise>
        </c:choose>
        <ul>
            <li><a href="/" class="btn btn--without-border active">Start</a></li>
            <li><a href="#" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="#" class="btn btn--without-border">O nas</a></li>
            <li><a href="#" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="/donations/add#sectionOne" class="btn btn--without-border">Przekaż dary</a></li>
            <li><a href="#" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>

    <div class="slogan container container--90">
        <div class="slogan--item">
            <h1>
                Zacznij pomagać!<br/>
                Oddaj niechciane rzeczy w zaufane ręce
            </h1>
        </div>
    </div>
</header>

