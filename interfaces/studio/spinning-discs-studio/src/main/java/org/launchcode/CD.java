package org.launchcode;

public class CD extends InfoDisc implements Interface {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    int numTracks;

    public CD(String title, double diameter, String format, String storageCapacity, int numTracks) {

        this.numTracks = numTracks;
    }

    @Override
    public void spin() {

    }
}
