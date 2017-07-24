<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Form</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-weight: bold;
	font-style: italic;
}
</style>
</head>
<h1>Book Form</h1>
<body>
<form:form method="post" action="saveBook" commandName="books">

<table>
	<tr>
		<td>Enter BookId:</td>
		<td>
			<form:input path="bookId"/>
		</td>
		<td>
			<form:errors path="bookId" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	<tr>
		<td>Enter bookName:</td>
		<td>
			<form:input path="bookName"/>
		</td>
		<td>
			<form:errors path="bookName" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Enter Price:</td>
		<td>
			<form:input path="price"/>
		</td>
		<td>
			<form:errors path="price" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Enter Author:</td>
		<td>
			<form:input path="author"/>
		</td>
		<td>
			<form:errors path="author" cssClass="errMsg"></form:errors>
		</td>
	</tr>

	<tr>
		<td>Enter PublishDate:</td>
		<td>
			<form:input path="publishDate"/>
		</td>
		<td>
			<form:errors path="publishDate" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Author EmailId:</td>
		<td>
			<form:input path="authorEmail"/>
		</td>
		<td>
			<form:errors path="authorEmail" cssClass="errMsg"></form:errors>
		</td>
	</tr>
		<tr>
			<td></td>
			<td>
				<input type="submit" value="Save">
			</td>
		</tr>
	
</table>

</form:form>
<hr>


<c:if test="${!empty allbooks }">
<table>

	<tr>
		<th>Book Id</th>
		<th>Book Name</th>
		<th>Book Author</th>
		<th>Book price</th>
		<th>PublishDate</th>
		<th>Author Email</th>
		<th>Edit</th>
	</tr>

	<c:forEach var="book" items="${allbooks}">
		<tr>
			<td>${book.bookId }</td>
			<td>${book.bookName }</td>
			<td>${book.author }</td>
			<td>${book.price }</td>
			<td>${book.publishDate }</td>
			<td>${book.authorEmail }</td>
			<td>
			<a href="delete/${book.bookId}">delete</a> &nbsp;&nbsp;&nbsp;&nbsp;
				 <a href="edit/${book.bookId}">edit</a>
			</td>
		</tr>
	
	</c:forEach>

</table>


</c:if>









</body>
</html>