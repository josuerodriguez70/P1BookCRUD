package spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import spring2.model.BooksA;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface BooksARepository extends JpaRepository<BooksA, Integer> {

    BooksA save(BooksA book);

    //@Query("from books")
    List<BooksA> findAll();

    //@Query("from books where title = :title")
    BooksA findByTitle(String title);

    // update
    @Modifying
    @Query( value = "update books set books.price=:price where books.title=:title", nativeQuery = true)
    void updatePrice(String title, int price);


    //delete
    @Modifying
    @Query(value = "delete from books where books.title=:title", nativeQuery = true)
    void myDelete(String title);


}
