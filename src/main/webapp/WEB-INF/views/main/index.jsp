<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>MyServlet</title>
    <style type="text/css">
        body{
            text-align: center;
            margin: 0;
            background-color: blanchedalmond;
            background-repeat: no-repeat;
        }
        h1 {
            margin-top: 10px;
        }
        ul {
            display: table;
            margin: auto;
        }
        li {
            list-style-type: none; 
        }

    </style>
</head>
<body class="text/css">

<h1>Hello World!</h1><br />

<img width="400" height="250" src="https://andreyex.ru/wp-content/uploads/2018/05/Kak-ustanovit-Java-s-apt-na-Ubuntu-18.04.jpg" alt="Java logo">

<h2>Список участников Java-интенсива</h2><br />

<c:forEach var="user" items="${requestScope.users}">
    <ul>

        <li>Имя: <c:out value="${user.name}"/></li>

        <li>Порядковый номер: <c:out value="${user.id}"/></li>
    </ul>
    <hr />

</c:forEach>

</body>
</html>
