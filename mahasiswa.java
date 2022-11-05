package com.company;

public class mahasiswa {
    int NIM;
    String Nama_mhs;

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setNama_mhs(String nama_mhs) {
        Nama_mhs = nama_mhs;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    String Alamat;

    public mahasiswa(int NIM, String Nama_mhs, String Alamat){
        this.NIM = NIM;
        this.Nama_mhs = Nama_mhs;
        this.Alamat = Alamat;
    }

    public int getNIM() {
        return NIM;
    }

    public String getNama_mhs() {
        return Nama_mhs;
    }

    public String getAlamat() {
        return Alamat;
    }
}
