package in.hr.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.fab);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditableListActivity.class);
                startActivity(intent);
            }
        });


        ListView listView = findViewById(R.id.listView);
        // create the person objects
        Person john = new Person("John", "123456789", "someone");
        Person john1 = new Person("John1", "123456789", "someone");
        Person john2 = new Person("John2", "123456789", "someone");
        Person john3 = new Person("John3", "123456789", "someone");
        Person john4 = new Person("John4", "123456789", "someone");
        Person john5 = new Person("John5", "123456789", "someone");
        Person john6 = new Person("John6", "123456789", "someone");
        Person john7 = new Person("John7", "123456789", "someone");
        Person john8 = new Person("John8", "123456789", "someone");
        Person john9 = new Person("John9", "123456789", "someone");
        Person john10 = new Person("John10", "123456789", "someone");
        Person john11 = new Person("John11", "123456789", "someone");
        Person john12 = new Person("John12", "123456789", "someone");
        Person john13 = new Person("John13", "123456789", "someone");
        Person john14 = new Person("John14", "123456789", "someone");
        Person john15 = new Person("John15", "123456789", "someone");
        Person john16 = new Person("John16", "123456789", "someone");
        Person john17 = new Person("John17", "123456789", "someone");
        Person john18 = new Person("John18", "123456789", "someone");
        Person john19 = new Person("John19", "123456789", "someone");

        // add the persons to array list of type people
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(john);
        personArrayList.add(john1);
        personArrayList.add(john2);
        personArrayList.add(john3);
        personArrayList.add(john4);
        personArrayList.add(john5);
        personArrayList.add(john6);
        personArrayList.add(john7);
        personArrayList.add(john8);
        personArrayList.add(john9);
        personArrayList.add(john10);
        personArrayList.add(john11);
        personArrayList.add(john12);
        personArrayList.add(john13);
        personArrayList.add(john14);
        personArrayList.add(john15);
        personArrayList.add(john16);
        personArrayList.add(john17);
        personArrayList.add(john18);
        personArrayList.add(john19);

        //create and set new adapter of type personListAdapter
        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_list_view_layout, personArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(view, "working", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}