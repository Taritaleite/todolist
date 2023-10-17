package br.com.taritaleite.todolist.user;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {

   UserModel findByUserName(String userName);

}
