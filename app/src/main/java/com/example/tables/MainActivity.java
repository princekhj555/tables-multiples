package com.example.tables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showTable(View view)
    {
        EditText numb=(EditText) findViewById(R.id.num_input);
        Editable n= numb.getText();
        long  num = new Long(String.valueOf(n));
        TextView TableView = (TextView) findViewById(R.id.table);
        TableView.setText("");
        for(int i=1;i<=10;i++)
        {
            TableView.append(String.valueOf(num + "  x " + i + "   =  " + num*i+ "\n"));
        }
    }
    public void res(View view)
    {
        TextView TableView = (TextView) findViewById(R.id.table);
        TableView.setText(String.valueOf(""));
    }
}
