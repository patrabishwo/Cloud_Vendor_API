package com.Springboot.CloudVendorApi.service;

import com.Springboot.CloudVendorApi.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendorDetails(String vendorId);
    // to get all the  available cloud  vendor list
    public List<CloudVendor> getAllCloudVendors();





}
