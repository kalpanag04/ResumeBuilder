//package com.te.resumebuilder.serviceimpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.te.resumebuilder.entity.MyUser;
//import com.te.resumebuilder.repository.UserRepo;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//	@Autowired
//	UserRepo userRepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		MyUser user = userRepo.findByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("User 404");
//		}
//		return new MyUserDetails(user);
//	}
//
//}
