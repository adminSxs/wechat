
	var app  = angular.module('adminController',[]);
	
	
	//校内招聘信息查看
	
	
	app.controller('adminCtrl',function($scope,$http){

		//获取数据
		var url = "/web/position/getAll";
		$http.post(url)
		 .success(function(data){
			 console.log(data);
			 $scope.ps = data.a;
			 $scope.page = data.o;
			 
			 $scope.count = Math.ceil($scope.page.total/$scope.page.pageSize);
			
		
		 })
		 
		 
		 $scope.del = function(id){
			var url = "/web/position/delete";
			var d = {pid:id};
			$http.post(url,d)
			 .success(function(data){
				 console.log(data);
			
			 })
		}
		 
		 
	});
	
	app.controller('addCtrl',function($scope,$http){
		 var editor1 = new Simditor({
		      textarea: $('#editor1'),
		      height:50
		      
		    });
		    
		    var editor2 = new Simditor({
			      textarea: $('#editor2'),
			      height:50
			      
			    });
		    
		    var editor3 = new Simditor({
			      textarea: $('#editor3'),
			      height:50
			      
			    });
		    
		    var editor4 = new Simditor({
			      textarea: $('#editor4'),
			      height:50
			      
			    });
		    
		    var editor5 = new Simditor({
			      textarea: $('#editor5'),
			      height:50
			      
			    });
		    
		    var editor6 = new Simditor({
			      textarea: $('#editor6'),
			      height:50
			      
			    });
		    
		    var editor7 = new Simditor({
			      textarea: $('#editor7'),
			      height:50
			      
			    });
		    
		    var editor8 = new Simditor({
			      textarea: $('#editor8'),
			      height:50
			      
			    });
		    
		    var editor9 = new Simditor({
			      textarea: $('#editor9'),
			      height:50
			      
			    });
		    
		    var editor10 = new Simditor({
			      textarea: $('#editor10'),
			      height:50
			      
			    });
		    
		    var editor11 = new Simditor({
			      textarea: $('#editor11'),
			      height:50
			      
			    });
	})
		
	
	