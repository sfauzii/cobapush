/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sfauzi.cobapush;

/**
 *
 * @author S FAUZI
 * SYAHRUL FAUZI
 * 21103015
 */

public class Cobapush {

    public static void main(String[] args) {
       int jmlh_looping = 5;
       int bil1 = 5;
       int bil2 = 2;
       
       CobaPushOriented push = new CobaPushOriented();
       push.pushPush(jmlh_looping);
        System.out.println("FUNGSI TAMBAH");
        System.out.println("Hasilnya : " +push.tambah(bil1, bil2));
    }
}
