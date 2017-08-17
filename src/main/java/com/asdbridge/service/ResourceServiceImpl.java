package com.asdbridge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.asdbridge.model.Resource;
import com.asdbridge.repository.ResourceRepository;

@Service("resourceService")
@Scope("singleton")
public class ResourceServiceImpl implements ResourceService
{

	private ResourceRepository resourceRepository;

	public ResourceServiceImpl()
	{
		// Emtpy constructor
	}

	@Autowired
	public ResourceServiceImpl(ResourceRepository resourceRepository)
	{
		this.resourceRepository = resourceRepository;
	}

	@Override
	public List<Resource> findAll()
	{
		return resourceRepository.findAll();
	}

}
