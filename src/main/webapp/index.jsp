<%@ page contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html>
		<head>
				<meta charset="UTF-8">
				<title>Insert title here</title>
				   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" />
			      <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
			      <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"></script>
		</head>
		<body>
				<div class = "card m-3">
						<div class = "card-header">
							서블릿
						</div>
					<div class = "card-body">
					<div class = "card">
					<div class = "card-header">
						요청 경로 얻기(Controller 선택)
					</div>
					<div class = "card-body">
						<a href="/ch01" class = "btn btn-info btn-sm">ch01 요청</a>
						<a href="/ch02" class = "btn btn-info btn-sm">ch02 요청</a>
					</div>
				</div>
				
				<div class = "card">
					<div class = "card-header">
						요청 파라미터 얻기
					</div>
					<div class = "card-body">
						<form method="post" action="ch03">
			               <div class="input-group">
			                  <div class="input-group-prepend"><span class="input-group-text">param1</span></div>
			                  <input type="text" name="param1" class="form-control" value="문자열">
			               </div>
			               <div class="input-group">
			                  <div class="input-group-prepend"><span class="input-group-text">param2</span></div>
			                  <input type="text" name="param2" class="form-control" value="5">
			               </div>
			               <div class="input-group">
			                  <div class="input-group-prepend"><span class="input-group-text">param3</span></div>
			                  <input type="text" name="param3" class="form-control" value="3.14">
			               </div>
			               <div class="input-group">
			                  <div class="input-group-prepend"><span class="input-group-text">param4</span></div>
			                  <div class="btn-group btn-group-toggle" data-toggle="buttons">
			                     <label class="btn btn-secondary active"> 
			                     <input type="radio" name="param4" checked value="true"> true
			                     </label> 
			                     <label class="btn btn-secondary"> 
			                     	<input type="radio" name="param4" value="false"> false
			                     </label>
			                  </div>
			               </div>
			               <div class="input-group">
			                  <div class="input-group-prepend"><span class="input-group-text">param5</span></div>
			                  <input type="date" name="param5" class="form-control" value="2030-12-05">
			               </div>
			               <input class="mt-2 btn btn-info btn-sm" type="submit" value="요청" />
			            </form>
					</div>
			</div>
		</div>
	</body>
</html>