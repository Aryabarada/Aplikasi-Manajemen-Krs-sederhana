package com.company;

public class ruang {
    int KD_ruang;
    String lokasi;

    public ruang(int KD_ruang, String lokasi){
        this.KD_ruang = KD_ruang;
        this.lokasi = lokasi;
    }

    public int getKD_ruang() {
        return KD_ruang;
    }

    public String getLokasi() {
        return lokasi;
    }
}
