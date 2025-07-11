<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Todo List</title>
</head>
<body>

<div class = "container">
    <div><h1>Welcome</h1> ${name}</div>
    <div><h2>Here is the list of Todos:</h2></div>

    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <table class = "table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Done</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="todo" items="${todos}">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a href="update-todo?id=${todo.id}" class="btn btn-check">Update</a></td>
                <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning"> Delete</a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href = "add-todo" class = "btn btn-success">Add Todo</a>

</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
