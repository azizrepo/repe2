<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>home page</title>

</head>
<body>
<h1>All available products are</h1>
<table border="1">
<tr>
<td>Product id</td>
<td>ProductName </td>
<td>ProductPrice </td>
<td>ProductDescription </td>
<td>CategoryId </td>
<td>CategoryName</td>
<td>BrandId</td>
<td>BrandName</td>
<td>Action</td>

</tr>

<c:forEach items="${productList }" var="product">
<tr>
<form action="view" method="post">

<td>${product.productId }</td>
<input type="hidden" name="productId" value="${product.productId }">
<td>${product.productName }</td>
<td>${product.productPrice }</td>
<td>${product.productDescription }</td>
<td>${product.productCategory.categoryId }</td>
<td>${product.productCategory.categoryName}</td>

<td>${product.productBrand.brandId }</td>
<td>${product.productBrand.brandName }</td>

<td><input type="submit" name="action" value="Update"></td>
</form>
</tr>

</c:forEach>



</table>



</body>
</html>