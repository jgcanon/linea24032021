<%-- 
    Document   : inicio
    Created on : 22/03/2021, 3:50:54 p. m.
    Author     : jgcan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-wisth, initial-scale=1.0">
        <link href="bootstrap-5.0.0-beta2-dist/css/bootstrap.rtl.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://www.google.com/recaptcha/api.js" async defer></script>
    </head>
    <body>
        <img src="Abstracto en HD.jpg" width="1180" height="200"/>
        <h1>Hello World!</h1>
    
        <form action="anadir" method="POST">
        <div class="container">       
            <div class="row">
                <div class="col-md-4">
                    <label>Nombre</label>
                    <input type="text" class="form-control" name="nombre"><!-- comment -->
                    <label>Apellido</label>
                    <input type="text" class="form-control" name="last">
                </div>
                
                <div class="register">
                    <label>Correo</label>
                    <input type="text" class="form-control" name="email"><!-- comment -->
                    <label>Clave</label>
                    <input type="password" class="form-control" name="pass">
                </div>
                    
                <div class="col-md-4">
                    <label>Direccion</label>
                    <input type="text" class="form-control" name="add"><!-- comment -->
                    <label>Edad</label>
                    <input type="number" class="form-control" name="age">
                </div>
                
                
                 <div class="g-recaptcha" data-sitekey="6LfeQ4YaAAAAACamu3SnFG37pCdWjRAOI6QFKfjt"></div>
            </div>
            
            <div class="text-right">
                
                <input type="submit" class="btn btn-success " value="guardar">
                <input type="button" class="btn btn-primary " value="cancelar">
            </div>
            
            
        </div>
        </form>
        <br><!-- comment -->
        <hr><!-- comment -->
        <br><!-- comment -->
        
        <table class="table table-bordered table-hover">
            <tr class="text-purple bg-dark">
                <td>Nombre</td>
                <td>Apellidos</td><!-- comment -->
                <td>Direccion</td><!-- comment -->
                <td>Edad</td><!-- comment -->
                <td>Correo</td><!-- comment -->
                <td>Contraseña</td>
                
            </tr>
            
        </table>
        <script src="js(jquery-3.6.0.min"></script>
        <script src="js(bootstrap.min"></script>
    </body>
</html>
