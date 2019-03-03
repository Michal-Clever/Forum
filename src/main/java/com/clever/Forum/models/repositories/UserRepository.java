package com.clever.Forum.models.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRepository, Integer> {
}
