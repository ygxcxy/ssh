<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: qiudaozhang
  Date: 2019/9/29
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <s:property value="province.name"/>
    </div>
    <hr>
    <h2>添加城市</h2>

    <s:form namespace="/province" action="addCity" method="POST">
        <s:textfield name="city.name" label="城市名称"></s:textfield>
        <s:hidden name="city.province.id" value='%{#action.province.id}'></s:hidden>

        <s:submit value="提交"/>
    </s:form>
    <hr>
    城市列表
    <s:iterator value="province.cities">
        <div><s:property value="name"></s:property> </div>
    </s:iterator>
</body>
</html>
