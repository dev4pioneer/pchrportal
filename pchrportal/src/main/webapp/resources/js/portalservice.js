(function(){
'use strict';

angular.module('HRPortal')
.service('portalService',['$http','$rootScope',function($http,$rootScope){
	
	var portal = this;
	
	portal.postService = function(url,data){
		return $http({
			method:'POST',
			url : url,
			headers : {'Content-Type': "application/json; charset=utf-8"},
			data :data
		});
	},
	portal.getService = function(url){
		return $http({
			method:'GET',
			url : url,
			headers : {'Content-Type': "application/json; charset=utf-8"}
			
		});
	},
	portal.putService = function(url,data){
		return $http({
			method:'PUT',
			url : url,
			headers : {'Content-Type': "application/json; charset=utf-8"},
			data :data
		});
	};
	
portal.saveJob = function(job){
	alert("save job");
	return portal.postService("/pchrportal/job/postJob",job);
}
	
}]);
})();
/*app.service('portalService', [
  



	$scope.addUser = function(user){
			alert("service..............");
			$http.post('/Hub/user/createUser',user).
				success(function(data,status,headers,config){
					//bootbox.alert('User Added Successfully',function(){
						getUsers($scope,$http);
					//});
					
				}).
				error(function(data,status,headers,config){
					bootbox.alert('User Not Added');
					
				});
		}	
]);*/

;