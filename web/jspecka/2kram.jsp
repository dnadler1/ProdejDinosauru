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
        <link rel="stylesheet" type="text/css" href="css/2kram.css">
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
                            <img src="obrazky/images1.jpg" alt="Mountain View" id="obrazek1">
                            <div id="input1">
                                <label for="dinosaurus5">Cena 2 587 456 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus5" value="0">
                            </div>
                        </fieldset>
                        <fieldset id="kobrazku2">
                            <img src="obrazky/images2.jpg" alt="Mountain View" id="obrazek2">
                            <div id="input2">
                                <label for="dinosaurus6">Cena 25 463 021 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus6" value="0">
                            </div>
                        </fieldset>
                    </div>
                    <div id="druhy">
                        <fieldset id="kobrazku3">
                            <img src="obrazky/images3.jpg" alt="Mountain View" id="obrazek3">
                            <div id="input3">
                                <label for="dinosaurus7">Cena 23 654 789 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus7" value="0">
                            </div>
                        </fieldset>
                        <fieldset id="kobrazku4">
                            <img src="obrazky/images4.jpg" alt="Mountain View" id="obrazek4">
                            <div id="input4">
                                <label for="dinosaurus8">Cena 5 632 147 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus8" value="0">
                            </div>
                        </fieldset>
                    </div>
                    <br><br>

                </fieldset>
                <div id="konec">
                    <fieldset>
                        <input type="submit" value="NA 1 STR" id="dopredu" formaction="ZpatkyDo1Obchodu">
                        <input type="submit" value="NA 3 STR" id="dozadu" formaction="Z2Do3Obchodu" >
                        <input type="submit" value="SPOČÍTAT" id="hotovo" formaction="Spocitat2">
                    </fieldset>
                </div>
            </form>
        </div>
           </body>

</html>
