package spring2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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

    /*@OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name="author_id")
    private List<BooksA> books;*/

}
