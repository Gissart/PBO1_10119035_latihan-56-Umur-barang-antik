package com.tugasPBO;
/*
Nama        : Argya Aulia Fauzandika
NIM         : 10119035
Kelas       : PBO1 / IF1
Deskripsi   : menampilan informasi umur barang antik 
* */

public class Main {
    public static void main(String[] args){
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik ini : "+radio.getName());
        radio.tampilUmur();
    }
}
