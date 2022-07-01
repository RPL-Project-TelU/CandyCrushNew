/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "transaksi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t")
    , @NamedQuery(name = "Transaksi.findByIdTransaksi", query = "SELECT t FROM Transaksi t WHERE t.idTransaksi = :idTransaksi")
    , @NamedQuery(name = "Transaksi.findByIdJasa", query = "SELECT t FROM Transaksi t WHERE t.idJasa = :idJasa")
    , @NamedQuery(name = "Transaksi.findByBerat", query = "SELECT t FROM Transaksi t WHERE t.berat = :berat")
    , @NamedQuery(name = "Transaksi.findByOngkir", query = "SELECT t FROM Transaksi t WHERE t.ongkir = :ongkir")
    , @NamedQuery(name = "Transaksi.findByTotalBayar", query = "SELECT t FROM Transaksi t WHERE t.totalBayar = :totalBayar")
    , @NamedQuery(name = "Transaksi.findByTglTransaksi", query = "SELECT t FROM Transaksi t WHERE t.tglTransaksi = :tglTransaksi")})
public class Transaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTransaksi")
    private Integer idTransaksi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idJasa")
    private int idJasa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "deskripsiTransaksi")
    private String deskripsiTransaksi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "berat")
    private int berat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ongkir")
    private int ongkir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "totalBayar")
    private String totalBayar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tgl_transaksi")
    @Temporal(TemporalType.DATE)
    private Date tglTransaksi;

    public Transaksi() {
    }

    public Transaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Transaksi(Integer idTransaksi, int idJasa, String deskripsiTransaksi, int berat, int ongkir, String totalBayar, Date tglTransaksi) {
        this.idTransaksi = idTransaksi;
        this.idJasa = idJasa;
        this.deskripsiTransaksi = deskripsiTransaksi;
        this.berat = berat;
        this.ongkir = ongkir;
        this.totalBayar = totalBayar;
        this.tglTransaksi = tglTransaksi;
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(int idJasa) {
        this.idJasa = idJasa;
    }

    public String getDeskripsiTransaksi() {
        return deskripsiTransaksi;
    }

    public void setDeskripsiTransaksi(String deskripsiTransaksi) {
        this.deskripsiTransaksi = deskripsiTransaksi;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getOngkir() {
        return ongkir;
    }

    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }

    public String getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaksi != null ? idTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.idTransaksi == null && other.idTransaksi != null) || (this.idTransaksi != null && !this.idTransaksi.equals(other.idTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Transaksi[ idTransaksi=" + idTransaksi + " ]";
    }
    
}
