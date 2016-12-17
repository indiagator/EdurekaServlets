<%--
  Created by IntelliJ IDEA.
  User: DEV
  Date: 06-12-2016
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%><html>
<%@ page isELIgnored="false" %>
<head>
    <title>Test Page 1</title>
</head>
<body>

${100.0 == 100}
${param.firstname}
${time}

<h1>Hello <%= request.getParameter("firstname") + "  "+ request.getParameter("lastname")  %></h1>

</body>
</html>
