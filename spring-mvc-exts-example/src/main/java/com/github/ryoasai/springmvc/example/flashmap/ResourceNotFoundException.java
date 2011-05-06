package com.github.ryoasai.springmvc.example.flashmap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	// test2
	private Long resourceId;
	
	public ResourceNotFoundException(Long resourceId) {
		this.resourceId = resourceId;
	}
	
	public Long getResourceId() {
		return resourceId;
	}
	
}