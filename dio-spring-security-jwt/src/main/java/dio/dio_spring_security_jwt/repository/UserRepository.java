package dio.dio_spring_security_jwt.repository;

import dio.dio_spring_security_jwt.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository {

    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username= (:username")
    public User findByUserName(@Param("username") String username);

    boolean existsByUsername(String username);

    void save(User user);
}
