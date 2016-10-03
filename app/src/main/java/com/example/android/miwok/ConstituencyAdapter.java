package com.example.android.miwok;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by listup-64 on 28/9/16.
 */
public class ConstituencyAdapter extends ArrayAdapter<Constituency> {
    public ConstituencyAdapter(Activity context, ArrayList<Constituency> constituencies){
      super(context,0,constituencies);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        View listItemView = convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Constituency currentConstituency=getItem(position);
        TextView nameTextView= (TextView) listItemView.findViewById(R.id.constituency_text_view);
        nameTextView.setText(currentConstituency.getMName());
      return listItemView;
    }

}
