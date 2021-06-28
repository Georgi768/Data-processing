package com.example.Api.Covid;

import javax.persistence.*;

@Entity
@Table
public class Covid19 {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String country;
    private int Confirmed;
    private int Deaths;
    private int Recovered;
    private int Active;
    private int New_cases;
    private int New_deaths;
    private int New_recovered;
    private double Deaths_100_cases;
    private double Recovered_100_cases;
    private double Deaths_100_Recovered;
    private int Confirmed_last_week;
    private int one_week_change;
    private double one_week_increase;
    private String WHORegion;


    public Covid19(String countryRegion, int confirmed, int deaths, int recovered, int active, int new_cases, int new_deaths, int new_recovered, double deaths_100_cases, double recovered_100_cases, double deaths_100_Recovered, int confirmed_last_week, int one_week_change, double one_week_increase, String WHORegion) {
        this.country = countryRegion;
        Confirmed = confirmed;
        Deaths = deaths;
        Recovered = recovered;
        Active = active;
        New_cases = new_cases;
        New_deaths = new_deaths;
        New_recovered = new_recovered;
        Deaths_100_cases = deaths_100_cases;
        Recovered_100_cases = recovered_100_cases;
        Deaths_100_Recovered = deaths_100_Recovered;
        Confirmed_last_week = confirmed_last_week;
        this.one_week_change = one_week_change;
        this.one_week_increase = one_week_increase;
        this.WHORegion = WHORegion;
    }

    public Covid19() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(int confirmed) {
        Confirmed = confirmed;
    }

    public int getDeaths() {
        return Deaths;
    }

    public void setDeaths(int deaths) {
        Deaths = deaths;
    }

    public int getRecovered() {
        return Recovered;
    }

    public void setRecovered(int recovered) {
        Recovered = recovered;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int active) {
        Active = active;
    }

    public int getNew_cases() {
        return New_cases;
    }

    public void setNew_cases(int new_cases) {
        New_cases = new_cases;
    }

    public int getNew_deaths() {
        return New_deaths;
    }

    public void setNew_deaths(int new_deaths) {
        New_deaths = new_deaths;
    }

    public int getNew_recovered() {
        return New_recovered;
    }

    public void setNew_recovered(int new_recovered) {
        New_recovered = new_recovered;
    }

    public double getDeaths_100_cases() {
        return Deaths_100_cases;
    }

    public void setDeaths_100_cases(double deaths_100_cases) {
        Deaths_100_cases = deaths_100_cases;
    }

    public double getRecovered_100_cases() {
        return Recovered_100_cases;
    }

    public void setRecovered_100_cases(double recovered_100_cases) {
        Recovered_100_cases = recovered_100_cases;
    }

    public double getDeaths_100_Recovered() {
        return Deaths_100_Recovered;
    }

    public void setDeaths_100_Recovered(double deaths_100_Recovered) {
        Deaths_100_Recovered = deaths_100_Recovered;
    }

    public int getConfirmed_last_week() {
        return Confirmed_last_week;
    }

    public void setConfirmed_last_week(int confirmed_last_week) {
        Confirmed_last_week = confirmed_last_week;
    }

    public int getOne_week_change() {
        return one_week_change;
    }

    public void setOne_week_change(int one_week_change) {
        this.one_week_change = one_week_change;
    }

    public double getOne_week_increase() {
        return one_week_increase;
    }

    public void setOne_week_increase(double one_week_increase) {
        this.one_week_increase = one_week_increase;
    }

    public String getWHORegion() {
        return WHORegion;
    }

    public void setWHORegion(String WHORegion) {
        this.WHORegion = WHORegion;
    }
}
