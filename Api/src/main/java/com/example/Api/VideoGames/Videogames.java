package com.example.Api.VideoGames;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table
public class Videogames {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String countrywhereproduced;
    private String name;
    private String Platform;
    private Integer yearofrelease;
    private String Genre;
    private String Publisher;
    private double na_sales;
    private double eu_sales;
    private double jp_sales;
    private double other_sales;
    private double global_sales;
    private Integer critic_score;
    private Integer critic_count;
    private Double user_score;
    private Integer usercount;
    private String Developer;
    private String Rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountrywhereproduced() {
        return countrywhereproduced;
    }

    public void setCountrywhereproduced(String countrywhereproduced) {
        this.countrywhereproduced = countrywhereproduced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public Integer getYearofrelease() {
        return yearofrelease;
    }

    public void setYearofrelease(Integer yearofrelease) {
        this.yearofrelease = yearofrelease;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public double getNa_sales() {
        return na_sales;
    }

    public void setNa_sales(double na_sales) {
        this.na_sales = na_sales;
    }

    public double getEu_sales() {
        return eu_sales;
    }

    public void setEu_sales(double eu_sales) {
        this.eu_sales = eu_sales;
    }

    public double getJp_sales() {
        return jp_sales;
    }

    public void setJp_sales(double jp_sales) {
        this.jp_sales = jp_sales;
    }

    public double getOther_sales() {
        return other_sales;
    }

    public void setOther_sales(double other_sales) {
        this.other_sales = other_sales;
    }

    public double getGlobal_sales() {
        return global_sales;
    }

    public void setGlobal_sales(double global_sales) {
        this.global_sales = global_sales;
    }

    public Integer getCritic_score() {
        return critic_score;
    }

    public void setCritic_score(Integer critic_score) {
        this.critic_score = critic_score;
    }

    public Integer getCritic_count() {
        return critic_count;
    }

    public void setCritic_count(Integer critic_count) {
        this.critic_count = critic_count;
    }

    public Double getUser_score() {
        return user_score;
    }

    public void setUser_score(Double user_score) {
        this.user_score = user_score;
    }

    public Integer getUsercount() {
        return usercount;
    }

    public void setUsercount(Integer usercount) {
        this.usercount = usercount;
    }

    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public Videogames() {
    }

    public Videogames(String countrywhereproduced, String name, String platform, Integer yearofrelease, String genre, String publisher, double na_sales, double eu_sales, double jp_sales, double othersales, double globalsales, Integer critic_score, Integer critic_count, Double user_score, Integer usercount, String developer, String rating) {
        this.countrywhereproduced = countrywhereproduced;
        this.name = name;
        Platform = platform;
        this.yearofrelease = yearofrelease;
        Genre = genre;
        Publisher = publisher;
        this.na_sales = na_sales;
        this.eu_sales = eu_sales;
        this.jp_sales = jp_sales;
        other_sales = othersales;
        global_sales = globalsales;
        this.critic_score = critic_score;
        this.critic_count = critic_count;
        this.user_score = user_score;
        this.usercount = usercount;
        Developer = developer;
        Rating = rating;
    }
}