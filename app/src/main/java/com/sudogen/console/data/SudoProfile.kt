package com.sudogen.console.data

/**
 * Data model representing a full Sudo identity profile.
 * All fields are nullable to allow for incomplete or selectively generated profiles.
 */
data class SudoProfile(
    // Personal & Biometric Data
    val fullName: String?,
    val dateOfBirth: String?,
    val age: String?,
    val placeOfBirth: String?,
    val nationality: String?,
    val gender: String?,
    val mothersMaidenName: String?,
    val bloodType: String?,

    // Physical Description
    val height: String?,
    val weight: String?,
    val build: String?,
    val hairColour: String?,
    val eyeColour: String?,
    val distinguishingMarks: String?,

    // Contact & Location Information
    val currentAddress: String?,
    val mobileNumber: String?,
    val emailAddress: String?,
    val emergencyContact: String?,

    // Official Documentation
    val driversLicence: String?,
    val passportNumber: String?,
    val medicareNumber: String?,
    val taxFileNumber: String?,
    val privateHealthPolicy: String?,

    // Professional & Financial Profile
    val occupation: String?,
    val employer: String?,
    val employeeId: String?,
    val workEmail: String?,
    val workPhone: String?,
    val annualSalary: String?,
    val education: String?,
    val paymentDetails: String?,

    // Digital Footprint
    val primaryUserAgent: String?,
    val internalIp: String?,
    val externalIp: String?,
    val vpnActive: Boolean,
    val vpnProvider: String?,
    val vpnExternalIp: String?,

    // Assets
    val primaryVehicle: String?,
    val vehicleRegistration: String?,
    val keyTechnology: String?,

    // History & Socials
    val previousPhone: String?,
    val previousEmail: String?,
    val socialMediaHandles: String?,
    val usernameAlias: String?,

    // Billing & Utilities
    val electricityProvider: String?,
    val waterProvider: String?,
    val internetProvider: String?,
    val billingAddress: String?
)