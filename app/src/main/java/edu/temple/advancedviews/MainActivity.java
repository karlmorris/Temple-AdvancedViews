package edu.temple.advancedviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;


public class MainActivity extends Activity {


    Context c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] stringArray = new String[5];

        stringArray[0] = "Blue";
        stringArray[1] = "Yellow";
        stringArray[2] = "Magenta";
        stringArray[3] = "Periwinkle";
        stringArray[4] = "Indigo";

        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this
                ,android.R.layout.simple_dropdown_item_1line
                ,stringArray);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(aa);


        GridView gridView = (GridView) findViewById(R.id.gridView);

        gridView.setNumColumns(3);
        gridView.setAdapter(new MyAdapter(this));






















    }

}
