package com.company;

// DSLR extends Pro-Level, which extends Consumer-Level
// so it inherits all traits from both classes
public class ActionCam extends ProLevel {

    /**
     * Default constructor accepts Strings for manufacturer and model
     *
     * @param manufacturer String to set manufacturer
     * @param model String to set model
     */
    public ActionCam(String manufacturer, String model) {
        super(manufacturer, model);
    }
}
