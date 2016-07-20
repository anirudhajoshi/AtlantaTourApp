package com.example.android.atlantatourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //implement the onClick method here
    public void onClick(View v) {
        // Perform action on click
        switch(v.getId()) {
            case R.id.atl_attractions:
                // Start the Attractions activity. Create a new intent to open the {@link AtlAttractionsActivity}
                Intent atlAttractionsIntent = new Intent(MainActivity.this, AtlAttractionsActivity.class);
                // Start the new activity
                startActivity(atlAttractionsIntent);
                break;

            case R.id.atl_parks:
                // Start the Parks activity. Create a new intent to open the {@link AtlParksActivity}
                Intent atlparksIntent = new Intent(MainActivity.this, AtlParksActivity.class);
                // Start the new activity
                startActivity(atlparksIntent);
                break;

            case R.id.atl_eats:
                // Start the Eats activity. Create a new intent to open the {@link AtlEatsActivity}
                Intent atleatsIntent = new Intent(MainActivity.this, AtlEatsActivity.class);
                // Start the new activity
                startActivity(atleatsIntent);
                break;

            case R.id.atl_concerts:
                // Start the Concerts activity. Create a new intent to open the {@link AtlConcertsActivity}
                Intent atlconcertsIntent = new Intent(MainActivity.this, AtlConcertsActivity.class);
                // Start the new activity
                startActivity(atlconcertsIntent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewAttractions = (TextView) findViewById(R.id.atl_attractions);
        viewAttractions.setOnClickListener(this);

        TextView viewParks = (TextView) findViewById(R.id.atl_parks);
        viewParks.setOnClickListener(this);

        TextView viewEats = (TextView) findViewById(R.id.atl_eats);
        viewEats.setOnClickListener(this);

        TextView viewConcerts = (TextView) findViewById(R.id.atl_concerts);
        viewConcerts.setOnClickListener(this);
    }

    /* - This works -
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows Atlanta locations
        TextView atl_locations = (TextView) findViewById(R.id.atl_locations);

        // Set a click listener on that View
        atl_locations.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Atlanta locations is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AtlAttractionsActivity}
                Intent atlLocationsIntent = new Intent(MainActivity.this, AtlAttractionsActivity.class);

                // Start the new activity
                startActivity(atlLocationsIntent);
            }
        });

        // Find the View that shows Atlanta parks
        TextView atl_parks = (TextView) findViewById(R.id.atl_parks);

        // Set a click listener on that View
        atl_parks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Atlanta Parks is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AtlParksActivity}
                Intent atlparksIntent = new Intent(MainActivity.this, AtlParksActivity.class);

                // Start the new activity
                startActivity(atlparksIntent);
            }
        });

        // Find the View that shows the Atlanta Eats view is clicked on
        TextView atl_eats = (TextView) findViewById(R.id.atl_eats);

        // Set a click listener on that View
        atl_eats.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the AtlEatsActivity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AtlEatsActivity}
                Intent atleatsIntent = new Intent(MainActivity.this, AtlEatsActivity.class);

                // Start the new activity
                startActivity(atleatsIntent);
            }
        });

        // Find the View that shows Atlanta concerts
        TextView atl_concerts = (TextView) findViewById(R.id.atl_concerts);

        // Set a click listener on that View
        atl_concerts.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the AtlConcertsActivity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AtlConcertsActivity}
                Intent atlconcertsIntent = new Intent(MainActivity.this, AtlConcertsActivity.class);

                // Start the new activity
                startActivity(atlconcertsIntent);
            }
        });
    }
    - This works - */
}
