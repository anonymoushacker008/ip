<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 100%;
    border-collapse: collapse;
}

table, td, th {
    border: 1px solid black;
    padding: 5px;
}

th {text-align: left;}
</style>
</head>
<body>

<?php
$q = $_GET['q'];

$con = mysqli_connect('localhost','root','','test');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"test");
$sql="SELECT * FROM books WHERE sem = '".$q."'";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Semester</th>
<th>Subject Code</th>
<th>Subject</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['sem'] . "</td>";
    echo "<td>" . $row['code'] . "</td>";
    echo "<td>" . $row['subject'] . "</td>"; ?>

   <?php  echo "</tr>";
}
echo "</table>";

mysqli_close($con);
?>
</body>
</html>
