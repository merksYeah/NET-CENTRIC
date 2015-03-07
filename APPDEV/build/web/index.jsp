<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>DLSUbeacon| Login</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link href="css/styles_login.css" rel="stylesheet">
	</head>
	<body>
<!--login modal-->
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header" style="text-align: center;">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <img src="css/logo.png" style="width: 35%; height: 35%;" />
          <h1 class="text-center"><b style="color: black;">Log in</b></h1>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block" action="Login">
            <div class="form-group">
              <input type="text" class="form-control input-lg" id="text" placeholder="Email" name="username">
            </div>
            <div class="form-group">
              <input type="password" class="form-control input-lg" id="text" placeholder="Password" name="password">
            </div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block" style="background-color: #026f27; border-color: #026f27; 
              border-bottom-color: #003000;">Sign in</button>
              <span class="pull-right"><a href="ToRegister">Register</a></span><span><a href="#">Need help?</a></span>
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
		  </div>	
      </div>
  </div>
  </div>
</div>
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>