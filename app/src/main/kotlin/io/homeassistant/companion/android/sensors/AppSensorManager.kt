package io.homeassistant.companion.android.sensors

import com.wahome.BuildConfig
import io.homeassistant.companion.android.common.sensors.AppSensorManagerBase

class AppSensorManager : AppSensorManagerBase() {

    override fun getCurrentVersion(): String = BuildConfig.VERSION_NAME
}
