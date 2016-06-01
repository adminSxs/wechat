(function(window){
	var app = angular.module('Service',[]);
	
	app.factory('positionFactory',function($http,httpFactory){
		return{
			getList:function(){
				return "hello world";
			}
			
			
		}
		
	})
})(window)