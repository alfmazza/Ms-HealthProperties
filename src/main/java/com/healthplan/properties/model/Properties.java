package com.healthplan.properties.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "healthplan_properties")
public class Properties extends Base {
    
    @NotNull(message = "Copay cannot be null")
    @Column(name = "copay")
    private double copay;
    
    @NotNull
    @Column(name = "medical_guide")
    private int medicalGuide;
    
    @NotNull
    @Column(name = "internation")
    private int internation;
    
    @NotNull
    @Column(name = "doctor_to_home")
    private int doctorToHome;
    
    @NotBlank(message = "Odontology cannot be blank")
    @Column(name = "odontology")
    private String odontology;
    
    @NotBlank
    @Column(name = "orthodontics")
    private String orthodontics;
    
    @NotNull
    @Column(name = "refund")
    private double refund;

    @NotNull
    @Column(name = "status")
    private int status;
    
    @NotNull
    @Column(name = "surgery")
    private int surgery;

}
