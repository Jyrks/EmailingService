<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>History</title>
</head>
<body>

<h1>History</h1>

<s:iterator value="listAddress" status="stat">
    <div style="padding-bottom: 20px">
        <s:url action="showAddressEmails" var="urlTag" >
            <s:param name="address"><s:property /></s:param>
        </s:url>
        <s:a href="%{urlTag}"><s:property /></s:a>
    </div>
</s:iterator>

</body>
</html>
