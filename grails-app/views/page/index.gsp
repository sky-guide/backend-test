<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main">
    <title>Pages</title>
</head>
<body>
<h1>Pages</h1>
<table>
    <tr>
        <th>INDEX</th>
        <th>NAME</th>
        <th>VERSIONS</th>
    </tr>
    <g:each in="${pages}" var="page" status="index">
        <tr class="page-item">
            <td>${index+1}</td>
            <td><strong>${page.name}</strong></td>
            <td><g:link controller="page" action="show" params="['id': page.name]">versions</g:link></a></td>
        </tr>
    </g:each>
</table>
</body>
</html>