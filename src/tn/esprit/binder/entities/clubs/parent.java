/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.binder.entities.clubs;

/**
 *
 * @author Sam
 */
public class parent {
    
    private String name;
    
    private int id;
    
    private String mail;
    
    private String phone;

    public parent() {
       
    }

    public parent(String name, String mail, String phone) {
         this.name = name;
       
        this.mail = mail;
        this.phone = phone;
    }

    /**
     * Get the value of phone
     *
     * @return the value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the value of phone
     *
     * @param phone new value of phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public parent(String name, int id, String mail, String phone) {
        this.name = name;
        this.id = id;
        this.mail = mail;
        this.phone = phone;
    }


    /**
     * Get the value of mail
     *
     * @return the value of mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Set the value of mail
     *
     * @param mail new value of mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }


    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "parent{" + "name=" + name + ", id=" + id + ", mail=" + mail + ", phone=" + phone + '}';
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
}
