package hibernate.entities;
// Generated 19 oct. 2017 14:39:04 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Ventes generated by hbm2java
 */
public class Ventes  implements java.io.Serializable {


     private VentesId id;
     private Vendeurs vendeurs;
     private Date dateVente;

    public Ventes() {
    }

	
    public Ventes(VentesId id, Vendeurs vendeurs) {
        this.id = id;
        this.vendeurs = vendeurs;
    }
    public Ventes(VentesId id, Vendeurs vendeurs, Date dateVente) {
       this.id = id;
       this.vendeurs = vendeurs;
       this.dateVente = dateVente;
    }
   
    public VentesId getId() {
        return this.id;
    }
    
    public void setId(VentesId id) {
        this.id = id;
    }
    public Vendeurs getVendeurs() {
        return this.vendeurs;
    }
    
    public void setVendeurs(Vendeurs vendeurs) {
        this.vendeurs = vendeurs;
    }
    public Date getDateVente() {
        return this.dateVente;
    }
    
    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }




}


