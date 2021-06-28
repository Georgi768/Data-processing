package com.example.Api.VideoGames;

import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity
@Table
public class Videogames {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String Countrywhereproduced;
    private String name;
    private String Platform;
    private Integer Year_of_Release;
    private String Genre;
    private String Publisher;
    private double NA_Sales;
    private double EU_Sales;
    private double JP_Sales;
    private double Other_Sales;
    private double Global_Sales;
    private Integer critic_score;
    private Integer critic_count;
    private Double user_score;
    private Integer user_Count;
    private String Developer;
    private String Rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountrywhereproduced() {
        return Countrywhereproduced;
    }

    public void setCountrywhereproduced(String countrywhereproduced) {
        Countrywhereproduced = countrywhereproduced;
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

    public Integer getYear_of_Release() {
        return Year_of_Release;
    }

    public void setYear_of_Release(Integer year_of_Release) {
        Year_of_Release = year_of_Release;
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

    public double getNA_Sales() {
        return NA_Sales;
    }

    public void setNA_Sales(double NA_Sales) {
        this.NA_Sales = NA_Sales;
    }

    public double getEU_Sales() {
        return EU_Sales;
    }

    public void setEU_Sales(double EU_Sales) {
        this.EU_Sales = EU_Sales;
    }

    public double getJP_Sales() {
        return JP_Sales;
    }

    public void setJP_Sales(double JP_Sales) {
        this.JP_Sales = JP_Sales;
    }

    public double getOther_Sales() {
        return Other_Sales;
    }

    public void setOther_Sales(double other_Sales) {
        Other_Sales = other_Sales;
    }

    public double getGlobal_Sales() {
        return Global_Sales;
    }

    public void setGlobal_Sales(double global_Sales) {
        Global_Sales = global_Sales;
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

    public Integer getUser_Count() {
        return user_Count;
    }

    public void setUser_Count(Integer user_Count) {
        this.user_Count = user_Count;
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

    public Videogames(String countrywhereproduced, String name, String platform, Integer year_of_Release, String genre, String publisher, double NA_Sales, double EU_Sales, double JP_Sales, double other_Sales, double global_Sales, Integer critic_score, Integer critic_count, Double user_score, Integer user_Count, String developer, String rating) {
        Countrywhereproduced = countrywhereproduced;
        this.name = name;
        Platform = platform;
        Year_of_Release = year_of_Release;
        Genre = genre;
        Publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        Other_Sales = other_Sales;
        Global_Sales = global_Sales;
        this.critic_score = critic_score;
        this.critic_count = critic_count;
        this.user_score = user_score;
        this.user_Count = user_Count;
        Developer = developer;
        Rating = rating;
    }
}