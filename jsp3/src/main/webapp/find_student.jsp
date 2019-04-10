<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  <!--  prefix 值是 别名。 -->
<%@taglib uri= "/lhh-tags"  prefix="s" %> <!-- 这个是 自己写的 标签 s , 一个taglib 引用一个标签-->
<!doctype html>
<html>
   <head>
       <meta charset="utf-8">
       <title>EL和JSTL</title>
   </head>
   <body>
       <h1>JSTL</h1>
       <!-- 1.  if 判断 是男是女-->
       <p>
           <c:if test="${stu1.sex=='M' }">男</c:if>
           <c:if test="${stu1.sex=='F' }">女</c:if>
       </p>
       <!-- 2. choose 判断是男是女 -->
       <p>
       <!--  一个 when 就是 if , 第二个 when 就是 else if  , 第三个 otherwise 是 else -->
          <c:choose>
               <c:when test="${stu1.sex=='M' }">男</c:when>
               <c:otherwise>女</c:otherwise>
          </c:choose>
       </p>
       <!--  3. forEach -->
       <!--  items: 声明遍历的数据  var : 给每次循环所获得的数据命名 -->
       
       <p>
           <c:forEach  items="${stu1.interests }"  var="i">
              ${i }
           </c:forEach>
       </p>
       
       <!--  4. 自定义标签-->
        <!-- 因为没有内容，所以是单标签。
         <s:sysdate/>   -->
         <!-- 默认的时间格式为 / / /， 如果需要改时间格式就如下：第二个 -->
          <s:sysdate/>   
          <s:sysdate format="yyyy年MM月dd日"/> 
       
        <h1>EL</h1>
        <!-- 1. 获取Bean 属性 -->
        <!-- request.getAttribute("stu1").getName()  — 等价于下面, 但是底层是用 类反射技术写的：-->
        <p>姓名:${stu1.name}</p>
        <!-- request.getAttribute("stu1").getAge()  — 等价于下面, 但是底层是用 类反射技术写的：-->
        <p>年龄:${stu1["age"]}</p>
        <!--  request.getAttribute("stu1").getCourse().getId() -->
        <p>课程:${stu1.course.id}</p>
        
        <!--  EL 的取值范围：
       第一种 1. EL 默认从如下 4 个对象中依次取值：
            page , request , session , application , 这 4 个隐含对象是 EL 默认的取值范围。
        第二种 2. 也可以指定取值范围:
         指定在request 中取值: requestScope.stu.name
         指定在session 中取值：sessionScope.stu.name
         等等..... 以此类推
        3. 第一种 1 的设计默认取值的目的，是为了开发者不用经常写范围，是为了简化 EL表达式。   -->
         <p>性别：${requestScope.stu.sex }</p>
         
      <!--  2. EL 支持运算 -->
      <p>年龄+5: ${stu1.age+5 }</p>
      <p>判断年龄在 20-30之间 : ${stu1.age>20 && stu1.age<30 }</p>
      <p>判断是否为空：${empty stu1 }</p>
      <!--  3. 获取请求的参数： -->
      <p>参数: ${param.user }</p>
   </body>
</html>