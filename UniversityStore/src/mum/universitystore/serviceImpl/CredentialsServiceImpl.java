package mum.universitystore.serviceImpl;

import java.util.List;

import mum.universitystore.model.Credentials;
import mum.universitystore.repository.CredentialsRepository;
import mum.universitystore.service.CredentialsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CredentialsServiceImpl implements CredentialsService {

	@Autowired
	private CredentialsRepository credentialsRepository;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void save(Credentials credentials) {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(credentials
				.getPassword());
		credentials.setPassword(encodedPassword);

		credentialsRepository.save(credentials);
	}

	public List<Credentials> findAll() {
		return (List<Credentials>) credentialsRepository.findAll();
	}

}
