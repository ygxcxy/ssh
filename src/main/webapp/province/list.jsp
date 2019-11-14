<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: qiudaozhang
  Date: 2019/9/29
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:a namespace="/province" action="toAdd">新增</s:a>
<table>
    <thead>
        <tr>
            <th>省份编号</th>
            <th>名称</th>
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
        <s:iterator value="provinces" >
           <tr>
               <td> <s:property value="id"/> </td>
               <td>
                <s:a namespace="/province" action="cities">
                    <s:param name="id" value="id"></s:param>
                    <s:property value="name"/>
                </s:a>
               </td>
               <td> <s:a namespace="/province" action="del" >
                   删除
                   <s:param name="id" value="id"></s:param>
               </s:a>
               </td>
           </tr>
        </s:iterator>
    </tbody>
</table>

</body>
</html>
