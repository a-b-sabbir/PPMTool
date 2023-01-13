package com.absgroup.ppmtool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.absgroup.ppmtool.domain.Project;
import com.absgroup.ppmtool.services.ProjectService;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/api/project")
public class ProjectController {
	@Autowired
	public ProjectService projectService;

	@PostMapping("")
	ResponseEntity<Project> createNewProject(@Valid @RequestBody Project project) {
		Project project1 = projectService.saveOrupdate(project);
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}

}
