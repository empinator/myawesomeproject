package de.studiapp.pms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.studiapp.pms.repository.VorlesungsverschiebungRepository;
import de.studiapp.pms.model.*;

@Service
@Transactional
public class VorlesungsverschiebungService {
	
	@Autowired
	private VorlesungsverschiebungRepository vorlesungsverschiebungsRepository;
	
	
	public Iterable<Vorlesungsverschiebung> findAll(){
		return vorlesungsverschiebungsRepository.findAll();
		
	}

}
