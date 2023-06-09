/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikulkas;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aziizah Oki Shofrina
 */
@Entity
@Table(name = "kulkas")
@NamedQueries({
    @NamedQuery(name = "Kulkas.findAll", query = "SELECT k FROM Kulkas k"),
    @NamedQuery(name = "Kulkas.findById", query = "SELECT k FROM Kulkas k WHERE k.id = :id"),
    @NamedQuery(name = "Kulkas.findByTglRilis", query = "SELECT k FROM Kulkas k WHERE k.tglRilis = :tglRilis"),
    @NamedQuery(name = "Kulkas.findByNama", query = "SELECT k FROM Kulkas k WHERE k.nama = :nama"),
    @NamedQuery(name = "Kulkas.findByHarga", query = "SELECT k FROM Kulkas k WHERE k.harga = :harga"),
    @NamedQuery(name = "Kulkas.findByMerk", query = "SELECT k FROM Kulkas k WHERE k.merk = :merk"),
    @NamedQuery(name = "Kulkas.findByTipe", query = "SELECT k FROM Kulkas k WHERE k.tipe = :tipe"),
    @NamedQuery(name = "Kulkas.findByWarna", query = "SELECT k FROM Kulkas k WHERE k.warna = :warna"),
    @NamedQuery(name = "Kulkas.findByDeskripsi", query = "SELECT k FROM Kulkas k WHERE k.deskripsi = :deskripsi"),
    @NamedQuery(name = "Kulkas.findByPanjang", query = "SELECT k FROM Kulkas k WHERE k.panjang = :panjang"),
    @NamedQuery(name = "Kulkas.findByLebar", query = "SELECT k FROM Kulkas k WHERE k.lebar = :lebar"),
    @NamedQuery(name = "Kulkas.findByTinggi", query = "SELECT k FROM Kulkas k WHERE k.tinggi = :tinggi"),
    @NamedQuery(name = "Kulkas.findByKapasitas", query = "SELECT k FROM Kulkas k WHERE k.kapasitas = :kapasitas"),
    @NamedQuery(name = "Kulkas.findByStok", query = "SELECT k FROM Kulkas k WHERE k.stok = :stok")})
public class Kulkas implements Serializable {

    @Basic(optional = false)
    @Lob
    @Column(name = "gambar")
    private byte[] gambar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKulkas")
    private Collection<Pesanan> pesananCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tgl_rilis")
    @Temporal(TemporalType.DATE)
    private Date tglRilis;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;
    @Basic(optional = false)
    @Column(name = "merk")
    private String merk;
    @Basic(optional = false)
    @Column(name = "tipe")
    private String tipe;
    @Basic(optional = false)
    @Column(name = "warna")
    private String warna;
    @Basic(optional = false)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @Column(name = "panjang")
    private int panjang;
    @Basic(optional = false)
    @Column(name = "lebar")
    private int lebar;
    @Basic(optional = false)
    @Column(name = "tinggi")
    private int tinggi;
    @Basic(optional = false)
    @Column(name = "kapasitas")
    private int kapasitas;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;

    public Kulkas() {
    }

    public Kulkas(Integer id) {
        this.id = id;
    }

    public Kulkas(Integer id, Date tglRilis, String nama, int harga, String merk, String tipe, String warna, String deskripsi, int panjang, int lebar, int tinggi, int kapasitas, int stok, byte[] gambar) {
        this.id = id;
        this.tglRilis = tglRilis;
        this.nama = nama;
        this.harga = harga;
        this.merk = merk;
        this.tipe = tipe;
        this.warna = warna;
        this.deskripsi = deskripsi;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        this.stok = stok;
        this.gambar = gambar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTglRilis() {
        return tglRilis;
    }

    public void setTglRilis(Date tglRilis) {
        this.tglRilis = tglRilis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
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
        if (!(object instanceof Kulkas)) {
            return false;
        }
        Kulkas other = (Kulkas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasikulkas.Kulkas[ id=" + id + " ]";
    }


    public Collection<Pesanan> getPesananCollection() {
        return pesananCollection;
    }

    public void setPesananCollection(Collection<Pesanan> pesananCollection) {
        this.pesananCollection = pesananCollection;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }
    
}
