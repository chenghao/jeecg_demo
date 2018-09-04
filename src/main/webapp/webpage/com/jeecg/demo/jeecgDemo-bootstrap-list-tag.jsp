<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>请假表单管理</title>
<meta name="viewport" content="width=device-width" />

    <t:base type="bootstrap,bootstrap-table2,layer"></t:base>

</head>
<body>
<t:datagrid name="jeecgDemoList1" checkbox="true" component="bootstrap-table" sortName="birthday,name" pagination="true" fitColumns="false" title="jeecg_demo" 
  	  superQuery="true" actionUrl="jeecgListDemoController.do?datagrid" idField="id" fit="true" queryMode="group" filter="true">
    <t:dgCol title="id"  field="id"   hidden="true"   queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="名称"  field="name" query="true" showLen="5" autocomplete="true"  width="120"></t:dgCol>
    <t:dgCol title="年龄"  extend="{style:'width:50px'}"  editor="numberbox" field="age"  query="true" width="120"></t:dgCol>
    <t:dgCol title="生日"  hidden="true"  field="birthday" formatter="yyyy-MM-dd"   queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="性别"  field="sex"  query="true" showMode="radio" dictionary="sex" width="120" extendParams="styler:fmtype"></t:dgCol>
    <t:dgCol title="电话"  field="phone" queryMode="group"  width="120"></t:dgCol>
    <t:dgCol title="工资"  field="salary" query="true" queryMode="group" width="120"></t:dgCol>
    <t:dgCol title="创建日期"  field="createDate" formatter="yyyy-MM-dd" query="true" queryMode="group" editor="datebox" width="120"></t:dgCol>
    <t:dgCol title="邮箱"  field="email" query="true"  popup="true" dictionary="user_msg,realname,realname" width="120"></t:dgCol>
    <t:dgCol title="入职状态"  field="status" query="true" extend="{style:{width:'300px';color:'red'};datatype:'*';}" defaultVal='N'  dictionary="sf_yn" width="80"></t:dgCol>
    <t:dgCol title="个人介绍"  field="content"  hidden="true"   queryMode="group"  width="150"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="250"></t:dgCol>
   <t:dgDelOpt title="删除" url="jeecgListDemoController.do?doDel&id={id}" urlclass="btn btn-danger btn-xs"  urlfont="glyphicon glyphicon-remove"/>
   <t:dgToolBar title="录入" icon="icon-add" url="jeecgListDemoController.do?goBootStrapTableAdd" funname="add" width="800" height="700"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="jeecgListDemoController.do?goBootStrapTableUpdate" funname="update" width="770"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="jeecgListDemoController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
  </t:datagrid>
</body>
</html>