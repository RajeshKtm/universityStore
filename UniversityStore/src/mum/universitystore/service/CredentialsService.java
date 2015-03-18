package mum.universitystore.service;

import java.util.List;

import mum.universitystore.model.Credentials;

public interface CredentialsService {

	public void save(Credentials credentials);

	public List<Credentials> findAll();
}
