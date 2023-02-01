package com.te.resumebuilder.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.repository.AchievementDetailsRepository;
import com.te.resumebuilder.service.AchievementDetailsService;

@Service
public class AchievementdetailsServiceImpl implements AchievementDetailsService {
	@Autowired
	private AchievementDetailsRepository achievementDetailsRepository;
}
