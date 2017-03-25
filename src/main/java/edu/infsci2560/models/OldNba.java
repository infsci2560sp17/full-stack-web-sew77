/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class OldNba {

   // private static final long serialVersionUID = 1L;
/*
   public enum Player {
    
    }
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected String player;
    protected String links;

    public OldNba() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.player = null;
        this.links = null;
    }

    public OldNba(Long id, String type, String playername, String links) {
        this.id = id;
        this.title = type;
        this.player = playername;
        this.links = links;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", workoutType=" + this.player +", URL Link="+this.links + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the workoutType
     */
    public String getPlayer() {
        return player;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setPlayer(String workoutType) {
        this.player = workoutType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
     /**
     * @param links the links to set
     */
    public void setLinks(String links) {
        this.links = links;
    }
    
     /**
     * @return the links
     */
    public String getLinks() {
        return links;
    }

}