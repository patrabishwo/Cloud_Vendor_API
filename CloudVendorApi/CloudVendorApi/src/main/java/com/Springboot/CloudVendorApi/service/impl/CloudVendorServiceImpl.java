package com.Springboot.CloudVendorApi.service.impl;

import com.Springboot.CloudVendorApi.model.CloudVendor;
import com.Springboot.CloudVendorApi.repository.CloudVendorRepository;
import com.Springboot.CloudVendorApi.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {



    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Sucess";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Sucess update";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);

        return "Deleted Successfully";
    }

    @Override
    public CloudVendor getCloudVendorDetails(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
