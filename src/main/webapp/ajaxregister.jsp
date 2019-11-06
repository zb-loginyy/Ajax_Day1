<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<html>
<head>
    <script  type="application/javascript">
        function checkusername() {
            //获取用户输入的用户名
            var  input=document.getElementById("input");
            var  username=input.value;
            //发送异步请求到后台进行对应的校验
            //创建异步请求对象
            var   xhr;
            if (window.ActiveXObject){
                //IE系
                xhr=new  ActiveXObject("Microsoft.XMLHTTP");
            } else{
                //非IE系
                xhr=new  XMLHttpRequest();
            }
            //打开异步请求
           // xhr.open("GET","${pageContext.request.contextPath}/ajaxcheckusername?username="+username);
            //发送异步请求
            //xhr.send(null);
            //模拟表单 发送POST表单
             xhr.open("POST","${pageContext.request.contextPath}/ajaxcheckusername");
             xhr.setRequestHeader("content-type","application/x-www-form-urlencoded")
             xhr.send("username="+username);
            //监听响应
            xhr.onreadystatechange=function () {
                //代表响应正确完成
                if (xhr.readyState==4&&xhr.status==200){
                    //获取到相应的信息
                    var message=xhr.responseText;
                    var  span=document.getElementById("span");
                    //把校验信息放置在具体的位置上
                    span.innerHTML=message;
                }
            }
        }


    </script>
</head>
<body>
<form action="" method="post"  >
    用户名 <input id="input" type="text"  name="username" onblur="checkusername()"/><span id="span"></span>  <br/>
    密码    <input type="password" name="password" /> <br/>
    年龄 <input type="text" name="age" /> <br/>
    <input type="submit" value="注册" />
</form>

</body>


</html>