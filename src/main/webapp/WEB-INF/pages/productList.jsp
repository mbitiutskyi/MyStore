<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/pages/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <br/>
            <br/>
            <br/>
            <h1>All Products</h1>
            <p class="lead">Checkout all the products available now</p>
        </div>

        <table class="table table-stripped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Photo</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th>Details</th>
            </tr>
            </thead>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="Image" style="width: 90px; height: 90px"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice}</td>
                    <td><a href="<c:url value="/product/viewProduct/${product.productId}"/>"><span class="glyphicon glyphicon-info-sign"></span></a></td>
                </tr>
            </c:forEach>

        </table>

<%@include file="/WEB-INF/pages/template/footer.jsp" %>
