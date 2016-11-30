<!DOCTYPE html>
<html>
<head>

    <!-- CSS (load bootstrap) -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <style>
        .navbar { border-radius:0; }
    </style>

    <!-- JS (load angular, ui-router, and our custom js file) -->
    <script src="http://code.angularjs.org/1.2.13/angular.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.2.8/angular-ui-router.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/oclazyload/1.0.9/modules/ocLazyLoad.core.js"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/oclazyload/1.0.9/ocLazyLoad.min.js"></script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/oclazyload/1.0.9/ocLazyLoad.js"></script>
    
    <script type="text/javascript" src="/pchrportal/resources/js/app.js"></script>
       <script type="text/javascript" src="/pchrportal/resources/js/switcher.js"></script>
       <script type="text/javascript" src="/pchrportal/resources/js/jquery-2.1.3.min.js"></script>
       
</head>

<!-- apply our angular app to our site -->
<body data-ng-app="HRPortal">

<!-- NAVIGATION -->
<nav class="navbar navbar-default navbar-static-top" data-role="navigation" style="background-color :Blue">
<!-- <div class="row">
</div> -->
    <div class="navbar-header">
        <a class="navbar-brand" data-ui-sref="#">PC HR PORTAL</a>
    </div>
    <ul class="nav navbar-nav">
        <li>
       		 <a data-ui-sref="home">Home</a>
		</li>
		
        <li>
        	<a data-ui-sref="about">About</a>
        </li>
        
        <!-- <li>
       		<a class="dropdown-toggle" data-toogle="dropdown">For Employers<b class="caret"></b></a>
       		<ul class="dropdown-menu">
       		<li>
       		<a data-ui-sref="home">addJob</a></li>
       		<li>
       		<a data-ui-sref="home">manage</a></li>
       		</ul>
		</li> -->
		<li><a data-ui-sref="home">Add Job</a></li>
		<!-- <li><a href="#" id="current">For Employers</a>
					<ul>
						
						<li><a href="manage-jobs.html">Manage Jobs</a></li>
						<li><a href="manage-applications.html">Manage Applications</a></li>
						<li><a href="browse-resumes.html">Browse Resumes</a></li>
					</ul>
				</li> -->
    </ul>
</nav>

<!-- MAIN CONTENT -->
<div class="container">
    <!-- THIS IS WHERE WE WILL INJECT OUR CONTENT ============================== -->
    <div data-ui-view></div>
</div>

</body>
</html>
 
