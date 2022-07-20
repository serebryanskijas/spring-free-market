<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>States</title>
</head>
<body>
    <h2>List of states</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Country</th>
    </tr>
    <#list states as state>
        <tr>
            <td>${state.id}</td>
            <td>${state.name}</td>
            <td>${state.countryName}</td>
        </tr>
    </#list>
</table>
</body>
</html>
