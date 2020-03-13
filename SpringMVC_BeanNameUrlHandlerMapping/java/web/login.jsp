<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyTravels</title>
</head>
<body style="width: 100%;height: 100%;display: flex;justify-content: center;align-items: flex-start;background-color: antiquewhite;flex-direction: column" >
<h1 style="align-items: center">WELCOME TO <b style="color: blue">MY TOURS AND TRAVELS</b></h1>
<hr>
<br>
<div style="display: flex;justify-content: center;align-items: center">

    <form action="/login.htm" method="post">
        <div>
            <h3>Username:</h3>
            <input type="text" name="username"/>
        </div>
        <br>
        <div>
            <h3>password:</h3>
            <input type="password" name="password"/>
        </div>
        <br>
        <div>
            <input type="submit" value="login"/>
        </div>
    </form>




</div>


</body>
</html>
