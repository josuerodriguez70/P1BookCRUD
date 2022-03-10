package spring2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BooksA {

    @Id
    private int book_id;
    @Column
    private String title;
    //@Column
    //private String name;
    @Column
    private int year;


    /*@ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorsA author;*/
}
