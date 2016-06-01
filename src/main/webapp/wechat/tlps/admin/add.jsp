<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<h3 class="text-center">成都工业学院校园招聘信息发布</h3>
	<button ui-sref="admin">返回</button>
	<hr/>
	<form method="post" action="/web/position/add">
		<div class="row">
			<div class="col-md-2"></div>
			
			
			<div class="col-md-8">
				<!-- 公司名称 -->
				<div class="form-group">
				<input name="title" class="form-control" placeholder="公司名称">
				</div>
				<!-- 薪水 -->
				<div class="form-group">
				<input name="salary" class="form-control" placeholder="薪水">
				</div>
				<!-- 公司地址 -->
				<div class="form-group">
				<input name="address" class="form-control" placeholder="公司地址">
				</div>
				<!--工作性质 -->
				<div class="form-group">
				<input name="nature" class="form-control" placeholder="工作性质">
				</div>
				<!-- 工作经验 -->
				<div class="form-group">
				<input name="experience" class="form-control" placeholder="工作经验">
				</div>
				<!-- 文凭要求 -->
				<div class="form-group">
				<input name="education" class="form-control" placeholder="文凭要求">
				</div>
				<!-- 招聘人数 -->
				<div class="form-group">
				<input name="number" class="form-control" placeholder="招聘人数">
				</div>
				<!-- 职位类型 -->
				<div class="form-group">
				<input name="type" class="form-control" placeholder="职位类型">
				</div>
				
				<!-- 公司描述 -->
				<div class="form-group">
				 <textarea id="editor1" placeholder="公司描述" name="introduce"></textarea>
		
				</div>
				
				<!-- 公司文化 -->
				<div class="form-group">
				 <textarea id="editor2" placeholder="公司文化" name="culture"></textarea>
				</div>
				<!-- 经营范围 -->
				<div class="form-group">
				 <textarea id="editor3" placeholder="经营范围" name="scope"></textarea>
				</div>
				<!-- 工作需求 -->
				<div class="form-group">
				 <textarea id="editor4" placeholder="工作需求" name="worksRequire"></textarea>
				</div>
				
				<!-- 工作内容 -->
				<div class="form-group">
				 <textarea id="editor5" placeholder="工作内容" name="worksContent"></textarea>
				</div>
				<!-- 工作时间 -->
				<div class="form-group">
				 <textarea id="editor6" placeholder="工作时间" name="worksTime"></textarea>
				</div>
				<!-- 福利 -->
				<div class="form-group">
				 <textarea id="editor7" placeholder="福利" name="welfare"></textarea>
				</div>
				
				<!-- 团队建设 -->
				<div class="form-group">
				 <textarea id="editor8" placeholder="团队建设" name="teamBuild"></textarea>
				</div>
				
				<!-- 晋升空间 -->
				<div class="form-group">
				 <textarea id="editor9" placeholder="晋升空间" name="promotion"></textarea>
				</div>
				
				<!-- 工作环境 -->
				<div class="form-group">
				 <textarea id="editor10" placeholder="工作环境" name="worksEnv"></textarea>
				</div>
				
				<!-- 联系方式 -->
				<div class="form-group11">
				 <textarea id="editor11" placeholder="联系方式(必填)" name="connect"></textarea>
				</div>
				
				
			
			
			
				<!-- 提交 -->
				<div class="form-group">
					<input type="submit" value="提交" class="btn btn-success">
				
				</div>
			
			</div>
			<div class="col-md-2">
				
			</div>
			
			
		
		
		</div>
	




	</form>
</div>