package org.lunker.matcher_common.model;

import javax.persistence.*;

/**
 * Created by dongqlee on 2018. 2. 4..
 */
@Entity
@Table
@SequenceGenerator(name = "GU_SEQ_GEN", initialValue = 1, allocationSize = 1)
public class Gu {

    /*
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GU_SEQ_GEN")
    private int id;
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "gu_code")
    private String guCode;


    @Column(name = "coo_x")
    private double cooX;

    @Column(name = "coo_y")
    private double cooY;

    public Gu() {

    }

    public Gu(String cityCode, String guCode) {
        this.cityCode = cityCode;
        this.guCode = guCode;
    }

    public Gu(String cityCode, String guCode, double cooX, double cooY) {
        this.cityCode = cityCode;
        this.guCode = guCode;
        this.cooX = cooX;
        this.cooY = cooY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getGuCode() {
        return guCode;
    }

    public void setGuCode(String guCode) {
        this.guCode = guCode;
    }

    public double getCooX() {
        return cooX;
    }

    public void setCooX(double cooX) {
        this.cooX = cooX;
    }

    public double getCooY() {
        return cooY;
    }

    public void setCooY(double cooY) {
        this.cooY = cooY;
    }
}
