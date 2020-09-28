
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>calc_page</title>
</head>
<body>
    <form action="/calc" method="post" id="form">
        <label for="num1">first number:</label>
        <input id="num1" name="num1" type="text">
        <label for="num2">second number:</label>
        <input id="num2" name="num2" type="text">
        <label for="operationType">operation type:</label>
        <select id="operationType" name="operationType">
            <option value="SUM">+</option>
            <option value="SUB">-</option>
            <option value="MUL">*</option>
            <option value="DIV">/</option>
        </select>

        <button>calculate</button>
    </form>


    <br>
    <br>
    <c:if test="${result != null}">
        result : ${result}
    </c:if>


    <script>
        var form = document.getElementById('form');

        form.onsubmit = function () {
            if (isNaN(Number(form.num1.value))) {
                alert('You write invalid value for FIRST number!')
                return false;
            }
            else if (isNaN(Number(form.num2.value))) {
                alert('You write invalid value for SECOND number!')
                return false;
            }
            else if (form.num2.value == 0 && form.operationType.value === 'DIV') {
                alert('Cannot be division by zero!')
                return false;
            }

            return true;
        }
    </script>
</body>
</html>
