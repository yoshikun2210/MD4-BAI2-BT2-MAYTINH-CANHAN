<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculator</h1>
<form action="", method="post">
    <div>
        <input name="num1" value="${num1}">
        <input name="num2" value="${num2}">

    </div>
    <div>
        <input type="submit", name="cal" value="+">
        <input type="submit", name="cal" value="-">
        <input type="submit", name="cal" value="*">
        <input type="submit", name="cal" value="/">
    </div>
</form>
<h1>Result ${result}</h1>

</body>
</html>