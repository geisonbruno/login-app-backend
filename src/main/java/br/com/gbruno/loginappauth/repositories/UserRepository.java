package br.com.gbruno.loginappauth.repositories;

import br.com.gbruno.loginappauth.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
