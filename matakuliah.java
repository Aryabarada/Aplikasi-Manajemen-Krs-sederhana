package com.company;

public class matakuliah {
    int KD_Matkul;
    String Nama_matkul;
    int jumlah_SKS;

    public matakuliah(int KD_Matkul, String Nama_matkul, int jumlah_SKS){
        this.KD_Matkul =KD_Matkul;
        this.Nama_matkul = Nama_matkul;
        this.jumlah_SKS =jumlah_SKS;
    }

    public int getKD_Matkul() {
        return KD_Matkul;
    }

    public String getNama_matkul() {
        return Nama_matkul;
    }

    public int getJumlah_SKS() {
        return jumlah_SKS;
    }
}
