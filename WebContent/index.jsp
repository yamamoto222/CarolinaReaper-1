<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Event,java.util.List" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>タイトル</title>
<STYLE type="text/css">
 <!--
.scr {
   overflow: scroll;   /* スクロール表示 */
   width : 600px;
   height: 200px;
 }
-->
</STYLE>
</head>
<body>
<h1>タイトル</h1>
<h2>イベント一覧</h2>
<DIV class="scr">

<table border="1">
<thead>
	<tr>
		<th width="150">イベント名</th>
		<th width="100">幹事名</th>
		<th width="100">場所</th>
		<th width="80">締切日</th>
		<th width="400">備考</th>
	</tr>
</thead>
<tbody>
	<% for(int i = 0;i<10;i++){%>
		 <tr>
		</tr>
	<% } %>
</tbody>

	</table>
</DIV>
<h2>イベント作成</h2>
<form action="/CarolinaReaper/EventCreation"  method="post">
<table>
	<tr>
		<th>イベント名：</th>
		<td><input type="text" name="eventName" size="40" required maxlength="20">必須</td>
	</tr>
	<tr>
		<th>幹事者名：</th>
		<td><input type="text" name="organizarName" size="40" required maxlength="20">必須</label></td >
	</tr>
	<tr>
		<th>イベント作成者</th>
		<td><input type="text" name="autherName" size="40"  maxlength="20"></label></td >
	</tr>
	<tr>
		<th>場所：</th>
		<td> <input type="text" name="eventVenue" size="40" maxlength="20"></td>
	</tr>
	<tr>
		<th>一人分費用：</th>
		<td><input type="text" name="pricePerPerson" size="40" maxlength="20"><td>
	</tr>
	<tr>
		<th>投稿締切日：</th>
		<td><input type="number" name="deadlineYear" size="4" maxlength="4">年
			<input type="number" name="deadlineDayMonth" size="2"maxlength="2">月
			<input type="number" name="deadlineDay" size="2" maxlength="2">日
	</tr>
	<tr>
		<th>日程候補：</th>
		<td><input type="number" name="year" size="4" required maxlength="4">年
			<input type="number" name="month" size="2"required maxlength="2">月
			<input type="number" name="day" size="2" required maxlength="2">日
			<input type="number" name="hour" size="2"required maxlength="2">時必須</td>
	</tr>
	<tr>
	<script language="Javascript">
	function Click_Sub() {
	if (document.all.div1.style.display == "none") {
		document.all.div1.style.display = "block"
	} else {
		document.all.div1.style.display = "none"
	}
}
	</script>

	<th><input type="button" value="他の日程も選ぶ" onclick="Click_Sub()"></th>
		<td><div id="div1"><input type="number" name="year"required size="4" maxlength="4">年
			<input type="number" name="month" size="2"required maxlength="2">月
			<input type="number" name="day" size="2" required maxlength="2">日
			<input type="number" name="hour" size="2"required maxlength="2">時必須</div><td>
	</tr>
	<tr>
	<script language="Javascript">
function Click_Sub() {
	if (document.all.div1.style.display == "none") {
		document.all.div1.style.display = "block"
	} else {
		document.all.div1.style.display = "none"
	}
}
</script>
	<tr>
		<th> 備考：</th>
 		<td><input type="text" name="memo" size="" maxlength="20"></td>
	</tr>
	<tr>
		<th>イベント一覧に載せる</th>
		<td>yes<input type="radio" name="eventOpenFlag" required value="1">
			no<input type="radio" name="eventOpenFlag" required value="0"></td>
	</tr>
	<tr>
		<th>幹事者用パスワード：</th>
		<td><input type="text" name="autherPass" size="20" required maxlength="20">必須</td>
	</tr>
</table>
<input  type="submit" value="イベントを作成する" >

</form>
</body>
</html>
