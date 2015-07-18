package com.vinidsl.improvelayouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Vinicius
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find each view by parent id
        TextView textViewName1 = (TextView) findViewById(R.id.view1).findViewById(R.id.textViewName);
        TextView textViewName2 = (TextView) findViewById(R.id.view2).findViewById(R.id.textViewName);
        TextView textViewName3 = (TextView) findViewById(R.id.view3).findViewById(R.id.textViewName);

        TextView textViewEmail1 = (TextView) findViewById(R.id.view1).findViewById(R.id.textViewEmail);
        TextView textViewEmail2 = (TextView) findViewById(R.id.view2).findViewById(R.id.textViewEmail);
        TextView textViewEmail3 = (TextView) findViewById(R.id.view3).findViewById(R.id.textViewEmail);

        // set the data
        textViewName1.setText("Tony Stark");
        textViewName2.setText("Bruce Banner");
        textViewName3.setText("Peter Parker");
        textViewEmail1.setText("stark@gmail.com");
        textViewEmail2.setText("banner@gmail.com");
        textViewEmail3.setText("peter@gmail.com");
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
