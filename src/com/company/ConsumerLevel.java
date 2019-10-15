package com.company;

// Abstract Class as nobdy should be able to create a generic consumer-level camera
public abstract class ConsumerLevel extends Camera {

    private String shootingMode;

    /**
     * Default constructor accepts Strings for manufacturer and model
     *
     * @param manufacturer String to set manufacturer
     * @param model        String to set model
     */
    ConsumerLevel(String manufacturer, String model) {
        super(manufacturer, model);
    }

    /**
     * Accessor returns String for shooting mode
     *
     * @return shooting mode
     */
    public String getShootingMode() {
        return shootingMode;
    }

    /**
     * Mutator accepts String for shooting mode
     *
     * @param shootingMode shooting mode
     */
    public void setShootingMode(String shootingMode) {
        this.shootingMode = shootingMode;
    }

    @Override
    public String toString() {
        return "ConsumerLevel{" +
                "shootingMode='" + shootingMode + '\'' +
                '}';
    }
}
