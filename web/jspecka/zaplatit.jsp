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
        <link rel="stylesheet" type="text/css" href="css/zaplatit.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="celek">
            <h1 id="nadpis">Tak a platíme!${zprava}</h1>
            <fieldset>
                <img src="obrazky/tyran.jpg" alt="Mountain View" id="obrazek">
                <div id="form">
                    <form action="Koncime">
                        <label for="cislokarty">Číslo karty:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="cislokarty">
                        <br><br>
                        <label for="datum">Platnost karty:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="datum">
                        <br><br>
                        <label for="castka">Částka:</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="castka" value="${kolekce}${castka}">
                        <br><br>
                        <label for="cv2">CVV2/CVC2 kód:</label>&nbsp&nbsp&nbsp&nbsp&nbsp
                        <input type="text" name="cv2">
                        <br><br>
                        <input type="submit" value="Pošli do banky" id="tlacitko">
                    </form>
            </fieldset>

        </div>

    </body>
</html>
