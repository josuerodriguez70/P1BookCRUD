package spring2.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@JsonIdentityInfo(
        //scope = AuthorsA.class,
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "author_id" //"author_id"
)

@Entity
@Table(name="authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorsA {

    @Id
    private int author_id;
    @Column
    private String name;

    @Column
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL,fetch = FetchType.EAGER) //,
    //@JoinColumn(name="author_name") //"author_id"
    private List<BooksA> books; //or public?
    //private Collection<BooksA> books = new ArrayList<>();


}
