<%--
  Created by IntelliJ IDEA.
  User: ZhaoDong
  Date: 2020/4/20
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                //*$.post （url , param[可以省略] , success）*/
                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    // console.log(data);
                    var html="";
                    for (let i = 0; i <data.length ; i++) {
                        html +="<tr>" +
                                "<td>" + data[i].name + "</td>" +
                                "<td>" + data[i].age + "</td>" +
                                "<td>" + data[i].sex + "</td>" +
                                "</tr>"
                    }
                    $("#content").html(html);
                })
            })
        });
    </script>
</head>
<body>
<input type="submit" id="btn" value="点击获取数据">
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <tbody id="content">
    <%--数据：后台的--%>
    </tbody>
</table>
</body>
</html>
