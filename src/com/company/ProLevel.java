package com.company;

// Abstract Class as nobdy should be able to create a generic professional-level camera
public class ProLevel extends ConsumerLevel {

    private int iso;
    private int aperture;
    private String focusMode;

    /**
     * Default constructor accepts Strings for manufacturer and model
     *
     * @param manufacturer String to set manufacturer
     * @param model String to set model
     */
    public ProLevel(String manufacturer, String model) {
        super(manufacturer, model);
    }

    /**
     * Accessor returns int for ISO setting
     *
     * @return ISO setting
     */
    public int getIso() {
        return iso;
    }

    /**
     * Mutator accepts int for ISO setting
     *
     * @param iso ISO setting
     */
    public void setIso(int iso) {
        this.iso = iso;
    }

    /**
     * Accessor returns int for aperture setting
     *
     * @return aperture setting
     */
    public int getAperture() {
        return aperture;
    }

    /**
     * Mutator accepts int for aperture setting
     *
     * @param aperture aperture setting
     */
    public void setAperture(int aperture) {
        this.aperture = aperture;
    }

    /**
     * Accessor returns String for focus mode
     *
     * @return focus mode
     */
    public String getFocusMode() {
        return focusMode;
    }

    /**
     * Mutator accepts String for focus mode
     *
     * @param focusMode focus mode
     */
    public void setFocusMode(String focusMode) {
        this.focusMode = focusMode;
    }

    @Override
    public String toString() {
        return "ProLevel{" +
                "iso=" + iso +
                ", aperture=" + aperture +
                ", focusMode='" + focusMode + '\'' +
                '}';
    }
}
