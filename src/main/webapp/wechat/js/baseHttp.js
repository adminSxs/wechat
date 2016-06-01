(function(window){
	var app = angular.module("BaseHttp",[])
			    .factory('httpFactory', ['$http', function($http){
			    	return{
			    		http:function(url,data){
			    			return $http.post(url,data).then(function(res){
			    				return res.data;
			    			})
			    		}
			    	};
			    }])
		

})(window)