<%--
  Created by IntelliJ IDEA.
  User: HenryXiao
  Date: 2019/8/2
  Time: 7:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
    <h4>查询所有用户信息</h4>
    <a href="/user/findAll">查询用户信息</a><br/><br/>

    <h4>删除账户操作</h4>
    <form action="/user/delAccount" method="post">
        用户id：<input type="text" name="id"><br/>
               <input type="submit" value="提交"><br/><br/>
    </form>
    <h4>添加用户操作</h4>
    <form action="/user/addAccount" method="post">
        用户id <input type="text" name="id"><br/>
        用户名：<input type="text" name="name"><br/>
        工资： <input type="text" name="salary"><br/>
               <input type="submit" value="提交">
    </form>

</body>
</html>
