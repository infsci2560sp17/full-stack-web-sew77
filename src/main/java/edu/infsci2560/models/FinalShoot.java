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
public class FinalShoot {

    //private static final long serialVersionUID = 1L;

    public enum FinalShootPlayer {
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
    protected FinalShootPlayer finalShootPlayer;
    @Column(length = 4096)
    protected String links;

    public FinalShoot() {
        this.id = Long.MAX_VALUE;
        this.finalShootPlayer = FinalShootPlayer.others;
        this.links = null;
    }

    public FinalShoot(Long id, FinalShootPlayer finalShootPlayer, String links) {
        this.id = id;
        this.finalShootPlayer = finalShootPlayer;
        this.links = links;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", SlamDunkPlayer=" + this.finalShootPlayer + ", VideoLinks=" + this.links + " ]";
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
     * @return the finalShootPlayer
     */
    public FinalShootPlayer getFinalShootPlayer() {
        return finalShootPlayer;
    }

    /**
     * @param set the finalShootPlayer
     */
    public void setFinalShootPlayer(FinalShootPlayer name) {
        this.finalShootPlayer = name;
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