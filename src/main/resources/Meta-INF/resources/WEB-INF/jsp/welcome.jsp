<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container mt-5">
    <div class="card shadow-lg border-0 rounded-3">
        <div class="card-body text-center">
            <h1 class="card-title display-4 text-primary">Welcome, ${name}!</h1>
            <p class="card-text fs-5">We're glad to have you here.</p>
            <p class="card-text text-muted">Your name is <strong>${name}</strong>.</p>
            <a href="todo-list" class="btn btn-success btn-lg mt-3">Manage Your Todos</a>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf"%>