<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head> 
<meta charset="utf-8" />
<title>新增客户</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@ include file="/WEB-INF/pages/common/rs_css.jsp"%>

</head>
<body>
<div class="container">
			<div class="row clearfix">
				<div class="col-sm-12">
					<form class="form-horizontal" role="form" action="customer/doAdd.action" method="post">
					<fieldset>
						<legend>基本信息 &nbsp;<button class="btn btn-default" type="button"> 保存</button> </legend>
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label"><span class="labelspan">姓名：</span></label>
						    <div class="col-sm-4">
						      	<input name="name" type="text" class="form-control" id="name" >
						    </div>
						    <label for="custName" class="col-sm-2 control-label"><span class="labelspan">性别：</span></label>
						    <div class="col-sm-4">
						      	男<input name="sex" type="radio" id="sex" >&nbsp;
						      	女<input name="sex" type="radio" id="sex" >
						    </div>
					    </div>
					    <div class="form-group">
							<label for="telephone" class="col-sm-2 control-label"><span class="labelspan">手机号：</span></label>
						    <div class="col-sm-4" id="level">
						      	<input type="tel" name="phone" class="form-control">
						    </div>
						    <label for="major" class="col-sm-2 control-label"><span class="labelspan">专业：</span></label>
						    <div class="col-sm-4">
						      	<input name="major" type="text" class="form-control" id="major" >
						    </div>
					    </div>
					    <div class="form-group">
							<label for="degree" class="col-sm-2 control-label"><span class="labelspan">学历：</span></label>
						    <div class="col-sm-4">
						      	<input name="profession" type="text" class="form-control" id="degree" >
						    </div>
						    <label for="graduationtime" class="col-sm-2 control-label"><span class="labelspan">毕业时间：</span></label>
						    <div class="col-sm-4">
						        <input name="graduationtime" type="date" class="form-control" id="graduationtime" >
						    </div>
					    </div>
					    <div class="form-group">
							<label for="source" class="col-sm-2 control-label"><span class="labelspan">客户来源：</span></label>
						    <div class="col-sm-4">
						      	 <input name="source" type="text" class="form-control" id="source" >
						    </div>
						    <label for="isopen" class="col-sm-2 control-label"><span class="labelspan">是否公共：</span></label>
						    <div class="col-sm-4">
						      	是<input name="isopen" type="radio" >&nbsp;
						      	否<input name="isopen" type="radio" >
						    </div>
					    </div>
					    <div class="form-group">
							<label for="loaninf" class="col-sm-2 control-label"><span class="labelspan">贷款情况：</span></label>
						    <div class="col-sm-10">
						      	<input name="loaninf" type="text" class="form-control" id="loaninf" >
						    </div>
					    </div>
					    <div class="form-group">
					    <label for="baseinfo" class="col-sm-2 control-label"><span class="labelspan">基本情况：</span></label>
					    	<div class="col-sm-10">
					    	<textarea rows="6" cols="130" name="baseinfo" id="baseinfo"></textarea>
					    	</div>
					    </div>
					    <div class="form-group">
					    <label for="economicinfo" class="col-sm-2 control-label"><span class="labelspan">经济情况：</span></label>
					    	<div class="col-sm-10">
					    	<textarea rows="6" cols="130" name="economicinfo" id="economicinfo"></textarea>
					    	</div>
					    </div>
					</fieldset>
					</form>
				</div>
			</div>
		</div>
<%@ include file="/WEB-INF/pages/common/rs_js.jsp"%>
</body>
</html>