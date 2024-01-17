package com.bhuvan.restApiCrud.controller;

import com.bhuvan.restApiCrud.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvender")
public class CloudVenderAPIService {
    CloudVendor cloudVendor;

    @GetMapping("{venderId}")
    public CloudVendor getCloudVenderDetails(String venderId)
    {
        return cloudVendor;
                //new CloudVendor("C1","Vendor 1","Address One","xxxxx");

    }

    @PostMapping
    public String createCloudVenderDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vender Created Successfully";
    }



    @PutMapping
    public String updateCloudVenderDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vender Updated Successfully";
    }


    @DeleteMapping("{venderId}")
    public String deleteCloudVenderDetails(String venderId){
        this.cloudVendor = null;
        return "Cloud Vender Deleted Successfully";
    }

}
