package com.kaiyuan.cloud.userprovider.repository;

import com.kaiyuan.cloud.userprovider.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
