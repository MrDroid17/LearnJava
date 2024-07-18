package com.learnjava.spring.test.Project_09_Spring_MVC_Validation.entity;

import com.learnjava.spring.test.Project_09_Spring_MVC_Validation.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName="";

    @NotNull(message = "is required")
    @Min(value = 1, message = "Value should be greater than 1.")
    @Max(value = 10, message = "Value should be less than 10.")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "Value should be 6 character long and can be alphanumeic.")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
