package org.lunker.matcher_common.model;

import org.json.JSONObject;

import javax.persistence.*;

/**
 * Created by dongqlee on 2018. 2. 11..
 */

@Entity
@Table
@SequenceGenerator(name = "CITY_SEQ_GEN", initialValue = 1, allocationSize = 1)
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city_code")
    private String cityCode;

    @Column(name = "city_name")
    private String cityName;


    public City() {
    }


    public City(String cityCode, String cityName) {
        this.cityCode = cityCode;
        this.cityName = cityName;
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public static City serialize(JSONObject object){
        City city=new City();
        city.setCityCode(object.getString(OAConstants.CITY_CODE));
        city.setCityName(object.getString(OAConstants.CITY_NAME));

        return city;
    }
}
