package models;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

@NamedQueries({
        @NamedQuery(
                name = "Review.TopSix",
                query = "select r from Review as r order by r.id desc"
        ),
        @NamedQuery(
                name = "Review.FindById",
                query = "select r from Review as r where r.id = :id"
        ),
        @NamedQuery(
                name = "Review.GetByDeveloper",
                query = "select r from Review r " +
                        "join r.game g " +
                        "join g.developers d where d.id = :id"
        )
})

@Entity
@Table (name = "Review")
public class Review {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("reviews")
    private Game game;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @Column(name = "reviewText")
    private String reviewText;

    @Column(name = "score")
    private int score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Review (){ }

    public Review(Long id, Game game, User user, String reviewText, int score) {
        this.id = id;
        this.game = game;
        this.user = user;
        this.reviewText = reviewText;
        this.score = score;
    }
}