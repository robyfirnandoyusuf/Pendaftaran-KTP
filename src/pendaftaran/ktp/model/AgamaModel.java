/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran.ktp.model;

/**
 *
 * @author kalfian
 */
public class AgamaModel {
    private int id;
    private String nama;

    /*public AgamaModel(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
