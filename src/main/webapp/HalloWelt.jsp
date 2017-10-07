<!doctype html>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<html>
    <head>
      <title>Hallo from JSP</title>
      <%!String message = "Hello, World at...";%>
    </head>
    <body>
	  <h2><%= message%></h2>
	  <p><%= new java.util.Date() %></p>
      	<p>
 <%
 try{
  Context Kontext = new InitialContext();
  DataSource Datenquelle = (DataSource) Kontext.lookup ("jdbs/mysqlres");
  Connection Verbindung = Datenquelle.getConnection();
 }

  
  	//if (null != Verbindung){
	 // out.println ("Verbindung zur Datenquelle hergestellt!");
  	//}
  	//else {
	  // out.println ("KEINE Verbindung zur Datenquelle hergestellt!");
  	//}
  	
   catch ( javax.naming.NameNotFoundException e){
	   message = "adieu"; 
   }	
  finally {
	// out.println ("kaputt");
	message = message+ " bis später";
 }	  
      
 %>		</p>     
    </body>
  </html> 