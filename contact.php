<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Grab Your Dreams</title>
  </head>
 



<body>
<div  style="background-color:black;" height="300px">


    <style>
        .nav
        {
            
            font-color:white;
        }
       a
	   {
	   font-color:white;
	   }
    </style>
        
      <script> 
       function a()
	   {
	   alert("GO Through Login progress..!!!!")
	   }
  
	
     </script>
	 <div>
	 
	
	 
	 
    <html lang="en">
<head>
  <title>Adventure</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>



<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
   <a class="navbar-brand" href="#">
    <img src="a1.png" alt="Logo" style="width:150px;">
  </a>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <!-- Brand -->


  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Navbar links -->
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item"><center>
	  <a class="nav-link" href="index.php">HOME</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="store.php">STORE</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-toggle="modal" data-target="#reg">ACCOUNT</a>
		</li>
	     <li class="nav-item">
        <a class="nav-link" href="about.php">ABOUT</a>
      </li> <li class="nav-item">
        <a class="nav-link" href="contact.php">CONTACT</a>

      </li>
	  
	  <li class="nav-item">
        <a class="nav-link" data-toggle="modal" data-target="#login">LOGIN</a>
		</li>
		
            <li class="nav-item">
        <a class="nav-link" href="#" onclick="a()">CART/<span class="ast-woo-header-cart-total"><span class="woocommerce-Price-amount amount">
		<bdi><span class="woocommerce-Price-currencySymbol">₹</span>0</bdi></span></span></button>
		</span>
		</a>
		
	</li>  
	
	<?php
      if(isset($_REQUEST["X"]))
	  {
	      $p1=$_REQUEST["e1"];
		  $p2=$_REQUEST["p1"];
		  
		  $conn=mysql_connect("127.0.0.1","root","");
		  mysql_select_db("login",$conn);
		  mysql_query("insert into log value('$p1','$p2')");
		  ?>
<script>alert("YOU LOGED IN")</script>
<?php
	  }
  
  ?>	
							
	
	 <nav class="navbar navbar-expand-sm bg-dark navbar-dark" >
   
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  
   
  <form class="form-inline" action="/action_page.php" >
    <input class="form-control mr-sm-2" type="text" placeholder="Search">
    <button class="btn btn-success" type="submit">Search</button>
  </form>
</nav>
    
</div>
</nav>

</div>
</div>

<div style="background-color:grey">
	<div class="modal" tabindex="-1"  role="dialog" id="reg">
  <div class="modal-dialog" role="document" style="background-color:grey">
    <div class="modal-content">
      <div class="modal-header" style="background-color:grey">
        <h5 class="modal-title" >CREATE YOUR ACCOUNT</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body" style="background-color:grey">
        
		<form style="background-color:grey">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
	</div>
	
	
  <div class="form-group">
    <label for="inputAddress">Address</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">PhoneNo</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="PhoneNo">
  </div>
  
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity">
    </div>
	
	
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>Andhra Pradesh</option>
                    <option>Arunachal Pradesh</option>
                    <option>Assam</option>
                    <option>Bihar</option>
                    <option>Chhattisgarh</option>
                    <option>Goa</option>
                    <option>Gujarat</option>
                    <option>Haryana</option>
                    <option>Himachal Pradesh</option>
                    <option>Jharkhand</option>
                    <option>Karnataka</option>
                    <option>Kerala</option>
                    <option>Madhya Pradesh</option>
                    <option>Maharashtra</option>
                    <option>Manipur</option>
                    <option>Meghalaya</option>
                    <option>Mizoram</option>
                    <option>Nagaland</option>
                    <option>Odisha</option>
                    <option>Punjab</option>
                    <option>Rajasthan</option>
                    <option>Sikkim</option>
                    <option>Tamil Nadu</option>
                    <option>Talangana</option>
                    <option>Tripura</option>
                    <option>Uttar Pradesh</option>
                    <option>Uttarakhand</option>
                    <option>West Bengal</option>
                    <option>Ladakh</option>
                      <option>Jammu & Kashmir</option>
                      <option>Puducherry</option>
                      <option>Lakshadweep</option>
                      <option>Delhi</option>
                      <option>Chandigarh</option>
                      <option>Dadra and Nagar Haveli and Daman & Diu</option>
                      <option>Andaman and Nicobar Islands</option>
                  </select>
    </div>
	
	
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" id="inputZip">
    </div>
  </div>
  
  <div class="form-group" style="background-color:grey">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
		</div>
		
      <div class="modal-footer" style="background-color:grey">
        <button type="button" class="btn btn-primary">Save changes</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
	  </div>
	  </div>
	 </div>
	 
	 <div class="ast-site-header-cart-data">
	  
	<div style="background-color:grey">
	<div class="modal" tabindex="-1"  role="dialog" id="login">
  <div class="modal-dialog" role="document" style="background-color:grey">
    <div class="modal-content">
      <div class="modal-header" style="background-color:grey">
        <h5 class="modal-title" >LOGIN</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body" style="background-color:grey">
        
		<form action="index.php" style="background-color:grey">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" name="e1" class="form-control" id="inputEmail4" placeholder="Email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password"  name="p1" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
   </div>
  </div>
  
		<div class="modal-footer" style="background-color:grey">
        <button type="button" class="btn btn-primary">Login</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
      </div>
      </div>
      
</form>
</div>
</div>
<section class="elementor-section elementor-top-section elementor-element elementor-element-ayki5fr elementor-section-height-min-height elementor-section-items-bottom elementor-section-boxed elementor-section-height-default" 
data-id="ayki5fr" data-element_type="section" data-settings="{&quot;background_background&quot;:&quot;classic&quot;}">
							</div>
	  
	 
	  <style>
.mydiv
{
  border: 10px outset :#white;
  background-color:#grey;    
  text-align:center;
  
}
</style>


<div class="mydiv"  style="font-family:Brush Script MT;">
<font color="white" size="10px">
  <p><center>Contact Us</center></p></font>
  </div> </div>
  
  <p><h1 style="font-family:Cooper Black"><center>Stay Conected to Know Us more</center></h1>
 <center> <h2 style="font-family:Arial Narrow">Questions, Comments? You tell us. We listen.
Email: kumarishaily406@gmail.com<center>


  
  
  <?php
 if(isset($_REQUEST["X"]))
	  {
	      $p1=$_REQUEST["e"];
		  $p2=$_REQUEST["p"];
		  $p3=$_REQUEST["a"]; 
		  $p4=$_REQUEST["a1"];
		  $p5=$_REQUEST["c"];
		  $p6=$_REQUEST["s"];
		  $p7=$_REQUEST["z"];
		  $conn=mysqli_connect("localhost","id20674939_adventure_123","Offroading@4747");
		  mysqli_select_db($conn,"id20674939_shaily_kumari");
		  mysqli_query($conn,"insert into user_info value('$p1','$p2','$p3','$p4','$p5','$p6','$p7')");
		  ?>
<script>alert("YOU ARE REGISTER")</script>
<?php
	  }
  
  ?>	
  
  <?php
      if(isset($_REQUEST["Y"]))
	  {
	      $p1=$_REQUEST["e"];
		  $p2=$_REQUEST["p"];
		  $conn=mysqli_connect("localhost","id20674939_adventure_123","Offroading@4747");
		  mysqli_select_db($conn,"id20674939_shaily_kumari");
		 $res=mysqli_query($conn,"select *from usre_info where email='$p1'and password='$p2'");
		 if($row=mysqli_fetch_array($res))
		  {
			  session_start();
			  $SESSION["email"]=$row[0];
			  header("localhost:index.php");
		  }  
		  else
		  {
			   ?>
			   <script>alert("Invalid Login");</script>
			   <?php
		  }
		
	  }
  
 	?>
 
		

    <h1 style="font-family:Algerian">What's in your mind</h1>
    <p style="font-family:Algerian">Feel free to connect with us </p>
    <hr>
	  <title>We will definatly improve ourself according to you</title>
  <link rel="stylesheet" type="text/css" href="styles.css">


<center>
     <div style="background-color:#e1ad01">
  <h1 style="font-family:Algerian">We will definatly improve ourself according to you</h1>
 
  <form>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>
    </div>
     <div class="form-group">
      <label for="name">PhoneNo:</label>
      <input type="PhoneNo" id="PhoneNo" name="PhoneNo" required>
    </div>
    <div class="form-group">
      <label for="rating">Rating:</label>
      <select id="rating" name="rating" required>
        <option value="">Select rating</option>
        <option value="excellent">Excellent</option>
        <option value="good">Good</option>
        <option value="average">Average</option>
        <option value="poor">Poor</option>
      </select>
    </div>
    <div class="form-group">
      <label for="comments">Comments:</label>
      <textarea id="comments" name="comments" required></textarea>
    </div>
    <button type="submit">Submit</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <button type="submit">Cancel</button>
  </form>
  </center>
  </div>
  

<style>
.mysiv
{
  border: 5px outset #454B1B;
  background-color:#454B1B;    
  text-align:center;
}
</style>

<div class="mysiv">
<font color="white" size="25px">
  <p style="font-family:Brush Script MT">We Accepts Orders Of The Tents Throughout India.<br>
It’s The Man And His Machine And Nature, All Rolled Into One.</p></font>
  </div>
	 
	<br> 
	 
	 
 	
 	 <!-- Footer -->
<footer class="page-footer font-small indigo">
<div style="background-color:#e1ad01">
  <!-- Footer Links -->
  <div class="container text-center text-md-left">

    <!-- Grid row -->
    <div class="row">

      <!-- Grid column -->
      <div class="col-md-3 mx-auto">

        <!-- Links -->
        <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Store Policies</h5>

        <ul class="list-unstyled">
          <li>
            <a href="#!">Cancelation Policy</a>
          </li>
          <li>
            <a href="#!">Privacy Policy</a>
          </li>
          <li>
            <a href="#!">Shipping Policy</a>
          </li>
          <li>
            <a href="#!">Terms & Conditions</a>
          </li>
        </ul>

      </div>
      <!-- Grid column -->

      <hr class="clearfix w-100 d-md-none">

      <!-- Grid column -->
      <div class="col-md-3 mx-auto">

        <!-- Links -->
        <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

        <ul class="list-unstyled">
          <li>
            <a href="#!">Link 1</a>
          </li>
          <li>
            <a href="#!">Link 2</a>
          </li>
          <li>
            <a href="#!">Link 3</a>
          </li>
          <li>
            <a href="#!">Link 4</a>
          </li>
        </ul>

      </div>
      <!-- Grid column -->

      <hr class="clearfix w-100 d-md-none">

      <!-- Grid column -->
      <div class="col-md-3 mx-auto">

        <!-- Links -->
        <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

        <ul class="list-unstyled">
          <li>
            <a href="#!">Link 1</a>
          </li>
          <li>
            <a href="#!">Link 2</a>
          </li>
          <li>
            <a href="#!">Link 3</a>
          </li>
          <li>
            <a href="#!">Link 4</a>
          </li>
        </ul>

      </div>
      <!-- Grid column -->

      <hr class="clearfix w-100 d-md-none">

      <!-- Grid column -->
      <div class="col-md-3 mx-auto">

        <!-- Links -->
        <h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

        <ul class="list-unstyled">
          <li>
            <a href="#!">Link 1</a>
          </li>
          <li>
            <a href="#!">Link 2</a>
          </li>
          <li>
            <a href="#!">Link 3</a>
          </li>
          <li>
            <a href="#!">Link 4</a>
          </li>
        </ul>

      </div>
      <!-- Grid column -->

    </div>
    <!-- Grid row -->

  </div></div>
  <!-- Footer Links -->

  <div style="background-color:black">
  <div class="footer-copyright text-center py-3">© 2020 Copyright:
    <a href="/"> MDBootstrap.com</a>
  </div>
  
  <!-- Copyright -->

</footer>
<!-- Footer -->
  
 	
 	
 		
  
  
    
  <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </div>
  </body>
</html>
