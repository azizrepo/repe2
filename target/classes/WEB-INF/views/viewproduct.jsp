<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" errorPage="/jsp/internalerror.jsp"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>my web site</title>
<link rel="stylesheet" type="text/css" href="/grizzle/css/style.css">
</head>
<body>

<h1>Product Update page</h1>
	<div id="container">
		<form action="update"  method="post">
			<table border="0" style="float: left">
				
				<tr>
					<td>Product Id</td><td><input type="text" id="productName" name="productId" value="${product.productId }" readonly="readonly"
						placeholder="product" required="required" >
						</input>
						
						
						</td>
				</tr>
				
				<tr>
					<td>Product Name</td><td><input type="text" id="productName" name="productName" value="${product.productName }"
						placeholder="Product Name" required="required" path="productName"></input>
							
					
						</td>
				</tr>
				<tr>
					<td>Product Price</td><td><input type="text" id="productName" name="productPrice" value="${product.productPrice }"
						placeholder="Productprice" required="required"></td>
				</tr>
				<tr>
					<td>Product Category</td><td><select name="productCategory.categoryId" id="category" required="required">
							<option value="">Category
							<option value="1001">mobile
							<option value="1002">laptop
							<option value="1003">charger
							<option value="1004">battery
					</select></td>
				</tr>
				<tr>
		
					<td>Product Description</td><td><input type="text"  id="description"
						required="required"	placeholder="Product Description" name="productDescription"  	value="${product.productDescription }"></textarea></td>
				</tr>

				<tr>
					<td>Product Brand</td><td><select name="productBrand.brandId" id="brand" required="required">
							<option value="">Brand
							<option value="101">mi
							<option value="102">lenovo
							<option value="103">samsung
							<option value="104">lithuim
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" name="Update"
						value="Update"></td>
					<td>	<a href="home">Home</a></td>
				
						
					
				<tr>
					
					
			

			</table>

		</form>

	</div>

	


	</div>



</body>
</html>