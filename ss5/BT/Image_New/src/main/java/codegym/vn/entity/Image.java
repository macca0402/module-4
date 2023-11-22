package codegym.vn.entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue
    private int id;
    private int point;
    @Column(name = "author", columnDefinition = "varchar(50)")
    private String author;
    @Column(name = "feeback", columnDefinition = "varchar(50)")
    private String feedback;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Image(int id, int point, String author, String feedback) {
        this.id = id;
        this.point = point;
        this.author = author;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Image() {
    }

    public Image(int id, String author, String feedback) {
        this.id = id;
        this.author = author;
        this.feedback = feedback;
    }
}
