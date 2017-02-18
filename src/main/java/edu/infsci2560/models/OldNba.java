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

    private static final long serialVersionUID = 1L;

    public enum Player {
        Old_NBA_Stars,
        Kobe_Bryant_2016,
        Tracy_McGrady_2013,
        Allen_Iverson_2011,
        Shaquille_ONeal_2011,
        Michael_Jordan_2003,
        Hakeem_Olajuwon_2002,
        Charles_Barkley_2000,
        Magic_Johnson_1996,
        Wilt_Chamberlain_1973,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected Player player;

    public OldNba() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.player = Player.Old_NBA_Stars;
    }

    public OldNba(Long id, String name, Player playername) {
        this.id = id;
        this.title = name;
        this.player = playername;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", workoutType=" + this.player + " ]";
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
    public Player getPlayer() {
        return player;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setPlayer(Player workoutType) {
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

}