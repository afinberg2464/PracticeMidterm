package com.company;

public class Main {

    public static void main(String[] args) {

        String manufacturer, model, focusMode, shootingMode;
        int aperture, isoSetting, maxZoom;

        // Create DSLR camera
        DSLR camera1 = new DSLR("Canon", "EOS");

        // Test inheritance from CameraAdvanced and CameraBasic interfaces
        camera1.flashSwitch();
        camera1.formatSDCard();
        camera1.takeVideo();
        camera1.zooming();
        camera1.shutterButton();

        // Test Setters
        camera1.setAperture(5);
        camera1.setFocusMode("Manual");
        camera1.setIso(8);
        camera1.setMaxZoom(16);
        camera1.setShootingMode("Auto");

        // Test Getters
        aperture = camera1.getAperture();
        focusMode = camera1.getFocusMode();
        isoSetting = camera1.getIso();
        maxZoom = camera1.getMaxZoom();
        manufacturer = camera1.getManufacturer();
        model = camera1.getModel();

        // Create Film Camera
        FilmCamera camera2 = new FilmCamera("Kodak", "35mm");

        // Test inheritance from CameraBasic interface
        camera2.flashSwitch();
        camera2.zooming();
        camera2.shutterButton();

        // Test Setters
        camera2.setMaxZoom(8);
        camera2.setShootingMode("Auto");

        // Test Getters
        manufacturer = camera2.getManufacturer();
        model = camera2.getModel();
        maxZoom = camera2.getMaxZoom();
        shootingMode = camera2.getShootingMode();

        // Test compareTo() method to check which camera has the higher maximum zoom
        int maxZoomCompareResult;
        camera1.compareTo(camera2);

        // This is the code for the CodingBat dividesSelf method
        boolean x = dividesSelf(128);
        boolean y = dividesSelf(64);
        boolean z = dividesSelf(331);

        // This is the code for the CodingBat canBalance method
        int[] array1 = {1, 1, 1, 2, 1};
        int[] array2 = {2, 1, 1, 2, 1};
        int[] array3 = {10, 10};

        boolean result;
        result = canBalance(array1);
        result = canBalance(array2);
        result = canBalance(array3);
    }

    /**
     * This method accepts an int parameter and determines
     * if every digit in the number divides into the number evenly
     *
     * @param n number
     * @return true or false
     */
    private static boolean dividesSelf(int n) {
        for (int i = n; !(i == 0); i /= 10) {
            int num = i % 10;
            if (num == 0 || n % num != 0)
                return false;
        }
        return true;
    }

    /**
     * Given a non-empty array, this method returns true if
     * there is a place to split the array so that the sum
     * of the numbers on one side is equal to the sum
     * of the numbers on the other side
     *
     * @param num number
     * @return true or false
     */
    private static boolean canBalance(int[] num) {
        int first = 0;
        int second = 0;

        for (int value : num) second += value;

        for (int i = 0; i <= num.length - 2; i++) {
            first += num[i];
            second -= num[i];

            if (first == second)
                return true;
        }
        return false;
    }
}
