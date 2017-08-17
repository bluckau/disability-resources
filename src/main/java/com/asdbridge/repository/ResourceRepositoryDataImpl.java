package com.asdbridge.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.asdbridge.model.Resource;

@Repository("resourceRepository")
public class ResourceRepositoryDataImpl implements ResourceRepository
{
	@Override
	public List<Resource> findAll()
	{
		List<Resource> resources = new ArrayList<>();
		Resource resource = new Resource();
		resource.setName("Ye Olde Autism Shoppe");
		resource.setType("Retail/Accessories");
		resources.add(resource);
		return resources;
	}
}
