
	var app  = angular.module('controller',[]);
	
	//校内招聘信息查看
	
	
	app.controller('positionCtrl',function($scope,$http){
		var url = "/web/position/getAll";
		$http.post(url)
		 .success(function(data){
			 console.log(data);
			 $scope.ps = data.a;
			 $scope.page = data.o;
		
		 })
		 
		 
	});
		
	
	
	//详细的单个招聘信息查看
		 
		 
	app.controller('positionInfo',function($scope,$http,$stateParams){
		
		var url = "/web/position/get";
		var data = {pid:$stateParams.pid}
		$http.post(url,data)
		 .success(function(data){
			 console.log(data);
			 $scope.p = data.a;
		 })
	})
