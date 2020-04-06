package com.colorconverter.yash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.colorconverter.yash.databinding.ActivityConverterBinding;
import com.colorconverter.yash.databinding.ActivityMainBinding;


/**
 * Project Name: Color Code Converter
 * Created By: Yash Sompura
 * License: MIT Licence
 * Contact: sompurayash@live.com
 * File information: ConverterActivity.java file is the ConverterActivity Backend file.
 */

public class ConverterActivity extends AppCompatActivity {

    //ViewBinding declaration
    private ActivityConverterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ViewBinding initialization
        binding = ActivityConverterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String converterSource = getIntent().getExtras().getString("SOURCE","HEX");

    }
}