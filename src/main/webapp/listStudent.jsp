<%--
  Created by IntelliJ IDEA.
  User: zzz
  Date: 2021/5/31
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.0.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"student/select.do",
                    type:"get",
                    dataType:"json",
                    success:function (data) {
                        $("#info").html("");

                        $.each(data,function (i,n) {
                            $("#info").append("<tr>")
                                .append("<td>"+n.id+"</td>")
                                .append("<td>"+n.name+"</td>")
                                .append("<td>"+n.age+"</td>")
                                .append("</tr>")
                        })
                    }
                })
            })
        })
    </script>
</head>
<body>
<div align="center">
    <table>
        <thead>
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
        </thead>
        <tbody id="info">

        </tbody>
        <input type="button" id="btn" value="查询">
    </table>
</div>
</body>
</html>
