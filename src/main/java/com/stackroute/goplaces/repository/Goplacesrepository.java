package com.stackroute.goplaces.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoDatabase;
import com.stackroute.goplaces.domain.Places;
@Repository
public interface Goplacesrepository extends MongoRepository<Places, Integer>
{

}
