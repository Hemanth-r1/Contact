package in.hr.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private  Context mContext;
    int mResources;

    public PersonListAdapter(@NonNull Context context, int resource, @NonNull List<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResources = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // using getter and setter here to get the value from the Person class
        String name = getItem(position).getName();
        String number = getItem(position).getNumber();
        String text = getItem(position).getText();

        //Create the person object using the information
        Person person = new Person(name, number, text);

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResources, parent, false);

        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewNumber = convertView.findViewById(R.id.textViewNumber);
        TextView textView = convertView.findViewById(R.id.textView);

        textViewName.setText(name);
        textViewNumber.setText(number);
        textView.setText(text);

        return  convertView;
    }
}
