
<%@page import="modelo.Calcular_1"%>
<%@page import="modelo.Calcular_2"%>
<%@page import="modelo.Calcular_3"%>
<%@page import="modelo.Calcular_4"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java + tomcat + (JSP)</title>
<link href="Estilos/Style.css" rel="stylesheet" type="text/css" />

<h1>Progamacion Funcional en Java</h1>


</head>
<h3>Con java/tomcat (JSP)</h3>
<table>
 <caption>Java es un lenguaje de programación y una plataforma informática que fue comercializada por primera vez en 1995 por Sun Microsystems. </caption>
	
	<caption>Apache Tomcat (también llamado Jakarta Tomcat o simplemente Tomcat) funciona como un contenedor de servlets desarrollado bajo el proyecto Jakarta en la Apache Software Foundation.</caption>
	<caption>JavaServer Pages (JSP) es una tecnología que ayuda a los desarrolladores de software a crear páginas web dinámicas basadas en HTML y XML, entre otros tipos de documentos. JSP es similar a PHP, pero usa el lenguaje de programación Java.</caption>
	<caption>Un servlet es una clase en el lenguaje de programación Java, utilizada para ampliar las capacidades de un servidor.</caption>
	<tr>
		<th>Descripción</th>
		<th>Entrada</th>
		<th>Metodos</th>
		<th>Salida</th>
	</tr>



	<tr>
		<form action="Serv_1" method="POST">
			<td>1) Recursivo: Factorial</td>

			<td><input type="text" name="num_1" /></td>

			<td>
				<button type="submit">Calcular</button>
			</td>
			<td>
				<%
					Calcular_1 obj_1 = new Calcular_1();

				obj_1 = (Calcular_1) request.getAttribute("OB_ACTUALIZADO_1");
				if (obj_1 != null) {
					out.println("R1  = " + obj_1.getNombre() + "<br/>");

				}
				%>
			</td>
		</form>
	</tr>









	<tr>

		<form action="Serv_2" method="POST">
			<td>2)  Número al cuadrado</td>

			<td><input type="text" name="num_2" /></td>

			<td>
				<button type="submit">Calcular</button>
			</td>

			<td>
				<%
					Calcular_2 obj2 = new Calcular_2();

				obj2 = (Calcular_2) request.getAttribute("OB_ACTUALIZADO_2");
				if (obj2 != null) {
					out.println("R2  = " + obj2.getNombre() + "<br/>");

				}
				%>
			</td>
		</form>
	</tr>





	<tr>

		<form action="Serv_3" method="POST">

			<td>3) Fibonacci de 4 términos iniciales</td>
			<td><input type="text" name="num_3" /></td>

			<td>
				<button type="submit">Calcular</button>
			</td>
			<td>
				<%
					Calcular_3 obj3 = new Calcular_3();

				obj3 = (Calcular_3) request.getAttribute("OB_ACTUALIZADO_3");
				if (obj3 != null) {
					out.println("R3  = " + obj3.getNombre() + "<br/>");

				}
				%>
			</td>
		</form>
	</tr>













	<tr>
		<form action="Serv_4" method="POST">
		<td>4) Calculadora con funciones de orden superior</td>

		<td>
		a:<input type="text" name="num_4A" /><br/>
		b:<input type="text"name="num_4B" /><br/>
		</td>

		<td>
			<button type="submit">Calcular</button>
		</td>

		<td>
			<%
				Calcular_4 obj4 = new Calcular_4();

			obj4 = (Calcular_4) request.getAttribute("OB_ACTUALIZADO_4");
			if (obj4 != null) {
				out.println("R4  = " + obj4.getNombre() + "<br/>");

			}
			%>
		</td>


		</form>
	</tr>



	<tr>
		<form action="cinco" method="POST">

			<td>
			<h2>5) - Calculadora de matrices con funciones de orden superior</h2>
			
			</td>
			<td>

				<p>Primera matriz:A</p>
				<p>1.0 &nbsp;&nbsp;2.0</p>
				<p>3.0&nbsp;&nbsp;4.0</p>
				<p>Segunda matriz:B</p>

				<p>5.0&nbsp;&nbsp;6.0</p>
				<p>7.0&nbsp;&nbsp;8.0</p>





			</td>
			<td>
				<h3>Resultados ==></h3>
			</td>

			<td>
				<p>Matriz resultado A+B=</p>
				<p>6.0 &nbsp;&nbsp;8.0</p>
				<p>10.0&nbsp;&nbsp; 12.0</p>

				<p>Matriz resultado A-B=</p>

				<p>-4.0 &nbsp;&nbsp;-4.0</p>
				<p>-4.0 &nbsp;&nbsp;-4.0</p>

				<p>Matriz resultado A X B=</p>

				<p>19.0&nbsp;&nbsp; 22.0</p>

				<p>43.0 &nbsp;&nbsp;50.0</p>

				<p>La inversa de (AXB)=</p>
				<p>12.500000000000066&nbsp; -5.50000000000003</p>
				<p>-10.750000000000057&nbsp; 4.750000000000026</p>



			</td>
		</form>
	</tr>





</table>



</html>