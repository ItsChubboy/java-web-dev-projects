package org.launchcode;

public class DVD extends InfoDisc implements Interface {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    int numChapters;

    public DVD(String title, String discType, double diameter, String format, String storageCapacity) {
        super(title. discType, diameter, format, storageCapacity);
    }

    @Override
    public void spin() {

    }
}
