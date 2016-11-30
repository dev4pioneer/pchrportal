'use strict';

var hrportal = angular.module('HRPortal');

hrportal.controller('portalController',function($scope,$http,portalService){
			$scope.addUser = function(job) {
				portalService.saveJob(job)
				.success(function(data, status, headers, config) {
							alert('Job Added Successfully');
							//bootbox.alert('User Added Successfully',function(){
							//getUsers($scope,$http);
							//});
		
				}).error(function(data, status, headers, config) {
							alert('Failed in posting job');
					});
			};
	});
	
	