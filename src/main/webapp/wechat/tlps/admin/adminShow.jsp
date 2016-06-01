<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	  
   <table class="table table-bordered">
   	<tr>
   		<th>编号</th>
   		<th>公司名称</th>
   		<th>发布时间</th>
   		<th>操作</th>
   	</tr>
   	<tr ng-repeat="p in ps">
   		<td>{{p.id}}</td>
   		<td>{{p.title}}</td>
   		<td>{{p.createTime.time | date:"yyyy-MM-dd HH:mm:ss"}}</td>
   		<td>
   			<button class="am-btn-danger" ng-click="delete(p.id)">删除</button>
   			<!-- <button class="am-btn-info">修改</button> -->
   		</td>
   
   	
   	</tr>
   
   </table>
   <button ng-if="page.pageIndex != 1" class="btn btn-primary">上一页</button>
   <button ng-if="page.pageIndex != count" class="btn btn-primary">下一页</button>
