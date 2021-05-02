package in.hr.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ViewListAdapterSQL extends ArrayAdapter<ListGetSet> {

    private  Context sqlContext;
    int sqlResources;

    public ViewListAdapterSQL(@NonNull Context context, int resource, @NonNull ArrayList list) {
        super(context, resource, list);
        sqlContext = context;
        sqlResources = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertViewSQL, @NonNull ViewGroup parent) {
        // using getter and setter here to get the value from the Person class
        String nameSQL = getItem(position).getTextNameSQL();
        String numberSQL = getItem(position).getTextNumberSQL();
        String textSQL = getItem(position).getTextViewSQL();

        //Create the person object using the information
        ListGetSet listGetSet = new ListGetSet(nameSQL, numberSQL, textSQL);

        LayoutInflater layoutInflater = LayoutInflater.from(sqlContext);
        convertViewSQL = layoutInflater.inflate(sqlResources, parent, false);

        TextView textViewNameSQL = convertViewSQL.findViewById(R.id.textViewNameSQL);
        TextView textViewNumberSQL = convertViewSQL.findViewById(R.id.textViewNumberSQL);
        TextView textViewSQL = convertViewSQL.findViewById(R.id.textViewSQL);

        textViewNameSQL.setText(nameSQL);
        textViewNumberSQL.setText(numberSQL);
        textViewSQL.setText(textSQL);

        return  convertViewSQL;
    }
}
