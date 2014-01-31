<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Page Versions</title>
</head>
<body>
<h1>Page Versions</h1>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>SCHEDULE TIME</th>
    </tr>
    <g:each in="${pages}" var="page" status="index">
        <tr class="page-item">
            <td><strong>${page.id}</strong></td>
            <td>${page.name}</td>
            <td>${page.scheduleTime}</td>
        </tr>
    </g:each>
</table>
</body>
</html>