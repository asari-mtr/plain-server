<%@ page import="java.util.*" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <% for (Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();) { %>
    <%= e.nextElement() %><br/>
    <% } %>
</body>
</html>
