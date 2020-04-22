<%--
  Created by IntelliJ IDEA.
  User: ZhaoDong
  Date: 2020/4/18
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
    <script>
      function a() {
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data,status) {
            console.log(data);
            console.log(status);
          }
        })
      }
    </script>
  </head>
  <body>
  <%--失去焦点的时候，发起一个请求（携带信息）到后台--%>
  username:<input type="text" id="username" onblur="a()">
  </body>
</html>
