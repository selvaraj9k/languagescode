<html>
<head>
<title>php</title>
</head>
<body bgcolor="Yellow">
<form method="get" value="show">
ROLL NO:<input type="text" name="word">
<input type="submit" name="show" value="show">
</form>
<?php

if(isset($_GET['show']))
{
        $name=$_GET['word'];
}
echo $name;
?>
</body>
</html>
