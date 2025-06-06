package com.cac.dto;

import com.cac.model.Doctor;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class DoctorDTO {
    private int doctorId;
    private String doctorName;
    private String specialization;
    private String qualification;
    private String contactNumber;
    private String emailId;
    private String gender;
    private String location;
    private Double consultationFees;
    private LocalDate dateOfJoining;
    private Boolean isSurgeon;
    private Integer yearsOfExperience;
    private Boolean status;
    private Map<String, List<String>> availability;

    // Constructor to convert Doctor entity to DTO (excluding appointments)
    public DoctorDTO(Doctor doctor) {
        this.doctorId = doctor.getDoctorId();
        this.doctorName = doctor.getDoctorName();
        this.specialization = doctor.getSpecialization();
        this.qualification = doctor.getQualification();
        this.contactNumber = doctor.getContactNumber();
        this.emailId = doctor.getEmailId();
        this.gender = doctor.getGender();
        this.location = doctor.getLocation();
        this.consultationFees = doctor.getConsultationFees();
        this.dateOfJoining = doctor.getDateOfJoining();
        this.isSurgeon = doctor.getSurgeon();
        this.yearsOfExperience = doctor.getYearsOfExperience();
        this.status = doctor.getStatus();
        this.availability = doctor.getAvailability(); // Include availability details
    }

    // Constructor to initialize DoctorDTO with only id and name

    public String getQualification() {
        return qualification;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getConsultationFees() {
        return consultationFees;
    }

    public void setConsultationFees(Double consultationFees) {
        this.consultationFees = consultationFees;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getIsSurgeon() {
        return isSurgeon;
    }

    public void setIsSurgeon(Boolean isSurgeon) {
        this.isSurgeon = isSurgeon;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Map<String, List<String>> getAvailability() {
        return availability;
    }

    public void setAvailability(Map<String, List<String>> availability) {
        this.availability = availability;
    }
}
