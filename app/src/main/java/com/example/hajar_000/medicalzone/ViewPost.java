package com.example.hajar_000.medicalzone;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ViewPost extends AppCompatActivity {
    InsertDBAdapter dbAdapter;
    ListView listView;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_post);
        listView = (ListView) findViewById(R.id.viewall_listView);
        dbAdapter = new InsertDBAdapter(getApplicationContext());
        cursor = dbAdapter.getAllValues();
        cursor.moveToFirst();
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);
    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return cursor.getCount();
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
        public View getView(int position, View convertView, ViewGroup parent) {

            cursor.moveToPosition(position);
            View view = getLayoutInflater().inflate(
                    R.layout.custom_listview_item, null);
            TextView textView_name = (TextView) view
                    .findViewById(R.id.custom_textView_post);

            TextView textView_id = (TextView) view
                    .findViewById(R.id.custom_textView_id);
            textView_id.setText("" + cursor.getInt(0));
            textView_name.setText(cursor.getString(1));

            return view;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbAdapter.closeConnection();
    }

}



