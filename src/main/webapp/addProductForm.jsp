<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add Product</h1>
<form action="listproductServlet"method="post">
<label>ProductId</label>
<input type="text" name="Id" required /><br/><br/>
<label>ProductName</label>
<input type="text" name="name" required /><br/><br/>
<label>Product Price</label>
 <input type="text" name="price" required /><br/><br/>
 <button class="btn btn-outline-primary">Add Product</button>
</form>
</body>
</html>