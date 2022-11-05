package com.company;

public class krs {
    int KD_KRS;
    int semester;
    String kelas;

    public krs (int KD_KRS, int semester, String kelas){
        this.KD_KRS = KD_KRS;
        this.semester = semester;
        this.kelas = kelas;
    }

    public int getKD_KRS() {
        return KD_KRS;
    }

    public int getSemester() {
        return semester;
    }

    public String getKelas() {
        return kelas;
    }
}
