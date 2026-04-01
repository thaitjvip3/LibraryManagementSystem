package source.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import source.entity.User;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User,Long> {
    @Query(value = "select * from user_infos where active_fag=:active",nativeQuery = true)
    List<User> findByActiveFag(@Param("active") int activeFag);

    @Query(value = "select * from user_infos where email =:email",nativeQuery = true)
    User findByEmail(@Param("email") String email);

    @Query(value = "select * from user_infos where id =:id",nativeQuery = true)
    User findById(@Param("id") int id);
    
    @Query(value = "select r.role_name from user_infos u join role r on u.role = r.role where id=:id",nativeQuery = true)
    List<String> getRoleName(@Param("id") long id);
}
