/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.util;

/**
 *
 * @author Huyen
 */
public class Test {

    public static void main(String[] args) {
        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
        XJdbc.executeUpdate(sql, "C01", "Loai 1");
        XJdbc.executeUpdate(sql, "C02", "Loai 2");
    }
}
