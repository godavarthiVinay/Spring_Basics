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

    <form action="/registration.htm" method="post">
        <div>
            <h3>Name:</h3>
            <input type="text" name="name"/>
        </div>
        <br>
        <div>
            <h3>emailId:</h3>
            <input type="text" name="emailId"/>
        </div>
        <div>
            <h3>Address:</h3>
            <input type="text" name="address"/>
        </div>
        <br>
        <div>
            <h3>Phone number:</h3>
            <input type="number" name="mobileNumber"/>
        </div>
        <br>
        <div>
            <input type="submit" value="Submit"/>
        </div>
    </form>




</div>


</body>
</html>
