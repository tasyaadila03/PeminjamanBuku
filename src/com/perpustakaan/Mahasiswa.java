package com.perpustakaan;

public class Mahasiswa {
    String nama;
    String id_member;
    int npm;
    int peminjaman = 0;
    Buku buku;

    Mahasiswa (String nama, String id_member, int npm) {
        this.nama = nama;
        this.id_member = id_member;
        this.npm = npm;
    }
    void setNama(String nama) {
        this.nama = nama;
    }

    void setId_member(String id_member) {
        this.id_member = id_member;
    }

    void setNpm(int npm) {
        this.npm = npm;
    }

    String getNama() {
        return nama;
    }

    String getId_member() {
        return id_member;
    }

    int getNpm() {
        return npm;
    }

    void pinjamBuku(Buku buku) {
        this.buku = buku;
        this.peminjaman++;
        buku.meminjam();
        System.out.println("\nBuku \"" + buku.getJudul() + "\" dipinjam oleh anggota ");
        System.out.println("Nama        : " + this.nama);
        System.out.println("NPM         : " + this.npm);
        System.out.println("ID Member   : " + this.id_member);
    }

    void kembalikanBuku(Buku buku){
        this.buku = buku;
        this.peminjaman --;
        buku.mengembalikan();
        System.out.println("\nBuku \"" + buku.getJudul() + "\" telah dikembalikan oleh anggota ");
        System.out.println("Nama        : " + this.nama);
        System.out.println("NPM         : " + this.npm);
        System.out.println("ID Member   : " + this.id_member);
    }

    void cekDetailBuku(Buku buku) {
        this.buku = buku;
        buku.displayDetailBuku();
    }
}



