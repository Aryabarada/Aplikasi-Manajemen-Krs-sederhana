package com.company;

public class dosen {
    int ID_Dosen;
    String Nama_Dosen;
    String Alamat;

    public void setID_Dosen(int ID_Dosen) {
        this.ID_Dosen = ID_Dosen;
    }

    public void setNama_Dosen(String nama_Dosen) {
        Nama_Dosen = nama_Dosen;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public dosen (int ID_Dosen, String Nama_Dosen, String Alamat){
        this.ID_Dosen = ID_Dosen;
        this.Nama_Dosen = Nama_Dosen;
        this.Alamat = Alamat;
    }

    public int getID_Dosen() {
        return ID_Dosen;
    }

    public String getNama_Dosen() {
        return Nama_Dosen;
    }

    public String getAlamat() {
        return Alamat;
    }

}
