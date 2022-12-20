<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import ="java.util.*" %>
    <%@page import ="Entities.Notifications"%>
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
                            <%
							List<Notifications> dataList = (List<Notifications>)session.getAttribute("counts");
							for(int i = 0; i<dataList.size(); i++){
								
							%>							
              <li> <%out.print(dataList.get(i).getText()); %></li>
              <%} %>
        </ul>
      </li>
    </ul>
  </nav>
  
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script>
    $(document).ready(function() {
      $("#notifications").on("click", function() {
        $.ajax({
        type: 'put'	,
          url: "/update",
          success: function(res) {
            console.log(res);
          }
        });
      });
    });
  </script>
</body>
</html>