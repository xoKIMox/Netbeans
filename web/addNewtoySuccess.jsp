<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.store" %>
<!DOCTYPE html>
<html>
    <body>
        <!-- get session object movie -->
        <% store toy = (store) session.getAttribute("toy");%>
        <p>ของเล่นที่เพิ่มได้แล้ว</p>
        id: <%=toy.getId() %><br/>
        ชื่อของเล่น: <%= toy.getName() %><br/>
        ประเภท <%= toy.getType() %><br/>
        ขนาด <%= toy.getsize() %><br/>
        สี <%= toy.getcolor() %><br/>
        ราคา: <%=toy.getPrice() %><br/>
        <a href="updatestore.jsp">แก้ไขข้อมูลของเล่น</a>
    </body>
</html>