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
public class SlamDunk {

    //private static final long serialVersionUID = 1L;

    public enum SlamDunkPlayer {
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
    protected SlamDunkPlayer slamDunkPlayer;
    @Column(length = 4096)
    protected String links;

    public SlamDunk() {
        this.id = Long.MAX_VALUE;
        this.slamDunkPlayer = SlamDunkPlayer.others;
        this.links = null;
    }

    public SlamDunk(Long id, SlamDunkPlayer slamDunkPlayer, String links) {
        this.id = id;
        this.slamDunkPlayer = slamDunkPlayer;
        this.links = links;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", SlamDunkPlayer=" + this.slamDunkPlayer + ", VideoLinks=" + this.links + " ]";
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
     * @return the slamDunkPlayer
     */
    public SlamDunkPlayer getSlamDunkPlayer() {
        return slamDunkPlayer;
    }

    /**
     * @param set the slamDunkPlayer
     */
    public void setSlamDunkPlayer(SlamDunkPlayer name) {
        this.slamDunkPlayer = name;
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