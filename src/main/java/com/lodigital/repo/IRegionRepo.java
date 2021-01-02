package com.lodigital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lodigital.model.Region;


public interface IRegionRepo extends JpaRepository<Region, Integer>{

}
