package com.absgroup.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.absgroup.ppmtool.domain.Project;
import com.absgroup.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	public ProjectRepository projectRepository;
	
	public Project saveOrupdate(Project project) {
		return projectRepository.save(project);
	}
}
