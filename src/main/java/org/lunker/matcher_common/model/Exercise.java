package org.lunker.matcher_common.model;

import javax.persistence.*;

/**
 * Created by dongqlee on 2018. 2. 16..
 */
@Entity
@Table
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int maxParticipant;

    public Exercise() {
    }

    public Exercise(String name, int maxParticipant) {
        this.name = name;
        this.maxParticipant = maxParticipant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxParticipant() {
        return maxParticipant;
    }

    public void setMaxParticipant(int maxParticipant) {
        this.maxParticipant = maxParticipant;
    }
}
