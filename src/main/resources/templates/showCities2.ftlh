<!doctype html>
<#setting locale="en_US">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cities</title>
</head>
<body>
    <h2>List of cities</h2>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>State</th>
    </tr>
    <#list cities as city>
        <tr>
            <td>${city.id}</td>
            <td><a href="https://google.com/maps?q=${city.latitude},${city.longitude}"> ${city.name}</a></td>
            <td>${city.stateName}</td>
            <td>${city.latitude}</td>
            <td>${city.longitude}</td>
        </tr>
    </#list>
</table>
</body>
</html>
