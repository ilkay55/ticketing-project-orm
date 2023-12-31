package com.cydeo.repository;

import com.cydeo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    //build all queries that will bring data from db
    //readyrepository (like JPA)
    //derive, @Query(JAP-Native)
}
