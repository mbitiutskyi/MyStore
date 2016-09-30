<%@include file="/WEB-INF/pages/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <br/>
            <br/>
            <br/>
            <h1>Administrator Page</h1>
            <p class="lead">This is an administrator page</p>
        </div>

        <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>Welcome, ${pageContext.request.userPrincipal.name}</h2>
        <h4><a href="<c:url value="/j_spring_security_logout"/>">Logout</a></h4>
        </c:if>

        <h3><a href="<c:url value="/admin/productInventory"/>">Product Inventory</a></h3>
        <p>Here you can view, change product inventory etc</p>
        <br><br>
        <h3><a href="<c:url value="/admin/customer"/>">Customer Management</a></h3>
        <p>Here you can view the customer information</p>

<%@include file="/WEB-INF/pages/template/footer.jsp" %>
