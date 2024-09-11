<%-- 
    Document   : updatestore
    Created on : 18 ก.ค. 2567, 14:15:26
    Author     : TUF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.store" %>
<!DOCTYPE html>
<html>
    <body>
        <% store toy = (store) session.getAttribute("toy");%>
        <p>แก้ไขข้อมูลของเล่น</p>
        <form action="Addstore">
            <input type="text" name="id" value="<%= toy.getId()%>"><br/>
            <input type="text" name="toyName" value="<%= toy.getName()%>"><br/>
            <input type="text" name="Type" value="<%= toy.getType()%>"><br/>
            <input type="text" name="size" value="<%= toy.getsize()%>"><br/>
            <input type="text" name="color" value="<%= toy.getcolor()%>"><br/>
            <input type="text" name="price" value="<%=toy.getPrice()%>"<br/>
            <input type="submit" value="แก้ไข">            
        </form>
        <% session.removeAttribute("store"); %>
    </body>
</html>