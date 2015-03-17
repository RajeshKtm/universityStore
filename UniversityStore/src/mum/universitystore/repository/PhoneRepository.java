package mum.universitystore.repository;


import mum.universitystore.model.Phone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



	@Repository
	public interface PhoneRepository extends  CrudRepository<Phone, Long> 
	{
	
  
	}

