<%--
  Created by IntelliJ IDEA.
  User: MOKREUWEI
  Date: 6/3/2020
  Time: 上午 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>selectStudent</title>
</head>
<body>

<form action="student/21" method="GET">
    <input type="submit" value="查询lck信息"/>
</form>

<form action="student/22" method="GET">
    <input type="submit" value="查询mrw信息"/>
</form>

<form action="student/22" method="post">
    <input type="hidden" name="_method" value="delete"/>
    <input type="submit" value="删除mrw信息"/>
</form>

<form action="student/22" method="post">
    <input type="hidden" name="_method" value="put"/>
    <input type="submit" value="更新mrw信息"/>
</form>

</body>
</html>

