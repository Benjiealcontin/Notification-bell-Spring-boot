<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
  <link rel="stylesheet" href="css/style.css" />
  <script src="https://kit.fontawesome.com/a39a282bd8.js" crossorigin="anonymous"></script>
</head>
<body>
 <nav class="navbar">
    <ul>
      <li>
        <a href="#" id="notifications">
          <label for="check">
            <i class="fa fa-bell-o" aria-hidden="true"></i>
            <span class="count">${count}</span>
          </label>
        </a>
        <input type="checkbox" class="dropdown-check" id="check" />
        <ul class="dropdown">

              <li></li>
        </ul>
      </li>
    </ul>
  </nav>
</body>
</html>