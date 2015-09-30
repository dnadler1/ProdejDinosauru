<%-- 
    Document   : index
    Created on : 27.8.2015, 23:00:50
    Author     : david
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/1kram.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="celek">

            <h1 id="nadpis">Tak si vyber dinosaura</h1>
            <h2>Stav:${kolekce}${zprava}</h2>
            <form>
                <fieldset>

                    <div id="prvni">
                        <fieldset id="kobrazku1">
                            <img src="obrazky/images9.jpg" alt="Mountain View" id="obrazek1">
                            <div id="input1">
                                <label for="dinosaurus1">Cena 2 587 000 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus1" value="0">
                            </div>
                        </fieldset>
                        <fieldset id="kobrazku2">
                            <img src="obrazky/images10.jpg" alt="Mountain View" id="obrazek2">
                            <div id="input2">
                                <label for="dinosaurus2">Cena 23 658 963 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus2" value="0">
                            </div>
                        </fieldset>
                    </div>
                    <div id="druhy">
                        <fieldset id="kobrazku3">
                            <img src="obrazky/images11.jpg" alt="Mountain View" id="obrazek3">
                            <div id="input3">
                                <label for="dinosaurus3">Cena 2 589 654 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus3" value="0">
                            </div>
                        </fieldset>
                        <fieldset id="kobrazku4">
                            <img src="obrazky/images12.jpg" alt="Mountain View" id="obrazek4">
                            <div id="input4">
                                <label for="dinosaurus4">Cena 25 896 541 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus4" value="0">
                            </div>
                        </fieldset>
                    </div>
                    <br><br>
                </fieldset>
                <div id="konec">
                    <fieldset>
                        <input type="submit" value="NA ZAČÁTEK" id="dopredu" formaction="NaZacatekZKramu">
                        <input type="submit" value="NA 2 STRANU" id="dozadu" formaction="Z1OBCHODU">
                        <input type="submit" value="SPOČÍTAT" id="hotovo" formaction="Spocitat1">
                    </fieldset>
                </div>
            </form>

        </div>
    </body>
</html>
