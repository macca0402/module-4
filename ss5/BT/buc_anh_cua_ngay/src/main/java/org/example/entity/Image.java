package org.example.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "image_id")
    private int id;
    private int point;
    @Column(columnDefinition = "varchar(50)")
    private String author;
    private String feedback;
    @OneToMany(mappedBy = "image")
    private List<Star> starListStar;

    public List<Star> getStarListStar() {
        return starListStar;
    }

    public void setStarListStar(List<Star> starListStar) {
        this.starListStar = starListStar;
    }

    public Image(int id, int point, String author, String feedback, List<Star> starListStar) {
        this.id = id;
        this.point = point;
        this.author = author;
        this.feedback = feedback;
        this.starListStar = starListStar;
    }

    public Image() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Image(int point, String author, String feedback, List<Star> starListStar) {
        this.point = point;
        this.author = author;
        this.feedback = feedback;
        this.starListStar = starListStar;
    }
}
