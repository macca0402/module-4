package org.example.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "star")
public class Star {
    @Id
    private int id;
    private int countStar;
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountStar() {
        return countStar;
    }

    public void setCountStar(int countStar) {
        this.countStar = countStar;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Star() {
    }

    public Star(int id, int countStar, Image image) {
        this.id = id;
        this.countStar = countStar;
        this.image = image;
    }
}
