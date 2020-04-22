<%--
  Created by IntelliJ IDEA.
  User: ZhaoDong
  Date: 2020/4/20
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>

    <script>
        function a() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"name":$("#uname").val()},
                success:function (data) {
                    if(data.toString()==="ok"){
                        $("#userInfo").css("color","green");
                    }else{
                        $("#pwdInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function b() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"pwd":$("#pwd").val()},
                success:function (data) {
                    if(data.toString()==="ok"){
                        $("#pwdInfo").css("color","green");
                    }else{
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
<p>
    用户名：
    <input type="text" id="uname" onblur="a()">
    <span id="userInfo"></span>
</p>
<p>
    密码：
    <input type="text" id="pwd" onblur="b()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>
