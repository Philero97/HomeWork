<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Orders</title>
    </head>

    <body>
        <h1>Products</h1>
        <ul>
            <c:forEach items="${orders}" var="order">
                <li>
                    <p>ID: <c:out value="${order.id}"/></p>
                    <p>NAME: <c:out value="${order.name}"/></p>
                    <p>PRICE: <c:out value="${order.price}"/></p>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>