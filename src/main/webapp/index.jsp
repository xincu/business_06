<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/30 0030
  Time: 上午 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
    index 页面
</h2>
<form method="post" action="/addBook">
    <input type="submit" value="新增提交">
</form>
<%--获取用户来源列表--%>
<form  method="post" action="/list">
    <input type="submit" value="展示来源列表">
</form>
<form method="post" action="/showPageList">
    <input type="text" name="custName">
    <input type="hidden" name="custSource">
    <input type="hidden" name="custIndustry">
    <input type="hidden" name="custLevel">
    <input type="text" name="pageNum">
    <input type="text" name="pageSize">
    <input type="submit" value="确认查询">
</form>
<%--获取用户级别列表--%>
<%--获取用户所属列表--%>

<form method="post" action="/updateCustomer">
    <input type="text" name="custId">
    <input type="text" name="custName">
    <input type="text" name="custSource">
    <input type="text" name="custIndustry">
    <input type="text" name="custLevel">
<input type="submit">
</form>>
<form method="post" action="/deleteCustomer">
<input type="text" name="custId">
<input type="submit" value="确认查询">
</form>
</body>
</html>
