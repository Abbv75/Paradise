/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradise.objets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Younouss boré
 */
public class SQL_Outil {
    
    private String dbName;
    private String urlBDD;
    private String user ;
    private String passwd;
    public Connection conn;
    
    public SQL_Outil(String dbName_tmp){
        this.dbName=dbName_tmp;
        this.urlBDD= "jdbc:mysql://localhost:3306/"+this.dbName;
        this.user= "root";
        this.passwd = "";
    } 
    
    public boolean try_connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(urlBDD, user, passwd);
            System.out.println("Connexion reussi");
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Erreur de connexion");
            return false;
        }
        
    }
    
    public boolean delete_from_id(String tableName, int id){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(urlBDD, user, passwd);
            System.out.println("connexion reussi mec");
            String requete="DELETE FROM ? WHERE id = ?;";
            PreparedStatement state= conn.prepareStatement(requete);
            state.setString(1, tableName);
            state.setInt(2, id);
            int result=state.executeUpdate();
            JOptionPane.showMessageDialog(null, "Supprimer avec succes", "Supprimer reussi", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Erreur de connexion");
            return false;
        }
        
    }
    
    public boolean edit_from_id(String tableName, String[] key, String[] value, int id){
        String edit="UPDATE "+tableName+" SET ";
        if(value.length!=key.length){
            System.out.println("Exces de saisie ou de colonne");
            return false;
        }
        else{
            for(int i=0;i<key.length;i++){
                if(i!=value.length-1){
                    edit+=key[i]+"='"+value[i]+"', ";
                }
                else{
                    edit+=key[i]+"='"+value[i]+"' ";
                }
            }
            edit+="WHERE id="+id+";";
            System.out.println(edit);
            try{
                System.out.println("votre requete est: "+edit);
                PreparedStatement state= conn.prepareStatement(edit);
                int result=state.executeUpdate();

                System.out.println("equete OK");
                return true;
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Erreur de requette");
                return false;
            }
        }
    }
    public boolean insert_into(String tableName, String[] key, String[] value){
        String edit="INSERT INTO "+tableName+" ( ";
        if(value.length!=key.length){
            System.out.println("Exces de saisie ou de colonne");
            return false;
        }
        else{
            for(int i=0;i<key.length;i++){
                if(i!=value.length-1){
                    edit+=key[i]+", ";
                }
                else{
                    edit+=key[i]+") VALUES(";
                }
            }
            for(int i=0;i<key.length;i++){
                if(i!=value.length-1){
                    edit+="'"+value[i]+"', ";
                }
                else{
                    edit+="'"+value[i]+"');";
                }
            }
            System.out.println(edit);
            try{
                System.out.println("votre requete est: "+edit);
                PreparedStatement state= conn.prepareStatement(edit);
                int result=state.executeUpdate();

                System.out.println("equete OK");
                return true;
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Erreur de requette");
                return false;
            }
        }
    }
    
    public ResultSet simple_select(String tableName){
        String query="SELECT * FROM "+tableName+" ORDER BY id DESC;";
        Object resultat=new Object();
        try{
            PreparedStatement stm= conn.prepareStatement(query);
            resultat=(ResultSet)stm.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Erreur de connexion");
            resultat=null;
        }
        return (ResultSet)resultat;
    }
    
    public ResultSet select_from_id(String tableName, int id){
        String query="SELECT * FROM "+tableName+" WHERE id="+id+" ORDER BY id DESC;";
        Object resultat=new Object();
        try{
            PreparedStatement stm= conn.prepareStatement(query);
            resultat=(ResultSet)stm.executeQuery();
        }
        catch (Exception e){
            e.printStackTrace();
            resultat=null;
        }
        return (ResultSet)resultat;
    }
    
}
