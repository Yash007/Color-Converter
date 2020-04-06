package com.colorconverter.yash;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.colorconverter.yash.databinding.ActivityMainBinding;

/**
 * Project Name: Color Code Converter
 * Created By: Yash Sompura
 * License: MIT Licence
 * Contact: sompurayash@live.com
 * File information: MainActivity.java file is main Home Screen Backend file.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //ViewBinding declaration
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //ViewBinding initialization
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.hexButton.setOnClickListener(this);
        binding.rgbButton.setOnClickListener(this);
        binding.pmsButton.setOnClickListener(this);
        binding.cmykButton.setOnClickListener(this);
        binding.hslButton.setOnClickListener(this);
        binding.ralButton.setOnClickListener(this);
        binding.sampleCodesButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ConverterActivity.class);
        switch (view.getId())   {
            case R.id.hexButton:
                intent.putExtra("SOURCE", "HEX");
                startActivity(intent);
                break;
            case R.id.rgbButton:
                intent.putExtra("SOURCE", "RGB");
                startActivity(intent);
                break;
            case R.id.pmsButton:
                intent.putExtra("SOURCE", "PMS");
                startActivity(intent);
                break;
            case R.id.cmykButton:
                intent.putExtra("SOURCE", "CMYK");
                startActivity(intent);
                break;
            case R.id.hslButton:
                intent.putExtra("SOURCE", "HSL");
                startActivity(intent);
                break;
            case R.id.ralButton:
                intent.putExtra("SOURCE", "RAL");
                startActivity(intent);
                break;
        }
    }
}
