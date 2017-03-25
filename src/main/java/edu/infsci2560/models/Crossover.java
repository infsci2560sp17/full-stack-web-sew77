package edu.infsci2560.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class Crossover {

    //private static final long serialVersionUID = 1L;

    public enum CrossoverPlayer {
        Kobe_Bryant_2016,
        Tracy_McGrady_2013,
        Allen_Iverson_2011,
        Shaquille_ONeal_2011,
        Michael_Jordan_2003,
        Hakeem_Olajuwon_2002,
        Charles_Barkley_2000,
        Magic_Johnson_1996,
        Wilt_Chamberlain_1973,
        others,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected CrossoverPlayer crossoverPlayer;
    @Column(length = 4096)
    protected String links;

    public Crossover() {
        this.id = Long.MAX_VALUE;
        this.crossoverPlayer = CrossoverPlayer.others;
        this.links = null;
    }

    public Crossover(Long id, CrossoverPlayer crossoverPlayer, String links) {
        this.id = id;
        this.crossoverPlayer = crossoverPlayer;
        this.links = links;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", SlamDunkPlayer=" + this.crossoverPlayer + ", VideoLinks=" + this.links + " ]";
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
     * @return the crossoverPlayer
     */
    public CrossoverPlayer getCrossoverPlayer() {
        return crossoverPlayer;
    }

    /**
     * @param set the crossoverPlayer
     */
    public void setCrossoverPlayer(CrossoverPlayer name) {
        this.crossoverPlayer = name;
    }

    /**
     * @return the links
     */
    public String getLinks() {
        return links;
    }

    /**
     * @param set the links
     */
    public void setLinks(String links) {
        this.links = links;
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