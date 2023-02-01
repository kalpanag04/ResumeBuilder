package com.te.resumebuilder.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.repository.ProjectDetailsRepository;
import com.te.resumebuilder.service.ProjectDetailsService;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService {
	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;
}
