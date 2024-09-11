package controller;

import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package
import model.store;

public class DBConnection {

    public boolean insertNewStore(store toy) {
    boolean result = false;
    Connection connection = null;
    try {
        // เชื่อมต่อฐานข้อมูล
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/storetoy",
                "root", "Kim_12345678");

        Statement statement;
        statement = connection.createStatement();

        // สร้างคำสั่ง SQL สำหรับการเพิ่มข้อมูล
        String query = "INSERT INTO toy "
            + "(toyName, type, size, color, price) "
            + "VALUES('" + toy.getName() + "', '"
            + toy.getType() + "', '"
            + toy.getsize() + "', '"
            + toy.getcolor() + "', "
            + toy.getPrice() + ")";
        System.out.println("........SQL: " + query);

        // ดำเนินการคำสั่ง SQL
        int i = statement.executeUpdate(query);  // executeUpdate returns row count
        if (i != 0) {
            result = true;
        }
        statement.close();
        connection.close();
    } catch (ClassNotFoundException | SQLException exception) {
        System.out.println(exception);
    }

    return result;
}


    /*
    https://www.geeksforgeeks.org/java-database-connectivity-with-mysql/
     */
    public void testRetrieve() {
        Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/storetoy",
                    "root", "Kim_12345678");

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "SELECT toyName, type, size, color, price FROM toy");
            String toyName;
            String type;
            String size;
            String color;
            String  price;
            while (resultSet.next()) {
            toyName = resultSet.getString("toyName").trim();
            type = resultSet.getString("type").trim();
            size = resultSet.getString("size").trim();
            color = resultSet.getString("color").trim();
            price = resultSet.getString("price");

            // พิมพ์ค่าที่เก็บในตัวแปร
            System.out.println("Toy Name: " + toyName);
            System.out.println("Type: " + type);
            System.out.println("Size: " + size);
            System.out.println("Color: " + color);
            System.out.println("Price: " + price);
        }

        resultSet.close();
        statement.close();
        connection.close();
    } catch (Exception exception) {
        System.out.println(exception);
    }
}
}
