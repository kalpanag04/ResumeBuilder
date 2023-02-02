package com.te.resumebuilder.service;


import com.te.resumebuilder.dto.ProfileDto;
import com.te.resumebuilder.dto.ProfileNewDto;
import com.te.resumebuilder.entity.Profile;

public interface ProfileService {

	ProfileDto createResume(ProfileDto profileDto);

	Profile updateResume(ProfileNewDto profileNewDto, Integer profileId);

	ProfileDto getResumeById(Integer profileId);

	ProfileDto deleteResumeById(Integer profileId);

}
