package com.lab1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.lab1.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player,Long>
{

}