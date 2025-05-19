/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import poly.cafe.entity.Category;

/**
 *
 * @author Huyen
 */
public class Test {

    public static void main(String[] args) throws SQLException {
        // Thêm mới 
//        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
//        XJdbc.executeUpdate(sql, "C01", "Loai 1");
//        XJdbc.executeUpdate(sql, "C02", "Loai 2");

        //Truy vấn nhiều bản ghi  => LAB 2
        String sql = "SELECT * FROM Categories WHERE Name LIKE ?";
        ResultSet rs = XJdbc.executeQuery(sql, "%Loai %");
        //tự test giá trị trả về
        while (rs.next()) {
            String id = rs.getString("Id");
            String name = rs.getString("Name");
            System.out.println("ID: " + id + ", Name: " + name);
        }
        //Truy xuất nhiều bản ghi và chuyển đổi sang List<Bean> 
        String sql2 = "SELECT * FROM Categories WHERE Name LIKE ?";
        List<Category> beans = XQuery.getBeanList(Category.class, sql2, "%Loai%");
        for (Category bean : beans) {
            System.out.println(bean.toString());
        }
//        Truy xuất một bản ghi và chuyển đổi sang Bean 
        String sql3 = "SELECT * FROM Categories WHERE Id=?";
        Category bean = XQuery.getSingleBean(Category.class, sql3, "C02");
        System.out.println("Tìm thấy: "+ bean.toString());
    }
}
