package com.nadasanders.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Juilee on 5/23/2017.
 */
@Entity
public class Speaking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String videoUrl;

    public Speaking() {
    }

    public Speaking(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    @Override
    public String toString() {
        return "Speaking{" +
                "id=" + id +
                ", videoUrl='" + videoUrl + '\'' +'}';
    }
}
