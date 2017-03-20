package com.example.pc.studentinfosql.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pc.studentinfosql.R;

public class ContactDtails extends AppCompatActivity {
    TextView name,des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_dtails_layout);
        int_find();
        onclick();
        
    }
    private void int_find() {
        name=(TextView)findViewById(R.id.contact_name);
        des=(TextView)findViewById(R.id.contact_mobile);
        name.setText("Name : "+getIntent().getStringExtra("name"));
    }

    private void onclick() {

    }


}
