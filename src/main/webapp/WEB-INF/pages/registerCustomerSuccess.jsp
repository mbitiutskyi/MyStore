<%@include file="/WEB-INF/pages/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h3>Customer has been registered successfully</h3>
                </div>
            </div>
        </section>
        <section class="container">
            <p>
                <a href="<c:url value="/product/productList"/>" class="btn btn-default">Products</a>
            </p>


        </section>

        <script src="<c:url value="/resources/js/controller.js"/>"></script>
<%@include file="/WEB-INF/pages/template/footer.jsp" %>