/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricar
 */
public class User {

     private String mail;
     private String pass;
     private String name;
     private List<Error> errors;

    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

 
    public void setPass(String pass) {
        this.pass = pass;
    }

   
    public User(String mail, String pass, String name) {
        this.mail = mail;
        this.pass = pass;
        this.name = name;
        errors = new ArrayList<Error>();
    }
    
    public User(String mail, String pass) {
        this.mail = mail;
        this.pass = pass;
        
        
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void addError(Error error)
    {
     errors.add(error);
     
    }
    
    public boolean errorExist()
    {
      return !errors.isEmpty();
    }

    public List<Error> getErrors() {
        return errors;
    }
    
    
    

    
}
