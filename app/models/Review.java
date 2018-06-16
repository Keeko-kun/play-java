package models;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

@NamedQueries(
        @NamedQuery(
                name = "Review.TopSix",
                query = "select r from Review as r order by r.id desc"
        )
)

@Entity
@Table (name = "Review")
public class Review {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("reviews")
    private Game game;

    @ManyToOne
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