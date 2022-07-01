/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
/*
 * @author macbookair@angga
 */
public class Jasa {
    private String idJasa, namaJasa, deskripsiJasa, harga;

    public Jasa(String namaJasa, String deskripsiJasa, String harga) {
        this.namaJasa = namaJasa;
        this.deskripsiJasa = deskripsiJasa;
        this.harga = harga;
    }
    
    public Jasa(){}
    
    public String getIDJasa() {
        return idJasa;
    }

    public void setIDJasa(String IDJasa) {
        this.idJasa = IDJasa;
    }
    
    public String getNamaJasa() {
        return namaJasa;
    }

    public void setNamaJasa(String namaJasa) {
        this.namaJasa = namaJasa;
    }

    public String getDeskripsiJasa() {
        return deskripsiJasa;
    }

    public void setDeskripsiJasa(String deskripsiJasa) {
        this.deskripsiJasa = deskripsiJasa;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


}
