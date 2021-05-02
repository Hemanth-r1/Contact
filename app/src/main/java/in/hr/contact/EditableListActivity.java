package in.hr.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class EditableListActivity extends AppCompatActivity {

    //create an instance of the class databasehelper
    DatabaseHelperSQL myDB;
    Button buttonAdd, buttonView;
    EditText editText, editTextName, editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editable_list);

        editText = findViewById(R.id.editText);
        editTextName = findViewById(R.id.editTextName);
        editTextNumber = findViewById(R.id.editTextNumber);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonView = findViewById(R.id.buttonView);
        myDB = new DatabaseHelperSQL(this);

        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditableListActivity.this, ViewListContentsSQL.class);
                startActivity(intent);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newName = editTextName.getText().toString();
                String newNumber = editTextNumber.getText().toString();
                String newText = editText.getText().toString();
                if (editText.length() != 0 && editTextNumber.length() != 0 && editTextName.length() != 0){
                    AddData(newName, newNumber, newText);
                    editText.setText("");
                    editTextName.setText("");
                    editTextNumber.setText("");

                }else {
                    Toast.makeText(EditableListActivity.this, "Enter something in the box", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void AddData(String newName, String newNumber, String newText){
        boolean insertData = myDB.addData(newName, newNumber, newText);

        if (insertData ==true){
            Toast.makeText(EditableListActivity.this, "Successfully Entered DAta",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(EditableListActivity.this, "Successfully not Entered DAta!!!!",Toast.LENGTH_LONG).show();
        }
    }
}