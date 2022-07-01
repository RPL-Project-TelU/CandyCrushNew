/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "jasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jasa.findAll", query = "SELECT j FROM Jasa j")
    , @NamedQuery(name = "Jasa.findByIdJasa", query = "SELECT j FROM Jasa j WHERE j.idJasa = :idJasa")
    , @NamedQuery(name = "Jasa.findByNamaJasa", query = "SELECT j FROM Jasa j WHERE j.namaJasa = :namaJasa")
    , @NamedQuery(name = "Jasa.findByHarga", query = "SELECT j FROM Jasa j WHERE j.harga = :harga")})
public class Jasa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idJasa")
    private Integer idJasa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "namaJasa")
    private String namaJasa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "deskripsiJasa")
    private String deskripsiJasa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "harga")
    private int harga;

    public Jasa() {
    }

    public Jasa(Integer idJasa) {
        this.idJasa = idJasa;
    }

    public Jasa(Integer idJasa, String namaJasa, String deskripsiJasa, int harga) {
        this.idJasa = idJasa;
        this.namaJasa = namaJasa;
        this.deskripsiJasa = deskripsiJasa;
        this.harga = harga;
    }

    public Integer getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(Integer idJasa) {
        this.idJasa = idJasa;
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

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJasa != null ? idJasa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jasa)) {
            return false;
        }
        Jasa other = (Jasa) object;
        if ((this.idJasa == null && other.idJasa != null) || (this.idJasa != null && !this.idJasa.equals(other.idJasa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Jasa[ idJasa=" + idJasa + " ]";
    }
    
}
