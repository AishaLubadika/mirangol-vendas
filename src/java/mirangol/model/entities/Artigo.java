/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirangol.model.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LUBADIKA
 */
@Entity
@Table(name = "artigo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artigo.findAll", query = "SELECT a FROM Artigo a")
    , @NamedQuery(name = "Artigo.findByIdArtigo", query = "SELECT a FROM Artigo a WHERE a.idArtigo = :idArtigo")
    , @NamedQuery(name = "Artigo.findByCodigoBarraArtigo", query = "SELECT a FROM Artigo a WHERE a.codigoBarraArtigo = :codigoBarraArtigo")
    , @NamedQuery(name = "Artigo.findByCodigoComercialArtigo", query = "SELECT a FROM Artigo a WHERE a.codigoComercialArtigo = :codigoComercialArtigo")
    , @NamedQuery(name = "Artigo.findByNomeArtigo", query = "SELECT a FROM Artigo a WHERE a.nomeArtigo = :nomeArtigo")
    , @NamedQuery(name = "Artigo.findByPrecoArtigo", query = "SELECT a FROM Artigo a WHERE a.precoArtigo = :precoArtigo")})
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_artigo")
    private Integer idArtigo;
    @Size(max = 45)
    @Column(name = "codigo_barra_artigo")
    private String codigoBarraArtigo;
    @Size(max = 45)
    @Column(name = "codigo_comercial_artigo")
    private String codigoComercialArtigo;
    @Size(max = 45)
    @Column(name = "nome_artigo")
    private String nomeArtigo;
    @Size(max = 45)
    @Column(name = "preco_artigo")
    private String precoArtigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArtigo")
    private Collection<ItensVenda> itensVendaCollection;
    @JoinColumn(name = "id_categoria_artigo", referencedColumnName = "id_categoria_artigo")
    @ManyToOne(optional = false)
    private CategoriaArtigo idCategoriaArtigo;

    public Artigo() {
    }

    public Artigo(Integer idArtigo) {
        this.idArtigo = idArtigo;
    }

    public Integer getIdArtigo() {
        return idArtigo;
    }

    public void setIdArtigo(Integer idArtigo) {
        this.idArtigo = idArtigo;
    }

    public String getCodigoBarraArtigo() {
        return codigoBarraArtigo;
    }

    public void setCodigoBarraArtigo(String codigoBarraArtigo) {
        this.codigoBarraArtigo = codigoBarraArtigo;
    }

    public String getCodigoComercialArtigo() {
        return codigoComercialArtigo;
    }

    public void setCodigoComercialArtigo(String codigoComercialArtigo) {
        this.codigoComercialArtigo = codigoComercialArtigo;
    }

    public String getNomeArtigo() {
        return nomeArtigo;
    }

    public void setNomeArtigo(String nomeArtigo) {
        this.nomeArtigo = nomeArtigo;
    }

    public String getPrecoArtigo() {
        return precoArtigo;
    }

    public void setPrecoArtigo(String precoArtigo) {
        this.precoArtigo = precoArtigo;
    }

    @XmlTransient
    public Collection<ItensVenda> getItensVendaCollection() {
        return itensVendaCollection;
    }

    public void setItensVendaCollection(Collection<ItensVenda> itensVendaCollection) {
        this.itensVendaCollection = itensVendaCollection;
    }

    public CategoriaArtigo getIdCategoriaArtigo() {
        return idCategoriaArtigo;
    }

    public void setIdCategoriaArtigo(CategoriaArtigo idCategoriaArtigo) {
        this.idCategoriaArtigo = idCategoriaArtigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArtigo != null ? idArtigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artigo)) {
            return false;
        }
        Artigo other = (Artigo) object;
        if ((this.idArtigo == null && other.idArtigo != null) || (this.idArtigo != null && !this.idArtigo.equals(other.idArtigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mirangol.model.entities.Artigo[ idArtigo=" + idArtigo + " ]";
    }
    
}
