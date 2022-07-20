<!doctype html>
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
            <td>${city.name}</td>
        </tr>
    </#list>
</table>
</body>
</html>
