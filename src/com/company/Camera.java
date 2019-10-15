package com.company;

// Abstract Class as nobody should be able to create a generic camera
public abstract class Camera implements Comparable<Camera> {

    private String manufacturer;
    private String model;
    private int maxZoom;

    /**
     * Default constructor allows user to define manufacturer and model
     * Accepts Strings for both parameters
     *
     * @param manufacturer manufacturer
     * @param model        model name
     */
    Camera(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    /**
     * Method to compare maximum zoom levels
     *
     * @param other the second camera to compare
     * @return int result
     */
    @Override
    public int compareTo(Camera other) {
        if (getMaxZoom() > other.getMaxZoom())
            return 1;
        if (getMaxZoom() < other.getMaxZoom()) {
            return -1;
        } else
        return 0;
    }

    /**
     * Accessor to get manufacturer
     *
     * @return returns a String containing the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Mutator accepts String for manufacturer
     *
     * @param manufacturer manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Accessor to get model name
     *
     * @return returns a String for model name
     */
    public String getModel() {
        return model;
    }

    /**
     * Mutator accepts String to set model
     *
     * @param model model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Accessor returns int for maximum zoom level
     *
     * @return maximum zoom level
     */
    public int getMaxZoom() {
        return maxZoom;
    }

    /**
     * Mutator accepts int for maximum zoom level
     *
     * @param maxZoom maximum zoom
     */
    public void setMaxZoom(int maxZoom) {
        this.maxZoom = maxZoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", maxZoom=" + maxZoom +
                '}';
    }
}
