package com.example.android.atlantatourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AtlAttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atlanta_attractions);

        setTitle(R.string.atl_attractions);

        ArrayList<Location> attractions = new ArrayList<Location>();
        attractions.add(new Location(getString(R.string.atl_attractions_stonemountain),
                getString(R.string.atl_attractions_stonemountain_address),
                getString(R.string.atl_attractions_stonemountain_hours),
                getString(R.string.atl_attractions_stonemountain_phone)));

        attractions.add(new Location(getString(R.string.atl_attractions_ahc),
                getString(R.string.atl_attractions_ahc_address),
                getString(R.string.atl_attractions_ahc_hours),
                getString(R.string.atl_attractions_ahc_phone),
                R.drawable.ahcvisit));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(this, attractions, R.color.atl_attractions);

        // Find the  view ID called attractions_list, which is declared in the attractions_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.atlattractionslist);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);
    }
}
