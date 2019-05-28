package com.zigdev.app.repositories;

import com.zigdev.app.entitites.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TeamRepository extends JpaRepository<Team,Long> {
}
