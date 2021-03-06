<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/pages/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <br/>
            <br/>
            <br/>
            <h1>Register Customer</h1>
            <p class="lead">Please fill up the below fields to register a customer:</p>
        </div>

        <form:form method="post" action="${pageContext.request.contextPath}/register"
                   modelAttribute="customer">

            <h3>Basic information</h3>
            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="customerName" id="name" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="email">Email</label>
                <form:input path="customerEmail" id="email" class="form-control"/>
                <form:errors path="customerEmail" cssStyle="color: red">${emailMsg}</form:errors>
            </div>

            <div class="form-group">
                <label for="phone">Phone</label>
                <form:input path="customerPhone" id="phone" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="username">Username</label>
                <form:input path="username" id="username" class="form-control"/>
                <form:errors path="username" cssStyle="color: red">${usernameMsg}</form:errors>
            </div>

            <div class="form-group">
                <label for="password">Password</label>
                <form:password path="password" id="password" class="form-control"/>
                <form:errors path="password" cssStyle="color: red"/>
            </div>

            <h3>Billing Address</h3>
            <div class="form-group">
                <label for="billingStreet">Street Name</label>
                <form:input path="billingAddress.streetName" id="billingStreet" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="billingApartmentNumber">Apartment Number</label>
                <form:input path="billingAddress.apartmentNumber" id="billingApartmentNumber" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="billingCity">City</label>
                <form:input path="billingAddress.city" id="billingCity" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="billingState">State</label>
                <form:input path="billingAddress.state" id="billingState" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="billingCountry">Country</label>
                <form:input path="billingAddress.country" id="billingCountry" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="billingZipCode">Zipcode</label>
                <form:input path="billingAddress.zipCode" id="billingZipCode" class="form-control"/>
            </div>

            <h3>Shipping Address</h3>
            <div class="form-group">
                <label for="shippingStreet">Street Name</label>
                <form:input path="shippingAddress.streetName" id="shippingStreet" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="shippingApartmentNumber">Apartment Number</label>
                <form:input path="shippingAddress.apartmentNumber" id="shippingApartmentNumber" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="shippingCity">City</label>
                <form:input path="shippingAddress.city" id="shippingCity" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="shippingState">State</label>
                <form:input path="shippingAddress.state" id="shippingState" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="shippingCountry">Country</label>
                <form:input path="shippingAddress.country" id="shippingCountry" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="shippingZipCode">Zipcode</label>
                <form:input path="shippingAddress.zipCode" id="shippingZipCode" class="form-control"/>
            </div>

            <br>
            <br>
            <input type="submit" value="Submit" class="btn btn-default">
            <a href="<c:url value="/"/>" class="btn btn-default">Cancel</a>
        </form:form>

        <%@include file="/WEB-INF/pages/template/footer.jsp" %>
