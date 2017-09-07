<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MOBILE STORE</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">Home</a></li>
      <li><a href="mobilephones">MobilePhones</a></li>
      <li><a href="Contact">CONTACT US</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
        <li><a href="sigin"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
      </ul>
     <ul class="nav navbar-nav navbar-right"> 
    <c:url value="/perform_logout" var="logout"/>
        <form action="${logout}"  method="post" id="logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csfr.token}"/>
       
        </form>​
        <c:if test="${pageContext.request.userPrincipal.name!=null}">
     
       <%--   <c:forEach var="prod" items="${listUser}">
               <font size=5 color="black">welcome:<img src = "<c:url value ='/resource/images/${prod.id}.jpg'/>"height="20" width="20" class ="img img-rounded"/>${pageContext.request.userPrincipal.name}</font>
            </c:forEach> --%>
            <li class="scroll">  <a href="javascript:formSubmit()">LOGOUT</a></li>
                <security:authentication var="user" property="principal.authorities"/>
                <security:authorize var="LoggedIn" access="isAuthenticated()">
                <security:authorize access="hasRole('ROLE_ADMIN')">
               ADMIN
                </security:authorize>
                 <security:authorize access="hasRole('ROLE_USER')">
                USER
                </security:authorize>
                </security:authorize>
                </c:if>
               <c:if test="${pageContext.request.userPrincipal.name==null}">
       
 
     <form class="navbar-form navbar-right">
    <a href="sigin">Sign Up<span class="glyphicon glyphicon-registration-mark" ></span></a>
   
   <a href="login">Log In 
                    <span class="glyphicon glyphicon-user"></span> </a>
                
              
              
              </form>
              </c:if>           
      
  </div>
</nav>

</div>

</body>
</html>
