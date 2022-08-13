package models

import utils.ObservableValue

class DebugOptionsModel(val isDebugMode: Boolean) {
    val removeProperlyTypedModels = ObservableValue(false)
    val badModelIndexOverride = ObservableValue(-1)
    val modelSubIndex = ObservableValue(-1)
    val resetCameraOnSceneChange = ObservableValue(true)
    val onlyType10Models = ObservableValue(false)
}
