<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Email Service</title>

    <style>
        .menu ul {
            padding: 0;
        }

        .menu ul li {
            display: inline;
        }

        .menu ul li a {
            background-color: black;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 4px 4px 0 0;
        }
    </style>
</head>

<body>
<div class="menu">
    <ul>
        <li>
            <s:url action="listEmail" var="urlTag"/>
            <s:a href="%{urlTag}">History</s:a>
        </li>
    </ul>
</div>


<h1>Welcome To The Email Service!</h1>
<form action="saveEmail.action">
    <div>
        <label for="address">Address</label>
    </div>
    <div>
        <input type="text" id="address" name="address">
    </div>
    <div>
        <label for="content">Email</label>
    </div>
    <div>
        <textarea rows="4" cols="50" id="content" name="content"></textarea>
    </div>
    <input type="submit" value="Send">
</form>
</body>
</html>
