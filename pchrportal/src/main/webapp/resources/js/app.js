angular.module("HRPortal", [
"ui.router", 
"oc.lazyLoad" 

])

.config(['$stateProvider', '$urlRouterProvider', '$httpProvider', function($stateProvider, $urlRouterProvider) {

	/*$ocLazyLoadProvider.config({
		debug:false,
		events:true
	});*/
	
	$stateProvider
/************************************************ HOME **************************************/
	  // State
	    .state('home', {
	        url: "/",
	        templateUrl: "resources/views/addJob.html",
	       controller: "portalController",
	        resolve: {
	            loadMyDirectives : function($ocLazyLoad) {
	               return $ocLazyLoad.load({
	                    name: 'HRPortal',
	                    files: [
	                            '/pchrportal/resources/js/portalcontroller.js',
	                            '/pchrportal/resources/js/portalservice.js',
	                       ] 
	                });
	            }
	        }
	    })
	    
/******************************************* ABOUT **********************************************/	    
	    
	      .state('about', {
		        url: "/about",
		        templateUrl: "resources/views/about.html",
		      // controller: "portalController",
		     /*   resolve: {
		            loadMyDirectives : function($ocLazyLoad) {
		               return $ocLazyLoad.load({
		                    name: 'HRPortal',
		                    files: [
		                          '/pchrportal/resources/js/portalcontroller.js',
		                            '/pchrportal/resources/js/portalservice.js',
		                       ] 
		                });
		            }
		        }*/
	      })
	    
	    ;
}]);