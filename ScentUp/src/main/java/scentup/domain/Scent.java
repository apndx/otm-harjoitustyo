/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scentup.domain;

import java.util.Objects;

/**
 *
 * @author hdheli
 */
public class Scent {

    private Integer scent_id;
    private String name;
    private String brand;
    private Integer timeOfDay; // 1 day, 2 night
    private Integer season;  // 1 winter, 2 spring, 3 summer, 4 autumn
    private Integer gender; // 1 female, 1 male, 3 uni

    public Scent(Integer scent_id, String scentName, String brand, Integer timeOfDay,
            Integer season, Integer gender) {

        this.scent_id = scent_id;
        this.name = name;
        this.brand = brand;
        this.timeOfDay = timeOfDay;
        this.season = season;
        this.gender = gender;
    }

    public Integer getScent_id() {
        return scent_id;
    }

    public void setScent_id(Integer scent_id) {
        this.scent_id = scent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(Integer timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.brand);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scent other = (Scent) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

}
