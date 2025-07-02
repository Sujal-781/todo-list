<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div>
    <h1>Welcome ${name}</h1>
    <div>
        Your name is ${name}
    </div>
    <div>
        <a href = "todo-list">Manage</a> your todos.
    </div>
</div>
<%@ include file="common/footer.jspf"%>