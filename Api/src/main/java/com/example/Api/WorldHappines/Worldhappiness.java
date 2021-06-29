package com.example.Api.WorldHappines;

import javax.persistence.*;

@Entity
@Table
public class Worldhappiness {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String country;
    private String region;
    private Integer happiness_rank;
    private double happiness_score;
    private double lower_confidence_interval;
    private double upper_confidence_interval;
    private double economy_gdp_per_capita;
    private double family;
    private double health_life_expectancy;
    private double freedom;
    private double trust_government_corruption;
    private double generosity;
    private double dystopia_residual;

    public Worldhappiness() {
    }

    public Worldhappiness(Long id, String country, String region, Integer happiness_rank, double happiness_score, double lower_confidence_interval, double upper_confidence_interval, double economy_gdp_per_capita, double family, double health_life_expectancy, double freedom, double trust_government_corruption, double generosity, double dystopia_residual) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.happiness_rank = happiness_rank;
        this.happiness_score = happiness_score;
        this.lower_confidence_interval = lower_confidence_interval;
        this.upper_confidence_interval = upper_confidence_interval;
        this.economy_gdp_per_capita = economy_gdp_per_capita;
        this.family = family;
        this.health_life_expectancy = health_life_expectancy;
        this.freedom = freedom;
        this.trust_government_corruption = trust_government_corruption;
        this.generosity = generosity;
        this.dystopia_residual = dystopia_residual;
    }

    public Worldhappiness(String country, String region, Integer happiness_rank, double happiness_score, double lower_confidence_interval, double upper_confidence_interval, double economy_gdp_per_capita, double family, double health_life_expectancy, double freedom, double trust_government_corruption, double generosity, double dystopia_residual) {
        this.country = country;
        this.region = region;
        this.happiness_rank = happiness_rank;
        this.happiness_score = happiness_score;
        this.lower_confidence_interval = lower_confidence_interval;
        this.upper_confidence_interval = upper_confidence_interval;
        this.economy_gdp_per_capita = economy_gdp_per_capita;
        this.family = family;
        this.health_life_expectancy = health_life_expectancy;
        this.freedom = freedom;
        this.trust_government_corruption = trust_government_corruption;
        this.generosity = generosity;
        this.dystopia_residual = dystopia_residual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getHappiness_rank() {
        return happiness_rank;
    }

    public void setHappiness_rank(Integer happiness_rank) {
        this.happiness_rank = happiness_rank;
    }

    public double getHappiness_score() {
        return happiness_score;
    }

    public void setHappiness_score(double happiness_score) {
        this.happiness_score = happiness_score;
    }

    public double getLower_confidence_interval() {
        return lower_confidence_interval;
    }

    public void setLower_confidence_interval(double lower_confidence_interval) {
        this.lower_confidence_interval = lower_confidence_interval;
    }

    public double getUpper_confidence_interval() {
        return upper_confidence_interval;
    }

    public void setUpper_confidence_interval(double upper_confidence_interval) {
        this.upper_confidence_interval = upper_confidence_interval;
    }

    public double getEconomy_gdp_per_capita() {
        return economy_gdp_per_capita;
    }

    public void setEconomy_gdp_per_capita(double economy_gdp_per_capita) {
        this.economy_gdp_per_capita = economy_gdp_per_capita;
    }

    public double getFamily() {
        return family;
    }

    public void setFamily(double family) {
        this.family = family;
    }

    public double getHealth_life_expectancy() {
        return health_life_expectancy;
    }

    public void setHealth_life_expectancy(double health_life_expectancy) {
        this.health_life_expectancy = health_life_expectancy;
    }

    public double getFreedom() {
        return freedom;
    }

    public void setFreedom(double freedom) {
        this.freedom = freedom;
    }

    public double getTrust_government_corruption() {
        return trust_government_corruption;
    }

    public void setTrust_government_corruption(double trust_government_corruption) {
        this.trust_government_corruption = trust_government_corruption;
    }

    public double getGenerosity() {
        return generosity;
    }

    public void setGenerosity(double generosity) {
        this.generosity = generosity;
    }

    public double getDystopia_residual() {
        return dystopia_residual;
    }

    public void setDystopia_residual(double dystopia_residual) {
        this.dystopia_residual = dystopia_residual;
    }
}
