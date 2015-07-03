<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emails</title>
</head>
<body>

<h1>Emails:</h1>

<s:iterator value="listContent" >
    <div style="padding-bottom: 20px">
        <s:property value="content"/>
    </div>
</s:iterator>

</body>
</html>
