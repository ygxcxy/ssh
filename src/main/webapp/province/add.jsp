<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: qiudaozhang
  Date: 2019/9/29
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:form namespace="/province" action="add" method="POST">
        <s:textfield name="name" label="名称"></s:textfield>
        <s:submit value="提交"/>
    </s:form>
</body>
</html>
