package com.te.resumebuilder.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.dto.MyUserDto;
import com.te.resumebuilder.entity.MyUser;
import com.te.resumebuilder.repository.UserRepo;
import com.te.resumebuilder.service.MyUserDetailsService;

@Service
public class MyUserDetailsServiceImpl implements MyUserDetailsService {

	@Autowired
	UserRepo userRepo;

	@Override
	public MyUserDto addUser(MyUserDto myUserDto) {
		MyUser myUser=new MyUser();
		BeanUtils.copyProperties(myUserDto, myUser);
		userRepo.save(myUser);
		return myUserDto;
	}
}
