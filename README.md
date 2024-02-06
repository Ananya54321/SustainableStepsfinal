# 🌐 Community Engagement and User Authentication App Documentation

## Introduction

Welcome to the 🌐 Community Engagement and User Authentication App!

## Modules

### LoginActivity

The `LoginActivity` is the entry point for users to log in to the app. It provides a simple interface with options to either navigate to the sign-up page or proceed to a web view.

### OTPVerificationActivity

The `OTPVerificationActivity` handles the verification of a one-time password (OTP). Once the OTP is verified, users are redirected to the next step of the sign-up process.


### SignInDetails

The `SignInDetails` activity collects additional user details such as email, username, and password for account creation. It utilizes Firebase Authentication for secure account management.


### SplashScreenActivity

The `SplashScreenActivity` provides a visual introduction to the app with a splash screen. After a brief delay, users are redirected to the LoginActivity.

### Home Fragment

The `HomeFragment` serves as the central hub for community engagement, showcasing volunteering and extra events through dynamic image sliders.

#### Features:

- Dynamic image slider for volunteering event banners (`imageSlider`).
- Separate image slider for extra events (`imageSlider2`).
- Visual representation of upcoming events to encourage community participation.

  ### Schedule Fragment

The `ScheduleFragment` facilitates waste segregation by allowing users to choose categories for proper waste disposal. It offers a user-friendly multi-choice dialog to select and manage waste categories effectively.

### Snapcam Fragment

The `SnapcamFragment` is dedicated to capturing and managing images related to waste management activities. It includes a date picker for associating dates with the captured images, enhancing organization and tracking.

## Getting Started

1. Clone the repository.
2. Explore the different activities and fragments within the app.
3. Contribute to creating a secure and user-friendly onboarding and community engagement experience.
