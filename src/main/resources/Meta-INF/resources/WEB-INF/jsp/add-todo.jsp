<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


<div class = "container">
    <div><h2>Enter todo details</h2></div>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" class="form-control" required="required" />
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" class="form-control" required="required" />
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>

        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <br/>
        <input type="submit" value="Submit" class="btn btn-success"/>
    </form:form>


    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

</div>
<%@ include file="common/footer.jspf"%>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>