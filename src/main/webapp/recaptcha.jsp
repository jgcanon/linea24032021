<%-- 
    Document   : recaptcha
    Created on : 19/03/2021, 12:32:47 p. m.
    Author     : jgcan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>recaptcha</title>
         <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    </head>
    <body>
        <h1>fuck you</h1>
        
        <form action="controler" method="POST">
            <input placeholder="user" name="user" value="" size="40" required>
            <br>
            <input type="password" name="password" value="" size="40" required/>
      <div class="g-recaptcha" data-sitekey="6LfeQ4YaAAAAACamu3SnFG37pCdWjRAOI6QFKfjt"></div>
      <br/>
      <input type="submit" value="Submit">
    </form>
    </body>
</html>
 
