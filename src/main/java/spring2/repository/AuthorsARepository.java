package spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import spring2.model.AuthorsA;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AuthorsARepository extends JpaRepository<AuthorsA, Integer> {

    AuthorsA save(AuthorsA author);

    //@Query("from authors")
    List<AuthorsA> findAll();

    //@Query ("from authors where name = :name")
    AuthorsA findByName(String name);

    //@Query
    // update/patch

    @Modifying
    @Query(value = "delete from authors where authors.name=:name", nativeQuery = true)
    void myDelete(String name);
}
