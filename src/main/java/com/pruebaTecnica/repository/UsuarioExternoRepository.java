package com.pruebaTecnica.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebaTecnica.model.usuarioExterno;

public interface UsuarioExternoRepository extends MongoRepository<usuarioExterno,String>{

}
