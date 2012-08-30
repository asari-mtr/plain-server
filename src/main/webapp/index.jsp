<%@ page import="java.util.*" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <% for (Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();) { %>
        <% String key = e.nextElement(); %>
        <dl>
            <dt><%=key%></dt>
        <% for (Enumeration<String> e2 = request.getHeaders(key); e2.hasMoreElements();) { %>
            <dd><%=e2.nextElement()%></dd>
        </dl>
        <% } %>
    <% } %>
</body>
</html>
