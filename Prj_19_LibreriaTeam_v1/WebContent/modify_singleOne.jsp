<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/reboot.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/menu.css">
<link rel="stylesheet" href="css/popup.css">
<title>Dipendenti</title>
</head>
<body>

<div class="topBar">
   
Payrol's System
   
</div>

<div class="wrapper">

    <div class="header">
 		<nav>
            <ul>
            
                <li><a class="active" href="#">Home</a></li>
                <li><a href="http://localhost:8080/Prj_16_Dipendenti/dipendenti">Dipendenti</a></li>
                <li><a href="http://localhost:8080/Prj_16_Dipendenti/dirigenti">Dirigenti</a></li>
                <li><a href="http://localhost:8080/Prj_16_Dipendenti/impiegati">Impiegati</a></li>
                <li><a href="http://localhost:8080/Prj_16_Dipendenti/fattorini">Fattorini</a></li>
            </ul>
		</nav>
	</div>
	<div class="columnWrapper">
		<div class="main">
            <h2>Modify Employee</h2>
		
			<div style = "width:100%;border-radius: 10px; position:relative; left:15em; top:23.5em;">
            <button class="iAddbutton" onclick="test()">Go</button>
            </div>
            
        <form method="post" action="http://localhost:8080/Prj_18_LibreriaWeb/modify">
          
            <table id="SingleOne">
                <tbody>
                <tr>
                
                <td><p id="nImport"></p><input name="NAME" id="NAME" type="text" placeholder="name" value=""/></td>
                </tr>
                <tr>
                <td><p id="lImport"></p><input name="LASTNAME" id="LASTNAME" type="text" placeholder="last name" value=""/></td>
                </tr>
                <tr>
                <td><p id="mImport"></p><input name="NMATRICOLA" id="NMATRICOLA" type="text" placeholder="N° Matricola" value=""/></td>
                </tr>
                <tr>
                <td><p id="phImport"></p><input name="PAYHOUR" id="PAYHOUR" type="text" placeholder="Pay/hour" value=""/></td>
                </tr>
                <tr>
                <td><p name="TABLEOLD" id="pImport"></p><input name="POSITION" id="POSITION" type="text" placeholder="Position" value=""/></td>
                
                </tr>
            </tbody>
            </table>
          <div class="popup">
          <span class="popuptext" id="myPopup">It's All right?      
          <div></div>     
          <table id="Sure">
                <thead>
                    <tr>
                    <th>Name</th>
                    <th>Last Name</th>
                    <th>Matricola</th>
                    <th>Pay/Hour</th>
                    <th>Position</th>
        			</tr>
                 </thead>
                <tbody>
                <tr>
                <td id="FNameUtente"></td>
                <td id="LNAMEUtente"></td>
                <td id="NMatricolaUtente"></td>
                <td id="PayHourUtente"></td>
                <td id="PositionUtente"></td>
                <td> <button id="ButtonFinal" >Let's do it</button> </td>
                </tr>
                </tbody>
          </table>
         </span>      
        </div>
        </form>
    </div>
</div>
    
</div>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="js/popup.js"></script>
</body>
</html>