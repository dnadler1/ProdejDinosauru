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
        <link rel="stylesheet" type="text/css" href="css/dotaznik.css">
        <title>JSP Page</title>
    </head>

    <body>
        <div id="celek">
            <h1 id="nadpis">Vítejte v Našem dinosauřím obchodě!</h1>
            <fieldset>
                <img src="obrazky/tyran.jpg" alt="Mountain View" id="obrazek">
                <div id="form">
                    <form action="ZDotazniku">
                        <label for="uzivatel">Uživatelské jméno:</label>
                        <input type="text" name="uzivatel">
                        <br><br>
                        <label for="passowrd">Heslo:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="password">
                        <br><br>
                        <label for="name">Jméno:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="name">
                        <br><br>
                        <label for="surname">Přijmení:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="surname">
                        <br><br>
                        <label for="adresa">Adresa:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="adresa">
                        <br><br>
                        <input type="submit" value="Zaregistruj" id="tlacitko">
                    </form>
            </fieldset>

        </div>
    </body>

</html>
