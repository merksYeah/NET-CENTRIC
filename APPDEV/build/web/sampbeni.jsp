<%-- 
    Document   : Register
    Created on : 03 7, 15, 12:03:41 AM
    Author     : deathman28
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en-US">
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html">
  <title>DLSUbeacon</title>
  <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
  <link rel="stylesheet" type="text/css" media="all" href="register/css/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="register/css/switchery.min.css">
  <script type="text/javascript" src="register/js/switchery.min.js"></script>
</head>

<body>
  <div id="wrapper">
  
  <h1>Registration Form</h1>
  
  <form method="post" action ="AddItem">
  <div class="col-2">
    <label>
      ID Number:
      <input name ="item_type" placeholder="one letter" id="name" tabindex="1">
    </label>
  </div>
  <div class="col-2">
    <label>
      Name:
      <input name = "status" placeholder="First Name, Last Name" id="company" tabindex="2">
    </label>
  </div>
  <div class="col-3">
    <label>
      Username:
      <input placeholder="max. of 32 characters" id="company" name="description" tabindex="2">
    </label>
  </div>
  
  <div class="col-submit">
    <button type="submit" class="submitbtn">Submit Form</button>
  </div>
  
  </form>
  </div>
<script type="text/javascript">
var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));

elems.forEach(function(html) {
  var switchery = new Switchery(html);
});
</script>
</body>
</html>