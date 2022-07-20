<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Countries</title>
</head>
<body>
    <h2>List of countries</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>ISO 3</th>
    </tr>
    <#list countries as country>
        <tr>
            <td>${country.id}</td>
            <td>${country.name}</td>
            <td>${country.iso3}</td>
        </tr>
    </#list>
</table>
</body>
</html>
