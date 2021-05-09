<!Doctype lamp>
<html>
<head>
<title>Addition</title>
</head>
<body>
<center><h1>Addition of two numbers</h1></center>
<form name="add" method="post">
Number1:<input type="text" name="num1" /><br>
number2:<input type="text" name="num2" /><br>
<input type="submit" name="add" value="add"/>
</form>
<?php
if(isset($_POST['add']))
{
        $num1=$_POST['num1'];
        $num2=$_POST['num2'];
        $sum=$num1+$num2;
        echo "Addition of Two numbers: ".$sum;
}
?>
</body>
</html>

