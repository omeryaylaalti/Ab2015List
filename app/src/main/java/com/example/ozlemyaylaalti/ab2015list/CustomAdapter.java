package com.example.ozlemyaylaalti.ab2015list;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<CharSequence>{
    CharSequence[] list;


    public CustomAdapter(Context context, int resource, CharSequence[] objects) {

        super(context, resource, objects);
        this.list = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView= inflater.inflate(R.layout.custom_row,null);

        }

        ((TextView)convertView.findViewById(R.id.twIndex))
                .setText(String.valueOf(position+1));

        ((TextView)convertView.findViewById(R.id.twCıty))
                .setText(list[position]);

        return convertView;
    }
}
