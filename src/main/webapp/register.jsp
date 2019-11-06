<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<html>
<head>
    <script  type="application/javascript">
        function checkusername() {
            //获取对应的用户名
            var  input=document.getElementById("input");
            var  username=input.value;
            //发送请求到后台进行对应的校验
            location.href="${pageContext.request.contextPath}/checkusername?username="+username;
        }
    </script>
</head>
<body>
    <form action="" method="post" >
        用户名 <input id="input" type="text" value="${requestScope.username}" name="username" onblur="checkusername()"/> ${requestScope.message} <br/>
        密码    <input type="password" name="password" /> <br/>
        年龄 <input type="text" name="age" /> <br/>
        <input type="submit" value="注册" />
    </form>

</body>


</html>