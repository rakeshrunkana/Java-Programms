<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bus Bookings</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            margin-top: 20px;
            margin-bottom: 30px;
        }
        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            border-spacing: 0;
            background-color: #fff;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
        .button {
            display: block;
            width: 150px;
            margin: 20px auto;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            background-color: #4CAF50;
            color: white;
            border-radius: 4px;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h1>Bus Bookings</h1>
    <table>
        <tr>
            <th>From Place</th>
            <th>To Place</th>
            <th>Journey Date</th>
            <th>No of Passengers</th>
        </tr>
        <c:forEach items="${bookings}" var="booking">
            <tr>
                <td>${booking.fromPlace}</td>
                <td>${booking.toPlace}</td>
                <td>${booking.journeyDate}</td>
                <td>${booking.numOfPassengers}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="home" class="button">Back to Home</a>
</body>
</html>
