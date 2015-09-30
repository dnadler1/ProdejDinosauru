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
        <link rel="stylesheet" type="text/css" href="css/3kram.css">
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
                            <img src="obrazky/images5.jpg" alt="Mountain View" id="obrazek1">
                            <div id="input1">
                                <label for="dinosaurus9">Cena 2 031 456 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus9" value="0">
                            </div>
                        </fieldset>
                        <fieldset id="kobrazku2">
                            <img src="obrazky/images6.jpg" alt="Mountain View" id="obrazek2">
                            <div id="input2">
                                <label for="dinosaurus10">Cena 20 314 558 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus10" value="0">
                            </div>
                        </fieldset>
                    </div>
                    <div id="druhy">
                        <fieldset id="kobrazku3">
                            <img src="obrazky/images7.jpg" alt="Mountain View" id="obrazek3">
                            <div id="input3">
                                <label for="dinosaurus11">Cena 258 963 214 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus11" value="0">
                            </div>
                        </fieldset>
                        <fieldset id="kobrazku4">
                            <img src="obrazky/images8.jpg" alt="Mountain View" id="obrazek4">
                            <div id="input4">
                                <label for="dinosaurus12">Cena 23 654 789 dolarů&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspPočet kusů:</label>
                                <input type="text" name="dinosaurus12" value="0">
                            </div>
                        </fieldset>
                    </div>
                    <br><br>
                </fieldset>
                <div id="konec">
                    <fieldset>
                        <input type="submit" value="NA 2 STR" id="dopredu" formaction="Z3Do2Obchodu">
                        <input type="submit" value="NAZAČÁTEK" id="dozadu" formaction="NaZacatekZKramu">
                        <input type="submit" value="SPOČÍTAT" id="hotovo" formaction="Spocitat3">
                    </fieldset>
                </div>
            </form>
        </div>
      </body>
</html>
