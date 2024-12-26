package com.Springboot.CloudVendorApi.controller;

import com.Springboot.CloudVendorApi.model.CloudVendor;
import com.Springboot.CloudVendorApi.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {


    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

  // Get   specific  cloud vendor details
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){


        return  cloudVendorService.getCloudVendorDetails(vendorId);

    }
  //get all  cloud vendor details
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){


        return  cloudVendorService.getAllCloudVendors();

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created SuccessFully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated  SuccessFully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor((vendorId));
        return "Cloud Vendor Deleted   SuccessFully";
    }




}
