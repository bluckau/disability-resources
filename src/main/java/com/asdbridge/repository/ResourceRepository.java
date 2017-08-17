package com.asdbridge.repository;

import java.util.List;

import com.asdbridge.model.Resource;

public interface ResourceRepository
{
	List<Resource> findAll();
}