package mum.universitystore.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Autowired
//	private UserDao userDao;
//
//	@Transactional(readOnly=true)
//	@Override
//	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
//	
//		mum.universitystore.model.User user = userDao.findByUserName(username);
//		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());
//
//		return buildUserForAuthentication(user, authorities);
//		
//	}
//
//	// Converts mum.universitystore.model.User user to
//	// org.springframework.security.core.userdetails.User
//	private User buildUserForAuthentication(mum.universitystore.model.User user, List<GrantedAuthority> authorities) {
//		return new User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
//	}
//
//	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {
//
//		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
//
//		// Build user's authorities
//		for (UserRole userRole : userRoles) {
//			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
//		}
//
//		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
//
//		return Result;
//	}

}