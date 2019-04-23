package security.securitydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.securitydb.Model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByName(String username);


}
