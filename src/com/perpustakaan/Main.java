package com.perpustakaan;

public class Main {

    public static void main(String[] args) {
        //INSTANSIASI MEMBER PERPUSTAKAAN
        Mahasiswa member1 = new Mahasiswa ("Anggita Cahaya","011203", 2015061047);
        Mahasiswa member2 = new Mahasiswa ("Fachreel Ansa Albirru","011210", 2015071045);

        //INSTANSIASI BUKU PERPUSTAKAAN
        Buku buku1 = new Buku ("How To Win Friends & Influence People In The Digital Age","Dale Carnegie","282",2012,24, "Buku Fiksi");
        Buku buku2 = new Buku ("Ensiklopedia Sastra Dunia", "Anton Kurnia", "314",2006, 21, "Buku Non Fiksi");
        Buku buku3 = new Buku ("PEMROGRAMAN BERORIENTASI OBJEK MENGGUNAKAN JAVA", "Adam Mukharil Bachtiar", "289", 2018, 54, "Buku Programming");

        //MEMINJAM
        member1.pinjamBuku(buku3);
        member1.pinjamBuku(buku1);
        member2.pinjamBuku(buku1);

        //CEK DATA BUKU DAN STOK
        member1.cekDetailBuku(buku3);
        member2.cekDetailBuku(buku1);
        member2.cekDetailBuku(buku2);

        //MENGEMBALIKAN
        member2.kembalikanBuku(buku1);

        //CEK DATA BUKU DAN STOK
        member2.cekDetailBuku(buku1);
    }
}

