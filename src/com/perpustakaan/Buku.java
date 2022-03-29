package com.perpustakaan;

public class Buku {
    String judul;
    String pengarang;
    String jumlahHalaman;
    String kategoriBuku;
    int tahunTerbit;
    int stokBuku;

    Buku (String judul, String pengarang, String jumlahHalaman, int tahunTerbit, int stokBuku, String kategoriBuku) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.stokBuku = stokBuku;
        this.kategoriBuku = kategoriBuku;
    }

    void displayDetailBuku (){
        System.out.println("\n_______________________________________________________________________________________");
        System.out.println("\t\t\t\t\t DETAIL BUKU\n");
        System.out.printf("Judul            : %s\n", this.judul);
        System.out.printf("Kategori         : %s\n", this.kategoriBuku);
        System.out.printf("Penulis          : %s\n", this.pengarang);
        System.out.printf("Tahun Terbit     : %s\n", this.tahunTerbit);
        System.out.printf("Jumlah Halaman   : %s\n", this.jumlahHalaman + " hal");
        System.out.printf("STOK             : %s\n", this.stokBuku + " buku");
        System.out.println("_______________________________________________________________________________________");
    }

    String getJudul (){
        return judul;
    }

    void meminjam(){
        stokBuku -= 1;
    }

    void mengembalikan(){
        stokBuku += 1;
    }
}

