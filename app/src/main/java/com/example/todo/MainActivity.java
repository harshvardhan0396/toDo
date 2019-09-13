package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //private EditText editText;
    //private Button button;
    //private ListView listView;
    //private ArrayList<String> list;
    //private ArrayAdapter<String> adapter;

    EditText e;
    Button b;
    public String s;
    TextView l;
    ArrayList al = new ArrayList();
    ArrayAdapter ad;
    ListView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        e=(EditText) findViewById(R.id.editText);
        l=(TextView)findViewById(R.id.tv);
        v = (ListView)findViewById(R.id.llv);
        ad = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice,al);
        //l.setAdapter(ad);
        Toast.makeText(this, "done..", Toast.LENGTH_SHORT).show();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e.getText().toString();
                l.setText(s);
                al.add(s);
                ad.add(s);
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

    }

}

