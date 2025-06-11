/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1.entity;

import lombok.*;

/**
 *
 * @author Huyen
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sach {
    private int id;
    private String ma;
    private String ten;
    private int soTrang;
    private double donGia;
    private int idNXB;
    private int trangThai;
    
   
}
