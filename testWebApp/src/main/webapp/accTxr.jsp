<%--
  Created by IntelliJ IDEA.
  User: DEV
  Date: 08-12-2016
  Time: 09:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.miristan.webapp.servlets.*" %>
<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <title>Account Transfer</title>
</head>

<body>


<% Counter.incCount();   %> <!-- scriptlet -->
<%= "value of the counter is : "+Counter.getCount() %> <!-- expression is fed into out.println(); -->
<br>
<%! int counter2 = 0; %>    <!-- declaration -->
<%= "this the value of the second counter :"+(++counter2) %>
<br>
<%= "value of the attribute time in the session context :"+application.getAttribute("time")%>
<br>
<% response.getWriter().println("this message is printed using the response implicit object "); %>
<br>

<% request.setAttribute("time2","463466"); %>

${"expression language statement"} <!-- EL Expression simplifies the syntax-->
${time2}

<H1 align="center">Welcome to Bank of Honalulu</H1>

<H2> Accounts Transfer Page</H2>

<H4> Hi! <%= request.getSession().getAttribute("username")%>  <%=request.getSession().getAttribute("password")%> </H4>
<H4> Hi! <%= session.getAttribute("username")%>  <%= session.getAttribute("password")%> </H4>


</body>
</html>
