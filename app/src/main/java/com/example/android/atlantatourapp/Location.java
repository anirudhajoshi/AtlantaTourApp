package com.example.android.atlantatourapp;

/**
 * Created by anirudha.joshi on 7/6/2016.
 */
public class Location {

    // Will hold attraction header text
    private String mLocationHeader;

    // Will hold attraction hours text
    private String mLocationHours;

    // Will hold attraction address
    private String mLocationAddress;

    // Will hold attraction phone
    private String mLocationPhone;

    // Will hold attraction image resource Id, if attraction image is provided
    private int mLocationImageResourceID = NO_IMAGE_PROVIDED;

    // constant to indicate no image exists for the attraction. This is the default
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new {@link Location} object.
     *
     * @param LocationHeader  is the header text of location.
     * @param LocationHours   is the text for location hours.
     * @param LocationAddress is the text for location address.
     */
    public Location(String LocationHeader, String LocationHours, String LocationAddress, String LocationPhone) {
        // Initialize location object variables
        mLocationHeader = LocationHeader;
        mLocationHours = LocationHours;
        mLocationAddress = LocationAddress;
        mLocationPhone = LocationPhone;
    }

    /**
     * Create a new {@link Location} object.
     *
     * @param LocationHeader          is the header text of location.
     * @param LocationImageResourceID is the resource ID for the image associated with attraction
     */
    public Location(String LocationHeader, String LocationHours, String LocationAddress, String LocationPhone, int LocationImageResourceID) {

        mLocationHeader = LocationHeader;
        mLocationHours = LocationHours;
        mLocationAddress = LocationAddress;
        mLocationImageResourceID = LocationImageResourceID;
    }

    // Returns image resource id if location has an image or -1 if no image is associated with the view
    public boolean hasImage() {
        return mLocationImageResourceID != NO_IMAGE_PROVIDED;
    }

    // getter for location header text
    public String getLocationHeader() {
        return mLocationHeader;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mLocationImageResourceID;
    }

    public String getLocationHours() {
        return mLocationHours;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }

    public String getLocationPhone() {
        return mLocationPhone;
    }
}
