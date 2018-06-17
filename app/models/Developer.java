package models;

import javax.persistence.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


//@NamedQueries({
//
//})


@Entity
@Table (name = "Developer")
@Inheritance(strategy = InheritanceType.JOINED)
public class Developer {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ceo")
    private String ceo;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("developers")
    private Set<Game> games;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }

    public void addGame(Game game){
        games.add(game);
    }

    public Developer (){
        games = new HashSet<Game>();
    }

    public Developer(Long id, String name, String ceo, Set<Game> games) {
        this.id = id;
        this.name = name;
        this.ceo = ceo;
        this.games = games;
    }
}