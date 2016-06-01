(function(window){
	var app = angular.module('admin',['ui.router','adminController']);
	
	app.run(function($rootScope,$state,$stateParams){
		$rootScope.$state = $state;
		$rootScope.$stateParams = $stateParams;
	});
	
	app.config(function($stateProvider,$urlRouterProvider){
			$urlRouterProvider.otherwise('/admin');
			$stateProvider
				.state('admin',{
					url:'/admin',
					views:{
						'admin':{
							templateUrl:'tlps/admin/adminShow.jsp',
							controller:'adminCtrl'
						}
					}
				})
				//添加
				.state("add",{
					url:'/admin',
					views:{
						'admin':{
							templateUrl:'tlps/admin/add.jsp',
							controller:'addCtrl'
						}
					}
				})
				
	});
})(window)