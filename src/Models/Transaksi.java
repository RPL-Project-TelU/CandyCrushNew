package Models;

import java.time.LocalDate;

/*
 * @author macbookair@angga
 */
public class Transaksi {
    private String deskripsiCucian;
    String tglTransaksi;
    private int idTransaksi, idJasa,  totalBayar, beratCucian, ongkir;

    public Transaksi(int idTransaksi, int idJasa, int idDetailStatus, String deskripsiCucian, int beratCucian, int ongkir, int bayar, int totalBayar, String tglTransaksi) {
        this.idTransaksi = idTransaksi;
        this.deskripsiCucian = deskripsiCucian;
        this.beratCucian = beratCucian;
        this.ongkir = ongkir;
        this.totalBayar = totalBayar;
        this.tglTransaksi= tglTransaksi;
    }

    public Transaksi(){
        
    }
    
    public String getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(String tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(int idJasa) {
        this.idJasa = idJasa;
    }

    public String getDeskripsiCucian() {
        return deskripsiCucian;
    }

    public int getBeratCucian() {
        return beratCucian;
    }

    public int getOngkir() {
        return ongkir;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setDeskripsiCucian(String deskripsiCucian) {
        this.deskripsiCucian = deskripsiCucian;
    }

    public void setBeratCucian(int beratCucian) {
        this.beratCucian = beratCucian;
    }

    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }
}