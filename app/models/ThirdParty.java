package models;

import javax.persistence.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;


//@NamedQueries({
//
//})


@Entity
@Table (name = "ThirdParty")
public class ThirdParty extends Developer {

    @Column(name = "indieStudio")
    private boolean indieStudio;

    public boolean isIndieStudio() {
        return indieStudio;
    }

    public void setIndieStudio(boolean indieStudio) {
        this.indieStudio = indieStudio;
    }

    public ThirdParty (){ }

    public ThirdParty(boolean indieStudio) {
        this.indieStudio = indieStudio;
    }
}