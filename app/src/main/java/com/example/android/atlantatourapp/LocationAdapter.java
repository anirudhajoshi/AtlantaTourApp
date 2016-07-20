package com.example.android.atlantatourapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anirudha.joshi on 7/6/2016.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    static class ViewHolder {
        private TextView locationsHeaderTextView;
        private TextView locationAddressTextView;
        private TextView locationHoursTextView;
        private TextView locationPhoneTextView;
        private ImageView locationImageView;
    }

    /**
     * Resource ID for the background color for this list of words
     */
    private int mBackgroundColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context                   is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations                 is the list of {@link Location}s to be displayed.
     * @param backgroundcolorResourceId is the resource ID for the image associated with attraction
     */
    public LocationAdapter(Context context, ArrayList<Location> locations, int backgroundcolorResourceId) {
        super(context, 0, locations);

        mBackgroundColorResourceId = backgroundcolorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            holder = new ViewHolder();
            holder.locationsHeaderTextView = (TextView) listItemView.findViewById(R.id.location_header);
            holder.locationAddressTextView = (TextView) listItemView.findViewById(R.id.location_address);
            holder.locationHoursTextView = (TextView) listItemView.findViewById(R.id.location_hours);
            holder.locationPhoneTextView = (TextView) listItemView.findViewById(R.id.location_phone);
            holder.locationImageView = (ImageView) listItemView.findViewById(R.id.image);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }

        Location currentLocation = getItem(position);

        holder.locationsHeaderTextView.setText(currentLocation.getLocationHeader());
        holder.locationAddressTextView.setText(currentLocation.getLocationAddress());
        holder.locationHoursTextView.setText(currentLocation.getLocationHours());
        holder.locationPhoneTextView.setText(currentLocation.getLocationPhone());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this location or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            holder.locationImageView.setImageResource(currentLocation.getImageResourceId());

            // Make sure the view is visible
            holder.locationImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            holder.locationImageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View itemContainer = listItemView.findViewById(R.id.item_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackgroundColorResourceId);
        // Set the background color of the text container View
        itemContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
