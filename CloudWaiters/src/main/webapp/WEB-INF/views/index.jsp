<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE htnl>
<html lang="en">
<head>
<title>cloud waiters</title>
<meta name="viewport"content="vidth=device-vidth,initial-scale=1">
<meta charset="utf-8">
<link href="http://maxcdn.bootstrapcdn.com/frount-avesome/4.7.0/css/front-avesome">
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <jsp:include page="navbar.jsp"></jsp:include>
  
 

</head>
<body>
<br>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Carousel indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>   
    <!-- Wrapper for carousel items -->
    <div class="carousel-inner">
        <div class="item active">
        <img src="resources/vivo.jpg" alt="First Slide">
        </div>
       
        <div class="item">
            <img src="resources/vivo.jpg" alt="First Slide">
        </div>
        <div class="item">
            <img src="resources/vivo.jpg" alt="Secound Slide">
        </div>
        <div class="item">
            <img src="resources/mobiles.png" alt="Third Slide">
        </div>
        <div class="item">
            <img src="resources/mobiles.png" alt="fourth Slide">
        </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    
    <!-- Carousel controls -->
    <a class="carousel-control left" href="#myCarousel" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
    </a>
    <a class="carousel-control right" href="#myCarousel" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
    </a>
    <footer class="container-fluid text-center">

</footer>
    
    
</div>

<br>
<br>
<br>
<br>
  <jsp:include page="footer.jsp"></jsp:include>

<%--  <jsp:include page="contact us.jsp"></jsp:include>
 --%>

</body>
</html>
