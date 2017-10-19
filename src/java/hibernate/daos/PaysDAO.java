/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.daos;

import cours.hibernate.util.HibernateUtil;
import hibernate.entities.Pays;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author formation
 */
public class PaysDAO {
    // -------------
    // --- ATTRIBUTS
    // -------------

    Session sessionH = null;

    // ------------
    // --- METHODES
    // ------------
    // -------------
    public PaysDAO() {
        this.sessionH = HibernateUtil.getSessionFactory().openSession();
    }

    // --- Renvoie la liste des pays
    public List<Pays> getPays() {
        List<Pays> paysListe = null;

        try {
            Query q = this.sessionH.createQuery("from Pays ORDER BY idPays");
//            Query q = this.sessionH.createQuery("from Pays ORDER BY id_pays");
            paysListe = q.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return paysListe;
    } /// getPays (Tous)

    // --- Renvoie un pays
    public Pays getPays(String asID) {
        Pays pays = null;

        try {
            Query q = this.sessionH.createQuery("from Pays WHERE idPays=?");
            q.setString(0, asID);
            pays = (Pays) q.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        return pays;
    } /// getPays (Un)

    // -----------------------------
    public String inserer(Pays pays) {
        String lsMessage;
        org.hibernate.Transaction tx = sessionH.beginTransaction();

        try {
            sessionH.save(pays);
            tx.commit();
            lsMessage = "Insertion OK";
        } catch (HibernateException e) {
            tx.rollback();
            lsMessage = e.getMessage();
        }

        return lsMessage;
    } /// ajouter

    // -------------------------------
    public String supprimer(Pays pays) {
        String lsMessage;
        org.hibernate.Transaction tx = sessionH.beginTransaction();

        try {
            sessionH.delete(pays);
            tx.commit();
            lsMessage = "Suppression OK";
        } catch (HibernateException e) {
            tx.rollback();
            lsMessage = e.getMessage();
        }

        return lsMessage;
    } /// supprimer

    // -------------------
    public String modifier(Pays pays) {

        String lsMessage;
        org.hibernate.Transaction tx = sessionH.beginTransaction();

        try {
            sessionH.update(pays);
            tx.commit();
            lsMessage = "Modification OK";
        } catch (HibernateException e) {
            tx.rollback();
            lsMessage = "Erreur modification : " + e.getMessage();
        }
        return lsMessage;
    } /// modifier

    // ----------------------
    public void fermerSession() {
        try {
            this.sessionH.close();
//         this.sessionH.clear();
        } catch (HibernateException e) {
        }
    } /// fermerSession

    // -------------------------
    public List getAttributsBean(Object objet) {

        Pays pays = (Pays) objet;
        List listeColonnes = new ArrayList();
        Field[] tProprietes = pays.getClass().getDeclaredFields();

        for (int i = 0; i < tProprietes.length; i++) {
            listeColonnes.add(tProprietes[i].getName());
        }
        return listeColonnes;

    } /// getAttributsBean

}
