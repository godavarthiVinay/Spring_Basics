<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 12/11/19
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>sucessfully registred</h1>
<h3>${name}</h3>
<h3>${address}</h3>
<h3>${emailId}</h3>
<h3>${mobileNumber}</h3>
<h3>${requestScope.get("name")}</h3>
<h3>${requestScope.get("address")}</h3>
<h3>${requestScope.get("emailId")}</h3>
<h3>${pageContext.getAttribute("name")}</h3>

</body>
</html>
