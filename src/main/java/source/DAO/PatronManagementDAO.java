package source.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import source.entity.Patron;

import java.util.List;

@Repository
public interface PatronManagementDAO extends JpaRepository<Patron,Long> {

    @Query(value = "select * from pat_patron where active_fag=:active",nativeQuery = true)
    List<Patron> findByActiveFag(@Param("active") int activeFag);

    Patron findById(long id);

}
