<%-- 
    Document   : PaysCadre
    Created on : 19 oct. 2017, 14:31:44
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <!--<meta http-equiv="refresh" content="0; url=/WebAppHibernateCours/ControleurPays?action=select" />-->
        <title>PaysCadre Page</title>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="css/mdb.min.css" rel="stylesheet">
        <!-- Your custom styles (optional) -->
        <link href="css/style.css" rel="stylesheet">
    </head>
    <body>
<!--        <nav id="sommaire">
            <a href="/WebAppHibernateCours/ControleurPays?action=select">Les pays</a> |
            <a href="/WebAppHibernateCours/ControleurPays?action=insert">Nouveau pays</a> |
            <a href="/WebAppHibernateCours/ControleurPays?action=delete">Supprimer un pays</a> |
            <a href="/WebAppHibernateCours/ControleurPays?action=modifier">Modifier un pays</a> |
        </nav>-->

<!--Card-->
<div class="card m-5" style="width: 22rem;">
  <!--Card image-->
  <div class="view overlay hm-white-slight">
    <img src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20%287%29.jpg" class="img-fluid" alt="">
    <a href="#">
      <div class="mask"></div>
    </a>
  </div>

  <!--Card content-->
  <div class="card-body">
    <!--Title-->
    <h4 class="card-title">Card title</h4>
    <!--Text-->
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="/WebAppHibernateCours/ControleurPays?action=select" class="btn btn-primary">Voir la liste des pays</a>
  </div>
</div>
<!--/.Card-->
        
        <jsp:include page="${fragment}" flush="true" />

        ${message}
        
        <!-- SCRIPTS -->
        <!-- JQuery -->
        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="js/mdb.min.js"></script>

    </body>
</html>
