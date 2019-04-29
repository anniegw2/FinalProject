package com.example.finalproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("deprecation")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set activity_main on current screen
        setContentView(R.layout.activity_main);

        final News[] myNews = {new News()};
        final Tasks myTasks = new Tasks();

        DatePicker simpleDatePicker = findViewById(R.id.simpleDatePicker); // initiate a date picker
        simpleDatePicker.setCalendarViewShown(false); // set false value for the calendar shown function

        Button event = findViewById(R.id.majorEvent);
        Button birth = findViewById(R.id.births);
        Button death = findViewById(R.id.deaths);
        Button search = findViewById(R.id.search);


        int day = simpleDatePicker.getDayOfMonth();
        int month = simpleDatePicker.getMonth();

        search.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.content_main);
            }
        });

        event.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.content_main);
            }
        });

        birth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.content_main);
            }
        });

        death.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.content_main);
            }
        });


        search.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                myNews[0] = myTasks.doInBackground();
                System.out.println(myNews);
                setContentView(R.layout.results_main);
            }
        });

        //populateListView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
