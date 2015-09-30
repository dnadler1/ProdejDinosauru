<%-- 
    Document   : proadmina
    Created on : 5.9.2015, 23:33:00
    Author     : david
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/proAdmina.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="celek">
            <div id="horejsek">
                <div id="table1">
                    <table border="2" style="width:100%">
                        <c:forEach var="i" items="${kolekce}">
                            <tr>
                                <c:forEach var="j" items="${i}">
                                    <td>${j}</td>
                                </c:forEach>
                            </tr>
                        </c:forEach> 
                    </table>
                </div>
                <div id="table2">
                    <table border="2" style="width:100%">
                        <c:forEach var="i" items="${kolekce1}">
                            <tr>
                                <c:forEach var="j" items="${i}">
                                    <td>${j}</td>
                                </c:forEach>
                            </tr>
                        </c:forEach> 
                    </table>
                </div>
            </div>
            <div id="dolejsek">
                <div id="table3">
                    <table border="2" style="width:100%">
                        <c:forEach var="i" items="${kolekce2}">
                            <tr>
                                <c:forEach var="j" items="${i}">
                                    <td>${j}</td>
                                </c:forEach>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <div id="table4">
                    <table border="2" style="width:100%">
                        <c:forEach var="i" items="${kolekce3}">
                            <tr>
                                <c:forEach var="j" items="${i}">
                                    <td>${j}</td>
                                </c:forEach>
                            </tr>
                        </c:forEach> 
                    </table>
                </div>
            </div>
            ${param.dinosaur}
            <div id="nejdolejsi">
                <fieldset id="1fied">
                    <form id="jednaform" action="doAdministra">
                        TABULKA: <input type="text" name="userm" value="KONTAKTY"><br>
                        SLOUPEC:<select name="dinosaur">
                            <option value="JMENO">JMENO</option>
                            <option value="PRIJMENI">PRIJMENI</option>
                            <option value="ADRESA">ADRESA</option>
                            <option value="PASSWORD">PASSWORD</option>
                        </select><br>
                        IDECKO: <input type="text" name="idecko"><br>
                        ZMENA: <input type="text" name="pocet"><br>
                        <input type="submit"><br>
                    </form>
                </fieldset>    
                <fieldset id="3field">
                    <form id="triform" action="doAdministra">
                        TABULKA: <input type="text" name="userm" value="PLATBA"><br>
                        SLOUPEC:<select name="dinosaur">
                            <option value="CVV2">CVV2</option>
                            <option value="IDZZAKAZNIKA">IDZZAKAZNIKA</option>
                            <option value="DATEEXPIRATION">DATEEXPIRATION</option>
                        </select><br>
                        IDECKO: <input type="text" name="idecko"><br>
                        ZMENA: <input type="text" name="pocet"><br>
                        <input type="submit"><br>
                    </form>
                </fieldset>
                <fieldset id="4field">
                    <form id="ctyriform" action="doAdministra">
                        TABULKA: <input type="text" name="userm" value="ZBOZI"><br>
                        SLOUPEC:<select name="dinosaur">
                            <option value="CENA">CENA</option>
                            <option value="PROD_KUSY">PROD_KUSY</option>
                            <option value="SKLAD">SKLAD</option>
                            <option value="IDZAKAZNIKA">IDZAKAZNIKA</option>
                        </select><br>
                        IDECKO: <input type="text" name="idecko"><br>
                        ZMENA: <input type="text" name="pocet"><br>
                        <input type="submit"><br>
                    </form>
                </fieldset>
                <a href="http://localhost:8080/ProdejDinosauru/">HOTOVO, VRAŤ SE</a>
            </div>
        </div>
    </body>
</html>
