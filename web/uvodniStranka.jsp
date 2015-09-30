<%-- 
    Document   : index
    Created on : 27.8.2015, 23:00:50
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/uvodnistranka.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="celek">

            <h1 id="nadpis">Vítejte v Našem dinosauřím obchodě!${zkouska}${zkouska2}</h1>
            <fieldset>
                <img src="obrazky/tyran.jpg" alt="Mountain View" id="obrazek">
                <div id="form">
                    <form action="doServletu">
                        <label for="user">Uživatelské jméno:</label>
                        <input type="text" name="user">
                        <br><br>
                        <label for="password">Heslo:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="password">
                        <br><br>
                        <input type="submit" value="Přihlaš" id="tlacitko">
                        <a href="dotaznik" target="_blank" id="odesilac">Zaregistruj!</a> 
                    </form>
            </fieldset>

        </div>


    </body>
</html>
