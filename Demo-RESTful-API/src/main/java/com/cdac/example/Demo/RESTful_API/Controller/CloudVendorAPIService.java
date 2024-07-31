package com.cdac.example.Demo.RESTful_API.Controller;

import com.cdac.example.Demo.RESTful_API.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

/*
we are creating cloudVendorAPIService  which should serving an get api which should contains getCloudVendorDetails()
which should be serving the get request B'Z we put an annotation RequestMapping on it.
 */
@RestController//how spring comes to know its controller =>hence this annotations indicates.
@RequestMapping("/cloudvendor")//how springboot knows from which
public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")//we are creating get method and to know spring-boot app we use annotation.we r mapping
    //request with vendoId attribute

    public CloudVendor getCloudVendorDetails(String vendorId) {  //returning cloudvendor objects with hardcoded values
       return cloudVendor;
               //("C1", "vendor 1","Address One", "xxxx"); //we can test RESTAPI's using postman client =>instead brwsr.

    }
    @PostMapping //since it is create request so i can add this annotation.
    public String CreateCloudVendorDetails( @RequestBody CloudVendor cloudVendor){ //b'z of cloudVendor object we will be receiving
        // in the post request as a post request itself.
            this.cloudVendor=cloudVendor;
            return "Cloud Vendor created Successfully.";
    }

    @PutMapping //since it is going to  update vendor info so i can add this annotation.
    public String updateCloudVendorDetails( @RequestBody CloudVendor cloudVendor){ //b'z of cloudVendor object we will be receiving
        // in the post request as a post request itself.
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor updated Successfully.";
    }

    @DeleteMapping("{vendorId}") //since it is del request so i can add this annotation.
    public String deleteCloudVendorDetails( String vendorId){ //usualyy we r deleting on th basis of Id
        // in the post request as a post request itself.
        this.cloudVendor=null; //since its hardcoded values we r used ,just setting it to null.
        return "Cloud Vendor deleted Successfully.";
    }

}
