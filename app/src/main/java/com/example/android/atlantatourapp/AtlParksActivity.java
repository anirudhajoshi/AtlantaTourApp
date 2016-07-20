package com.example.android.atlantatourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AtlParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atl_parks);

        setTitle(R.string.atl_parks);

        ArrayList<Location> parks = new ArrayList<Location>();
        parks.add(new Location(getString(R.string.atl_parks_southbend),
                getString(R.string.atl_parks_southbend_address),
                getString(R.string.atl_parks_southbend_hours),
                getString(R.string.atl_parks_southbend_phone)));

        parks.add(new Location(getString(R.string.atl_parks_olympic),
                getString(R.string.atl_parks_olympic_address),
                getString(R.string.atl_parks_olympic_hours),
                getString(R.string.atl_parks_olympic_phone)));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, parks, R.color.atl_parks);

        // Find the  view ID called locations_list, which is declared in the locations_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.atlparkslist);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
