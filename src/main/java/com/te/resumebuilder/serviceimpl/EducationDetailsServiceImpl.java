package com.te.resumebuilder.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.repository.EducationDetailsRepository;
import com.te.resumebuilder.service.EducationDetailsService;

@Service
public class EducationDetailsServiceImpl implements EducationDetailsService {
	@Autowired
	private EducationDetailsRepository educationDetailsRepository;

}
