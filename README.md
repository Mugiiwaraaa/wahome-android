# Wahome Android App

## Overview

Wahome is a smart home companion app that provides seamless control and monitoring of your home automation system. Built with modern Android technologies, Wahome offers an intuitive interface with a sleek silver and matter black design theme.

## Features

- **Smart Home Control**: Manage your connected devices and automations
- **Modern UI**: Clean, professional interface with silver and matter black theme
- **Device Compatibility**: Works with multiple platforms including phones, tablets, Android Auto, and Wear OS
- **Secure**: Biometric authentication and encrypted connections
- **Customizable**: Widgets, shortcuts, and personalized dashboards
- **Real-time Updates**: Live sensor data and device status monitoring

## Getting Started

### Prerequisites

- Android Studio with Android SDK
- Java JDK 11+
- Android device running API 21+ (Android 5.0+)

### Building the App

1. **Clone the repository**
2. **Open in Android Studio**
   - Import the project
   - Let Gradle sync complete
3. **Build the app**
   ```bash
   ./gradlew assembleDebug
   ```

### Installation

Install the built APK on your Android device and configure your home automation server connection.

## App Structure

- **Main App** (`/app`): Core Android application
- **Automotive** (`/automotive`): Android Auto integration
- **Wear** (`/wear`): Wear OS companion app
- **Common** (`/common`): Shared code and resources

## Customization

The app features a modern design with:
- **Primary Color**: Silver (#C0C0C0)
- **Dark Theme**: Matter Black (#121212)
- **Accent Color**: Light Silver (#B0B0B0)

## Package Structure

- **Package Name**: `com.wahome`
- **Application Class**: `WahomeApplication`
- **Debug Variant**: `com.wahome.debug`

## Contributing

This project follows standard Android development practices. Please ensure all changes maintain backward compatibility and follow the established design patterns.

## License

See LICENSE.md for details.

---

**Wahome** - Your smart home, simplified.
