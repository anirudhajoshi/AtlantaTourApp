package com.example.android.atlantatourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AtlConcertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atl_concerts);

        setTitle(R.string.atl_concerts);

        ArrayList<Location> eats = new ArrayList<Location>();
        eats.add(new Location(getString(R.string.atl_concerts_snoop),
                getString(R.string.atl_concerts_snoop_address),
                getString(R.string.atl_concerts_snoop_hours),
                getString(R.string.atl_concerts_snoop_phone)));

        eats.add(new Location(getString(R.string.atl_concerts_crows),
                getString(R.string.atl_concerts_crows_address),
                getString(R.string.atl_concerts_crows_hours),
                getString(R.string.atl_concerts_crows_phone)));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, eats, R.color.atl_concerts);

        // Find the  view ID called locations_list, which is declared in the locations_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.atlconcertslist);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
