# Wahome Android Build Instructions

## Quick Start

1. **Open Android Studio**
2. **Import Project**: File → Open → Select the `/app` folder
3. **Wait for Gradle Sync** to complete
4. **Build**: Build → Build Bundle(s) / APK(s) → Build APK(s)

## Package Information

- **App Name**: Wahome
- **Package Name**: `com.wahome`
- **Debug Package**: `com.wahome.debug`

## Build Variants

### Debug Build
```bash
./gradlew assembleDebug
```
- Package: `com.wahome.debug`
- Output: `app/build/outputs/apk/full/debug/app-full-debug.apk`

### Release Build
```bash
./gradlew assembleRelease
```
- Package: `com.wahome`
- Requires signing configuration
- Output: `app/build/outputs/apk/full/release/app-full-release.apk`

## Signing Configuration

For release builds, add to your `~/.gradle/gradle.properties`:

```properties
KEYSTORE_PATH=/path/to/your/keystore.jks
KEYSTORE_PASSWORD=your_keystore_password
KEYSTORE_ALIAS=your_key_alias
KEYSTORE_ALIAS_PASSWORD=your_alias_password
```

## App Icons

Replace the following files with your custom Wahome icons:
- `app/src/main/res/mipmap-hdpi/ic_launcher.png` (72x72)
- `app/src/main/res/mipmap-mdpi/ic_launcher.png` (48x48)
- `app/src/main/res/mipmap-xhdpi/ic_launcher.png` (96x96)
- `app/src/main/res/mipmap-xxhdpi/ic_launcher.png` (144x144)
- `app/src/main/res/mipmap-xxxhdpi/ic_launcher.png` (192x192)

And the corresponding round icons:
- `app/src/main/res/mipmap-*dpi/ic_launcher_round.png`

## Testing

1. Install the APK on your Android device
2. Launch Wahome app
3. Verify the app shows "Wahome" branding
4. Test connection to your Home Assistant server
5. Confirm all functionality works as expected

## Troubleshooting

### Gradle Sync Issues
- Ensure Android SDK and build tools are installed
- Check internet connection for dependency downloads

### Build Failures
- Clean and rebuild: `./gradlew clean build`
- Check for any missing dependencies
- Verify Java/Kotlin versions are compatible

### App Installation Issues
- Enable "Install from unknown sources" on your device
- Uninstall previous versions if package conflicts occur

## Theme Customization

The app uses a silver and matter black theme. To modify colors, edit:
- `app/src/main/res/values/colors.xml`
- `common/src/main/res/values/colors.xml`

## Success Indicators

✅ App builds without errors
✅ APK installs on Android device  
✅ App launches with "Wahome" branding
✅ Connects to Home Assistant server
✅ All original functionality preserved

Your Wahome app is ready for distribution!