<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Task Manager Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Task List</h1>
            <h3><a href="/newTask">New Task</a></h3>
            <table border="1">
                <th>No</th>
                <th>Title</th>
                <th>Schedule_date</th>
                <th>Complete Date</th>
                <th>isComplete</th>
                <th>Action</th>
                 
                <c:forEach var="task" items="${listTask}">
                <tr>
                    <td>${task.id}</td>
                    <td>${task.title}</td>
                    <td>${task.scheduled_date}</td>
                    <td>${task.complete_date}</td>
                    <td>${task.isComplete}</td>
                    <td>
                        <%-- <a href="/editContact?id=${contact.id}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/deleteContact?id=${contact.id}">Delete</a> --%>
                    </td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>
