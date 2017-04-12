<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>添加菜单</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
<!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
<!--[if lt IE 9]>
    

    <![endif]-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<link href="${path}/resources/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="${path}/resources/assets/js/jquery-2.0.3.min.js"></script>
<script src="${path}/resources/assets/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery.js"></script>
</head>


<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="tabbable" id="tabs-946333">
					<ul class="nav nav-tabs">

						<li><a href="#panel-196414" data-toggle="tab"
							class="btn btn-primary btn-lg">添加一级菜单</a></li>
						<li class="active"><a href="#panel-271419" data-toggle="tab"
							class="btn btn-primary btn-lg" aria-checked="true">添加二级菜单</a></li>
						<li class="active"><a href="#panel-271419" data-toggle="tab"
							class="btn btn-primary btn-lg" aria-checked="true">添加三级按钮</a></li>
					</ul>

					<div class="tab-content">
						<div class="tab-pane" id="panel-196414">

							<form class="form-horizontal" action="addFirst.action"
								method="post" style="margin: 0 auto">
								<div class="control-group">
									<div class="panel-heading">
										<label class="control-label" for="name"><h3
												class="panel-title">请输入一级菜单的名称</h3></label>
									</div>

									<div class="controls">
										<input type="text" class="form-control" id="name" name="name"
											required>
									</div>
								</div>
								<br />
								<div class="control-group">
									<div class="panel-heading">
										<label class="control-label" for="name">
											<h3 class="panel-title">设置菜单状态</h3>
										</label><br /> <label class="radio-inline"> <input
											type="radio" value="1" name="status" checked="checked">可用
										</label> <label class="radio-inline"> <input type="radio"
											value="0" name="status">不可用
										</label>
									</div>
								</div>
								<div class="control-group">
									<div class="panel-heading">
										<label class="control-label" for="name">
											<h3 class="panel-title">定义类型</h3>
										</label><br /> <label class="radio-inline"> <input
											type="radio" value="1" name="type" checked="checked">菜单
										</label> <label class="radio-inline"> <input type="radio"
											value="2" name="type">按钮
										</label>
									</div>

								</div>

								<div class="control-group">
									<div class="panel-heading">
										<label class="control-label" for="name">
											<h3 class="panel-title">是否排序</h3>
										</label><br /> <label class="radio-inline"> <input
											type="radio" value="1" name="orders" checked="checked">排序
										</label> <label class="radio-inline"> <input type="radio"
											value="2" name="orders">不排序
										</label>
									</div>
								</div>
								<div class="control-group">
									<div class="panel-heading">
										<label class="control-label" for="name">
											<h3 class="panel-title">是否可查询列表</h3>
										</label><br /> <label class="radio-inline"> <input
											type="radio" value="1" name="islist" checked="checked">是
										</label> <label class="radio-inline"> <input type="radio"
											value="0" name="islist">否
										</label>
									</div>
								</div>

								<div class="control-group">

									<div class="input-group" style="float: left">
										<div class="input-group-btn">
											<button type="button" class="btn btn-default" tabindex="-1">请选择菜单图标</button>
											<button type="button" class="btn btn-default dropdown-toggle"
												data-toggle="dropdown" tabindex="-1">
												<span class="caret"></span>
											</button>
											<ul class="dropdown-menu">
												<li class="divider"></li>
												<li><a href="#" id="one">icon-desktop</a></li>
												<li class="divider"></li>
												<li><a href="#" id="two">icon-list</a></li>
												<li class="divider"></li>
											</ul>
										</div>
										<!-- /btn-group -->
										<input type="text" class="form-control" id="ic" required
											readonly name="icon">
									</div>
									<!-- /input-group -->

									<!-- /.col-lg-6 -->
									<br>
								</div>
								<br>
								<div class="control-group">
									<br /> <br />
									<div class="row clearfix">
										<div class="col-md-12 column">
											<!--<button type="submit" class="btn btn-success btn-lg" >按钮</button>-->
											<button type="submit"
												class="btn btn-success btn-lg btn-block" id="from"
												style="text-shadow: black 5px 3px 3px;">
												<span class="glyphicon glyphicon-plus"></span>
											</button>
										</div>
									</div>
								</div>
							</form>

						</div>


						<!--  二级  -->
						<div class="tab-pane" id="panel-271419"></div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$("#one").click(function() {
				var text = $(this).html()
				$("#ic").val(text)
			})

			$("#two").click(function() {
				var text = $(this).html()
				$("#ic").val(text)
			})

			

		})
	</script>

</body>
</html>