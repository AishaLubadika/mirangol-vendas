/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirangol.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LUBADIKA
 */
@Entity
@Table(name = "acesso_sistema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AcessoSistema.findAll", query = "SELECT a FROM AcessoSistema a")
    , @NamedQuery(name = "AcessoSistema.findByIdAcessoSistema", query = "SELECT a FROM AcessoSistema a WHERE a.idAcessoSistema = :idAcessoSistema")
    , @NamedQuery(name = "AcessoSistema.findByLogin", query = "SELECT a FROM AcessoSistema a WHERE a.login = :login")
    , @NamedQuery(name = "AcessoSistema.findByPassword", query = "SELECT a FROM AcessoSistema a WHERE a.password = :password")})
public class AcessoSistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_acesso_sistema")
    private Integer idAcessoSistema;
    @Size(max = 45)
    @Column(name = "login")
    private String login;
    @Size(max = 45)
    @Column(name = "password")
    private String password;

    public AcessoSistema() {
    }

    public AcessoSistema(Integer idAcessoSistema) {
        this.idAcessoSistema = idAcessoSistema;
    }

    public Integer getIdAcessoSistema() {
        return idAcessoSistema;
    }

    public void setIdAcessoSistema(Integer idAcessoSistema) {
        this.idAcessoSistema = idAcessoSistema;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcessoSistema != null ? idAcessoSistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcessoSistema)) {
            return false;
        }
        AcessoSistema other = (AcessoSistema) object;
        if ((this.idAcessoSistema == null && other.idAcessoSistema != null) || (this.idAcessoSistema != null && !this.idAcessoSistema.equals(other.idAcessoSistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mirangol.model.entities.AcessoSistema[ idAcessoSistema=" + idAcessoSistema + " ]";
    }
    
}
