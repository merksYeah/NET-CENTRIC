<!doctype html>
<html lang="en-US">
<head>
  <title>DLSUbeacon| Register</title>
  <link rel="stylesheet" type="text/css" media="all" href="css/styles_register.css">
  <link rel="stylesheet" type="text/css" media="all" href="css/switchery_register.min.css">
  <script type="text/javascript" src="switchery.min.js"></script>
</head>

<body>
  <div id="wrapper">
    <h1 style="font-size: 35px;">Registration Form</h1>
  <form onsubmit="return false" action="Register">
  <div >
    
    <label>
      ID Number:
      <input placeholder="" id="name" name="Id" tabindex="1">
    </label>

    <label>
      Name:
      <input placeholder="First Name, Last Name" id="company" name="name" tabindex="2">
    </label>

    <label>
      Username:
      <input placeholder="max. of 32 characters" id="company" name="username" tabindex="2">
    </label>

    <label>
      Password:
      <input placeholder="up to 4 to 32 characters" id="phone" tabindex="2" name="password">
    </label>

    <label>
      Email:
      <input placeholder="use @dlsu.edu.ph only" id="email" name="email" tabindex="3">
    </label>

    <label>
      College:
      <select tabindex="4">
        <option>Choose your college here...</option>
        <option>CLA</option>
        <option>COB</option>
        <option>COS</option>
        <option>CCS</option>
        <option>CED</option>
        <option>COE</option>
        <option>GCOE</option>
        <option>COL</option>
      </select>
    </label>
  </div>
  
  <div class="col-submit">
    <button class="submitbtn" style="background-color: #026f27; border-color: #026f27; border-bottom-color: #003000;">Submit Form</button>
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