(function(window){
	var app = angular.module('App',['ui.router','controller','BaseHttp','Service','ngSanitize']);
	
	app.run(function($rootScope,$state,$stateParams){
		$rootScope.$state = $state;
		$rootScope.$stateParams = $stateParams;
	});
	
	app.config(function($stateProvider,$urlRouterProvider){
			$urlRouterProvider.otherwise('/recShool');
			$stateProvider
				.state('index',{
					url:'/index',
					views:{
						'content':{
							templateUrl:'tlps/rec/recInfo.jsp',
							controller:'positionCtrl'
						}
					}
				})
				//招聘流程
				.state('rec',{
					url:'/rec',
					views:{
						'content':{
							templateUrl:'tlps/rec/recProcess.jsp'
							
						}
						
					}
				})
				//校园招聘
				.state('recShool',{
					url:'/recShool',
					views:{
						'content':{
							templateUrl:'tlps/rec/recSchool.jsp',
							controller:'positionCtrl'
						}
					}
				})
				//校园单个招聘的详细信息
				.state('recInfo',{
					url:'/recInfo/:pid',
					views:{
						'content':{
							templateUrl:'tlps/rec/recInfo.jsp',
							controller:'positionInfo'
						}
					}
				})
				//校外招聘
				.state('recShoolOut',{
					url:'/recShoolOut',
					views:{
						'content':{
							templateUrl:'tlps/rec/recSchoolOut.jsp'
						}
					}
				})
				
				//公招信息
					.state('recPub',{
					url:'/recPub',
					views:{
						'content':{
							templateUrl:'tlps/rec/recInfo.jsp'
						}
					}
				})
				//关于我们
				.state('about',{
					ulr:'/about',
					views:{
						'content':{
							templateUrl:'tlps/about/about1.jsp',
							
						}
						
					}
				})
	});
})(window)