/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradise.objets;

/**
 *
 * @author Younouss boré
 */
public class Patient{
    public int id;
    public String nom;
    public String prenom;
    public String date;
    public String genre;
    public String motif;
    public String numero_ticket;
    public Patient(int _id, String _nom, String _prenom, String _date, String _genre , String _motif, String _numero_ticket){
        this.id=_id;
        this.nom=_nom;
        this.prenom=_prenom;
        this.date=_date;
        this.motif=_motif;
        this.numero_ticket=_numero_ticket;
        this.genre=_genre;
    }
    
}
