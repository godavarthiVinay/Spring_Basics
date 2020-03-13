
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Hello Page</title>
  </head>
  <body>
  <div style="width:100%;height: 100%;align-items: center">
    <h2>Hello world</h2>
    <form action="./hello.htm">
      Name:<input type="text" name="name"/>
      Submit:<input type="submit" value="submit" />
    </form>
    <hr>
    ${msg}


  </div>
  </body>
</html>
