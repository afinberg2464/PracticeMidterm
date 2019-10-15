package com.company;

// I designed this interface to cover the functions of a basic camera
// Any consumer-level camera created must implement this functionality
public interface CameraBasic {

    public void shutterButton();
    public void flashSwitch();
    public void zooming();

}
