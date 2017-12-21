<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello</title>

<%@include file="/common/common.jsp" %>

</head>

<body>

	<!-- 数据表格组件 -->
	<table id="userDatagrid" class="easyui-datagrid" url="/user/queryByAge" title="用户管理" fit="true" border="false"
		fitColumns="true" singleSelect="true" pagination="true" rownumbers="true" toolbar="#userDatagridToolbar">
		<thead>
			<tr>
				<th data-options="field:'id'">编号</th>
				<th data-options="field:'name',width:10">姓名</th>
				<th data-options="field:'age',width:10">年龄</th>
				<th data-options="field:'address',width:10">地址</th>
			</tr>
		</thead>
	</table>
</body>
</html>