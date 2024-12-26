package com.Springboot.CloudVendorApi.repository;

import com.Springboot.CloudVendorApi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository  extends JpaRepository<CloudVendor, String> {

}
