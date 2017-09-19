package com.example.hajar_000.medicalzone;

import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class GridAdapter extends BaseAdapter {

    private ArrayList<String> listPharmacy;
    private ArrayList<Integer> listIcon;
    private Activity activity;

    public GridAdapter(Activity activity, ArrayList<String> listPharmacy, ArrayList<Integer> listIcon) {
        super();
        this.listPharmacy = listPharmacy;
        this.listIcon = listIcon;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listPharmacy.size();
    }

    @Override
    public String getItem(int position) {
        // TODO Auto-generated method stub
        return listPharmacy.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder {
        public ImageView imgViewIcon;
        public TextView txtViewTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if (convertView == null) {
            view = new ViewHolder();
            convertView = inflator.inflate(R.layout.activity_grid_adapter, null);

            view.txtViewTitle = (TextView) convertView.findViewById(R.id.textView);
            view.imgViewIcon = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(view);
        } else {
            view = (ViewHolder) convertView.getTag();
        }

        view.txtViewTitle.setText(listPharmacy.get(position));
        view.imgViewIcon.setImageResource(listIcon.get(position));

        return convertView;
    }
}