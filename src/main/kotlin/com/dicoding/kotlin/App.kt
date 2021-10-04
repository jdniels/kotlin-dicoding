package com.dicoding.kotlin


fun main() {
    /*
        Struktur umum init Variable
       var identifier: Type = Initialization
    */

    // Var dapat di Initialization kembali valunya...
    var company: String = "PT Enigma Cipta Humanika";

    println(company);

    company = "Enigma Camp";

    println(company);

    // sedangkan Val tidak bisa di Initialization kembali
    val name: String = "Juan Daniel";

    /* Val cannot be reassigned
       name = "anuan";
    */

    print("Tempat kerjaku $company")

//    Jika Type data Char, Initialization Menggunakan ' ' ;
    val nganu: Char = 'A';

    println(nganu);

}g
