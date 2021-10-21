package com.pruebaTecnica.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebaTecnica.model.UsuarioInterno;

public interface UsuarioInternoRepository extends MongoRepository<UsuarioInterno,Long>{

}
