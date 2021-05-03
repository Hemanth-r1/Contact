package in.hr.contact;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewListContentsSQL extends AppCompatActivity {

    DatabaseHelperSQL myDB;
    TextView textViewSQL, textViewNameSQL, textViewNumberSQL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_contents_layout_sql);
        textViewSQL = findViewById(R.id.textViewSQL);
        textViewNameSQL = findViewById(R.id.textViewNameSQL);
        textViewNumberSQL = findViewById(R.id.textViewNumberSQL);

        ListView listView = findViewById(R.id.lisViewSQl);
        myDB = new DatabaseHelperSQL(this);

        ArrayList<String> theList = new ArrayList<>();
        Cursor data1 = myDB.getListContents();
        Cursor data2 = myDB.getListContents();
        Cursor data3 = myDB.getListContents();

        if (data1.getCount() == 0) {
            Toast.makeText(ViewListContentsSQL.this, "the database is empty", Toast.LENGTH_LONG).show();
        } else {
            while (data1.moveToNext() && data2.moveToNext() && data3.moveToNext()) {

                /*
           theList.add(1, data.getString(1));
           theList.add(2, data.getString(2));
           theList.add(3, data.getString(3));
                //TODO only showing a single text view here and layout is android.R.layout.simple_list_item_1, need to change it
                 */

                theList.add(data1.getString(1));
                theList.add(data2.getString(2));
                theList.add(data3.getString(3));


                 //ViewListAdapterSQL listAdapter = new ViewListAdapterSQL(this, R.layout.list_item_view_sql, theList);
                //ListAdapter listAdapter = new ArrayAdapter<>(this, R.layout.list_item_view_sql, theList);
                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList);
                listView.setAdapter(listAdapter);
            }
        }
    }
}
