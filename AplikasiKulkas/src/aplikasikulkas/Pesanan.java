/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikulkas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aziizah Oki Shofrina
 */
@Entity
@Table(name = "pesanan")
@NamedQueries({
    @NamedQuery(name = "Pesanan.findAll", query = "SELECT p FROM Pesanan p"),
    @NamedQuery(name = "Pesanan.findById", query = "SELECT p FROM Pesanan p WHERE p.id = :id"),
    @NamedQuery(name = "Pesanan.findByTglPesanan", query = "SELECT p FROM Pesanan p WHERE p.tglPesanan = :tglPesanan"),
    @NamedQuery(name = "Pesanan.findByJumlah", query = "SELECT p FROM Pesanan p WHERE p.jumlah = :jumlah"),
    @NamedQuery(name = "Pesanan.findByTotalPembayaran", query = "SELECT p FROM Pesanan p WHERE p.totalPembayaran = :totalPembayaran"),
    @NamedQuery(name = "Pesanan.findByNamaPenerima", query = "SELECT p FROM Pesanan p WHERE p.namaPenerima = :namaPenerima"),
    @NamedQuery(name = "Pesanan.findByAlamat", query = "SELECT p FROM Pesanan p WHERE p.alamat = :alamat"),
    @NamedQuery(name = "Pesanan.findByStatus", query = "SELECT p FROM Pesanan p WHERE p.status = :status")})
public class Pesanan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "tgl_pesanan")
    @Temporal(TemporalType.DATE)
    private Date tglPesanan;
    @Basic(optional = false)
    @Column(name = "jumlah")
    private int jumlah;
    @Basic(optional = false)
    @Column(name = "total_pembayaran")
    private int totalPembayaran;
    @Basic(optional = false)
    @Column(name = "nama_penerima")
    private String namaPenerima;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Customer username;
    @JoinColumn(name = "id_kulkas", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Kulkas idKulkas;

    public Pesanan() {
    }

    public Pesanan(String id) {
        this.id = id;
    }

    public Pesanan(String id, Date tglPesanan, int jumlah, int totalPembayaran, String namaPenerima, String alamat, String status) {
        this.id = id;
        this.tglPesanan = tglPesanan;
        this.jumlah = jumlah;
        this.totalPembayaran = totalPembayaran;
        this.namaPenerima = namaPenerima;
        this.alamat = alamat;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTglPesanan() {
        return tglPesanan;
    }

    public void setTglPesanan(Date tglPesanan) {
        this.tglPesanan = tglPesanan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(int totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getUsername() {
        return username;
    }

    public void setUsername(Customer username) {
        this.username = username;
    }

    public Kulkas getIdKulkas() {
        return idKulkas;
    }

    public void setIdKulkas(Kulkas idKulkas) {
        this.idKulkas = idKulkas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesanan)) {
            return false;
        }
        Pesanan other = (Pesanan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasikulkas.Pesanan[ id=" + id + " ]";
    }
    
}
