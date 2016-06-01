<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="admin" >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成都工业学院校园招聘信息发布</title>
	<link rel="stylesheet" href="assets/css/amazeui.css">
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/wechat.css" />
	  <link rel="stylesheet" type="text/css" href="styles/font-awesome.css" />
    <link rel="stylesheet" type="text/css" href="styles/simditor.css" />
</head>
<body >
<div class="container">
<h3 class="block-center">成都工业学院后台信息管理</h3>  
<button class="am-btn-primary" ui-sref="add" >添加</button>


<div ui-view="admin"></div>


</div>

   <script src="js/angular.js"></script>
    <script src="js/angular-ui-router.js"></script>

    <script src="js/adminController.js"></script>
    <script src="js/admin.js"></script>
    <script type="text/javascript" src="scripts/js/jquery.min.js"></script>
    <script type="text/javascript" src="scripts/js/module.js"></script>
    <script type="text/javascript" src="scripts/js/uploader.js"></script>
    <script type="text/javascript" src="scripts/js/simditor.js"></script>
 
    
   
</body>
</html>