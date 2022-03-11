package spring2.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@JsonIdentityInfo(

        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "book_id" //
)

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
    @Column
    private int price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_name")
    private AuthorsA author;


}
