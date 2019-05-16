package com.example.cjcu.a123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Spinner sp_fruit;
    String[] fruit = {"apple","banana","奇異果","AAA","BBB"};
    private EditText ed_fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        ed_fruit = (EditText) findViewById(R.id.ed_fruit);
        sp_fruit = findViewById(R.id.sp_fruit);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruit);
        ArrayAdapter adapter1= ArrayAdapter.createFromResource(this,R.array.fruit_array,android.R.layout.simple_dropdown_item_1line);
        sp_fruit.setAdapter(adapter1);

        sp_fruit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ed_fruit.setText(sp_fruit.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
