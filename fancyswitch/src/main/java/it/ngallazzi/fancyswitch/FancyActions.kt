package it.ngallazzi.fancyswitch

interface FancyActions {
    fun setState(newState: FancyState.State)
    fun setSwitchStateChangedListener(listener: FancySwitch.StateChangedListener)
}