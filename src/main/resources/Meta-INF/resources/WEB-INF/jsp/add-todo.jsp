<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Enter a Todo</title>
</head>
<body>

<div class = "container">
    <div><h2>Enter todo details</h2></div>
    <form:form method="post" modelAttribute="todo">
        Description: <form:input type="text" path="description" class="form-control" required="required" />
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <form:errors path="description" cssClass="text-warning"/>
        <br/>
        <input type="submit" value="Submit" class="btn btn-success"/>
    </form:form>


    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
