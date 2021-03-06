package com.gefersonholdorf.challengebootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gefersonholdorf.challengebootcamp.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
