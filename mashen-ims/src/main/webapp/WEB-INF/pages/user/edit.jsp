<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head> 
<meta charset="utf-8" />
<title>新增用户</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@ include file="/WEB-INF/pages/common/rs_css.jsp"%>
<style type="text/css">
</style>
</head>
<body>
	<div class="row">
	   <div class="col-md-2"></div>
		<div class="col-md-8">
			<form role="form" action="${path }/user/doEdit.action" method="post">
				<div class="form-group">
					<label for="name">姓名</label> <input type="text" required="required"
						class="form-control" name="name" value="${user.name }" placeholder="请输入姓名">
				</div>
				<div class="form-group">
					<label for="name">手机号</label> <input type="number" required="required"
						class="form-control" name="phone" value="${user.phone }" placeholder="请输入手机号">
				</div>
				<div class="form-group">
					<label for="name">账号</label> <input type="text" required="required"
						class="form-control" name="account" value="${user.account }" placeholder="请输入账号">
				</div>
				<div class="form-group">
					<label for="name">密码</label> <input type="password" required="required"
						class="form-control" name="password" value="${user.password }" placeholder="请输入密码">
				</div>
				<div class="form-group" >
					<label for="dept" >所属部门</label>
					<select name="roleId" id="dept">
						<option>--请选择--</option>
					</select> 
				</div>
				<div class="form-group">
					<label for="role">岗位</label>
					<select name="roleId" id="role">
					
					</select>
				</div>
				<div class="text-center">
				<button type="submit" class="btn btn-primary">保存</button>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="${path }/user/list.action" class="btn btn-default">返回</a>
				</div>
			</form>
		</div>
		<div class="col-md-2"></div>
	</div>
	<%@ include file="/WEB-INF/pages/common/rs_js.jsp"%>
</body>
<script type="text/javascript">
		$.post("${path}/user/getDept.action?pid=0",function(data){
			$.each(data,function(index,item){
				var option = $("<option></option>");
				option.attr("value",item.departmentId).text(item.name);
				$("#dept").append(option);
			});
		},"json");
		
		$.post("${path}/user/getRole.action",function(data){
			$.each(data,function(index,item){
				var option = $("<option></option>");
				option.attr("value",item.departmentId).text(item.name);
				$("#role").append(option);
			});
		},"json");
	
</script>
</html>