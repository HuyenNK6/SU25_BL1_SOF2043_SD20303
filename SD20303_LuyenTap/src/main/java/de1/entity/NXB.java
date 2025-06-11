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
//@Getter
//@Setter
//@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NXB {
    private int id;
    private String ma;
    private String ten;

    @Override
    public String toString() {
        return ten;
    }
}
