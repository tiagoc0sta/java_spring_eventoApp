package com.eventoappp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoappp.models.Convidado;
import com.eventoappp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
		
}

