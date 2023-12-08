<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>

<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="/static/css/style.css"/>"/>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="container container--85">
    <h2> Dziękujemy za dary.</h2>
    <h1> Twoja darowizna to:</h1>
    <h1> Liczba worków: ${donation.quantity}</h1>

    <h1>Kategorie:</h1>
    <c:forEach var="category" items="${donation.categories}" varStatus="loop">
        <h1>${category.name}</h1>
    </c:forEach>
    <br>

    <h1> Dla: ${donation.institution.name}</h1>>
    <h1> Miasto: ${donation.city}</h1>
    <h1>Ulica: ${donation.street}</h1>
    <h1>Kod: ${donation.zipCode}</h1>
    <h1>Telefon: ${donation.phone}</h1>
    <h1>Odbiór: ${donation.pickUpDate}</h1>
    <h1>Godzina: ${donation.pickUpTime}</h1>
    <h1>Uwagi: ${donation.pickUpComment}</h1>
    <br>
</div>
<%@ include file="footer.jsp" %>
<script src="<c:url value="/static/js/app.js"/>"></script>
</body>
</html>
