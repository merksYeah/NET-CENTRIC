<%-- 
    Document   : Homepage
    Created on : 03 6, 15, 11:33:36 PM
    Author     : deathman28
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <!--<script src="http://code.jquery.com/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="http://twitter.github.io/typeahead.js/releases/latest/typeahead.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js" type="text/javascript"></script>-->
    <title>DLSUbeacon</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/3-col-portfolio.css" rel="stylesheet">

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation" id='navbar2'> 
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <img class="navbar-brand" src="img/logo.png" style="width: 100; height: 100;"/>
                <a class="navbar-brand" id ='title' href="#"style="color:#026f27;">DLSUbeacon</font>
                    <br/><font id='subtitle' style="color:gray;">Retrieve your lost items, it is not an offense.</font></a>
                </div>
		
                <!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
				     <li>
					<input type="text" name="mail"   placeholder="password"  style="text-align:left; size: 25; margin-top: 25;">
					<input type="text" name="mail"   placeholder="username"  style="text-align:left; size: 25"></li>
					<li><a class="menu" href="#" style="color: #333333;">Sign In</a></li>
				     <li><a class="menu" href="#" style="color: #333333;">Register</a></li>
				     
				     
				</ul>
		     </div>
             <!-- /.navbar-collapse -->
         </div>
         <!-- /.container -->
     </nav>

     <!-- Page Content -->
     <div class="container"> 

        <!-- Page Header -->
        <div class="row">
            <div class="col-lg-12" style="text-align:left; background-color: #026f27;">
                <h3 class="page-header">
			
			<input class="typeahead" type="text" name="item" autocomplete="off" spellcheck="false" dir="auto" placeholder="What have you lost?" style='width: 800px;'></input>
			<button type='button' >Search</button><div style="text-align: right; color: white; "><h3> Lost and found database </h3></div>
                </h3>
            </div>
	    
		<div style="text-align: right"><h4> Browsing Categories: </h4></div>
		<div style="text-align: right" href="#"><img src="css/ID.png"width="125"alt="ID icon"> </div>
		<div style="text-align: right" href="#"><img src="css/gadgets.png"width="125" alt="gadget icon" /></div>
		<div style="text-align: right" href="#"><img src="css/school supplies.png"width="125" alt="school supplies icon" /></div>
		<div style="text-align: right" href="#"><img src="css/clothing.png"width="125" alt="clothing icon" /></div>
        </div>
	<div style ='vertical-align: top;'><iframe src='test.html' width="800" height="400"></iframe>
	</div>
	
        <!-- /.row -->

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
