<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/pages/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <br/>
            <br/>
            <br/>
            <h1>Product Inventory Page</h1>
            <p class="lead">You can maintain products here</p>
        </div>

        <table class="table table-stripped table-hover">
            <tr class="bg-success">
                <th>Photo</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
                <th></th>
            </tr>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td><img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="Image"
                             style="width: 90px; height: 90px"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice}</td>
                    <td><a href="<c:url value="/product/viewProduct/${product.productId}"/>">
                            <span class="glyphicon glyphicon-info-sign"></span></a>
                        <a href="<c:url value="/admin/product/editProduct/${product.productId}"/>">
                            <span class="glyphicon glyphicon-pencil"></span></a>
                        <a href="<c:url value="/admin/product/deleteProduct/${product.productId}"/>">
                        <span class="glyphicon glyphicon-remove-sign"></span></a>
                    </td>
                </tr>
            </c:forEach>

        </table>
        <a href="<c:url value="/admin/product/addProduct"/>" class="btn btn-primary">Add Product</a>

        <%@include file="/WEB-INF/pages/template/footer.jsp" %>
