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
 <style>
/*add a gray background colour and some padding to the footer */
footer{
background-colour: brown;
padding: 50px;
}
.carousel-inner img
{
 width:100%;/*set width to 100%*/
min-height:300px;
max-height:220px;
}
body
{
background-image:url("https://media.giphy.com/media/3osxYdOqKJsgxSqJk4/giphy.gif");
}
</style>
</head>
<body>
<br>
<br> 
<br>
<br>
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
            <img src="resources/one.jpg" alt="First Slide">
        </div>
        <div class="item">
            <img src="resources/vivo.jpg" alt="Second Slide">
        </div>
        <div class="item">
            <img src="resources/iphone all.jpg" alt="Third Slide">
        </div>
        <div class="item">
            <img src="resources/mobiles.png" alt="fourth Slide">
        </div>
    </div>
    <br>
    
    <footer class="container-fluid text-center">

</footer>
    
    
    <!-- Carousel controls -->
    <a class="carousel-control left" href="#myCarousel" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left"></span>
    </a>
    <a class="carousel-control right" href="#myCarousel" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right"></span>
    </a>
    
    
</div>
</body>
</html>
