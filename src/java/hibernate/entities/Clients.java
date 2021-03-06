package hibernate.entities;
// Generated 19 oct. 2017 14:39:04 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clients generated by hbm2java
 */
public class Clients  implements java.io.Serializable {


     private Integer idClient;
     private Villes villes;
     private String nom;
     private String prenom;
     private String adresse;
     private Date dateNaissance;
     private Set cdeses = new HashSet(0);

    public Clients() {
    }

	
    public Clients(Villes villes, String nom) {
        this.villes = villes;
        this.nom = nom;
    }
    public Clients(Villes villes, String nom, String prenom, String adresse, Date dateNaissance, Set cdeses) {
       this.villes = villes;
       this.nom = nom;
       this.prenom = prenom;
       this.adresse = adresse;
       this.dateNaissance = dateNaissance;
       this.cdeses = cdeses;
    }
   
    public Integer getIdClient() {
        return this.idClient;
    }
    
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    public Villes getVilles() {
        return this.villes;
    }
    
    public void setVilles(Villes villes) {
        this.villes = villes;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Set getCdeses() {
        return this.cdeses;
    }
    
    public void setCdeses(Set cdeses) {
        this.cdeses = cdeses;
    }




}


