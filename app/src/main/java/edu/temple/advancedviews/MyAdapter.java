package edu.temple.advancedviews;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Smart Class on 2/17/2015.
 */
public class MyAdapter extends BaseAdapter {

    Context c;

    public MyAdapter(Context c){
        this.c = c;
    }

    public MyAdapter(Context c, String[] imageUrls){

    }


    @Override
    public int getCount() {
        return 12;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = new FrameLayout(c);

        ImageView imageView = new ImageView(c);
        imageView.setBackgroundResource(R.drawable.ic_launcher);
        ((FrameLayout)convertView).addView(imageView);

        TextView tv = new TextView(c);
        tv.setText(String.valueOf(position + 1));
        tv.setTextSize(25);

        ((FrameLayout)convertView).addView(tv);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });



        return convertView;
    }
}
