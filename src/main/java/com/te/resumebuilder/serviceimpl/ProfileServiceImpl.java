package com.te.resumebuilder.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.te.resumebuilder.dto.EducationDetailsDto;
import com.te.resumebuilder.dto.ProfileDto;
import com.te.resumebuilder.dto.ProfileNewDto;
import com.te.resumebuilder.dto.ProjectDetailsDto;
import com.te.resumebuilder.dto.SummaryDto;
import com.te.resumebuilder.entity.AchievementDetails;
import com.te.resumebuilder.entity.EducationDetails;
import com.te.resumebuilder.entity.Profile;
import com.te.resumebuilder.entity.ProjectDetails;
import com.te.resumebuilder.entity.Skills;
import com.te.resumebuilder.entity.Summary;
import com.te.resumebuilder.exception.ResumeProfileIdNotFoundException;
import com.te.resumebuilder.repository.ProfileRepository;
import com.te.resumebuilder.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public ProfileDto createResume(ProfileDto profileDto) {

		// Profile Details
		Profile profile = new Profile();
		BeanUtils.copyProperties(profileDto, profile);

		// Summary Details
		List<SummaryDto> summaryDto = profileDto.getSummaryDto();
		List<Summary> summaries = new ArrayList<Summary>();
		summaryDto.forEach(e -> {
			Summary summary = new Summary();
			BeanUtils.copyProperties(e, summary);
			summaries.add(summary);
		});
		profile.setSummary(summaries);

		// Skill Details
		Skills skills = new Skills();
		BeanUtils.copyProperties(profileDto.getSkillsDto(), skills);
		skills.setProfile(profile);
		profile.setSkills(skills);

		// Achievement Details
		AchievementDetails achievementDetails = new AchievementDetails();
		BeanUtils.copyProperties(profileDto.getAchievementDetailsDto(), achievementDetails);
		profile.setAchievementDetails(achievementDetails);

		// Education Details
		List<EducationDetailsDto> educationDetailsDtos = profileDto.getEducationDetailsDto();
		List<EducationDetails> details = new ArrayList<EducationDetails>();

		educationDetailsDtos.forEach(e -> {
			EducationDetails educationDetails = new EducationDetails();
			BeanUtils.copyProperties(e, educationDetails);
			educationDetails.setEprofile(profile);
			details.add(educationDetails);
		});
		profile.setEducationDetails(details);

		// Project Details
		List<ProjectDetailsDto> projectDetailsDtos = profileDto.getProjectDetailsDto();
		List<ProjectDetails> projectDetails2 = new ArrayList<ProjectDetails>();
		projectDetailsDtos.forEach(e -> {
			ProjectDetails projectDetails = new ProjectDetails();
			BeanUtils.copyProperties(e, projectDetails);
			projectDetails2.add(projectDetails);
		});
		profile.setProjectDetails(projectDetails2);

		profileRepository.save(profile);

		return profileDto;
	}

	@Override
	public Profile updateResume(ProfileNewDto profileNewDto, Integer profileId) {
		Profile profile = profileRepository.findById(profileId).get();
		BeanUtils.copyProperties(profileNewDto, profile);
		return profileRepository.save(profile);
	}

	@Override
	public ProfileDto getResumeById(Integer profileId) {
		ProfileDto profileDto = new ProfileDto();
		Profile profile = profileRepository.findById(profileId)
				.orElseThrow(() -> new ResumeProfileIdNotFoundException("resume profile Id not found"));
		BeanUtils.copyProperties(profile, profileDto);
		return profileDto;
	}

	@Override
	@Transactional
	public ProfileDto deleteResumeById(Integer profileId) {
		if (profileId == 0) {
			System.out.println("give proper id");
			return null;
		} else {
			Profile profile = profileRepository.findById(profileId).get();
			ProfileDto profileDto = new ProfileDto();
			BeanUtils.copyProperties(profile, profileDto);
			profileRepository.deleteById(profileId);
			return profileDto;
		}
	}

}
