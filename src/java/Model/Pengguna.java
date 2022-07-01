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
@Table(name = "pengguna")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pengguna.findAll", query = "SELECT p FROM Pengguna p")
    , @NamedQuery(name = "Pengguna.findByUsername", query = "SELECT p FROM Pengguna p WHERE p.username = :username")
    , @NamedQuery(name = "Pengguna.findByNoHP", query = "SELECT p FROM Pengguna p WHERE p.noHP = :noHP")
    , @NamedQuery(name = "Pengguna.findByEmail", query = "SELECT p FROM Pengguna p WHERE p.email = :email")
    , @NamedQuery(name = "Pengguna.findByKataSandi", query = "SELECT p FROM Pengguna p WHERE p.kataSandi = :kataSandi")
    , @NamedQuery(name = "Pengguna.findByCreateDate", query = "SELECT p FROM Pengguna p WHERE p.createDate = :createDate")})
public class Pengguna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "noHP")
    private String noHP;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "alamatPengguna")
    private String alamatPengguna;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "kataSandi")
    private String kataSandi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    public Pengguna() {
    }

    public Pengguna(String username) {
        this.username = username;
    }

    public Pengguna(String username, String noHP, String alamatPengguna, String email, String kataSandi, Date createDate) {
        this.username = username;
        this.noHP = noHP;
        this.alamatPengguna = alamatPengguna;
        this.email = email;
        this.kataSandi = kataSandi;
        this.createDate = createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getAlamatPengguna() {
        return alamatPengguna;
    }

    public void setAlamatPengguna(String alamatPengguna) {
        this.alamatPengguna = alamatPengguna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengguna)) {
            return false;
        }
        Pengguna other = (Pengguna) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pengguna[ username=" + username + " ]";
    }
    
}
