package com.zigdev.app.repositories;

import com.zigdev.app.entitites.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player,Long> {

}
