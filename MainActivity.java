package it.univaq.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FragList.ItemSelected {

    TextView detail;
    ArrayList<String> descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detail = findViewById(R.id.tvdescription);

        descriptions = new ArrayList<>();
        descriptions.add("Description item 1");
        descriptions.add("Description item 2");
        descriptions.add("Description item 3");


    }


    @Override
    public void onItemSelected(int index) {
        detail.setText(descriptions.get(index));
    }
}