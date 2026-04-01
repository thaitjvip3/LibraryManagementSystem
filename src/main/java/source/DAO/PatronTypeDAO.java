package source.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import source.entity.PatronTypes;

import java.util.List;

@Repository
public interface PatronTypeDAO extends JpaRepository<PatronTypes,Long> {

    @Query(value = "select * from pat_patron_types where active_fag=:active",nativeQuery = true)
    List<PatronTypes> findByActiveFag(@Param("active") int activeFag);

    @Query(value = "select * from pat_patron_types where name =:name",nativeQuery = true)
    PatronTypes findByName(@Param("name") String name);

    @Query(value = "select * from pat_patron_types where id =:id",nativeQuery = true)
    PatronTypes findById1 (@Param("id") Long id);
}
