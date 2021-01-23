package com.example.facedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.switchmaterial.SwitchMaterial;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.camTypeSwitch)
    SwitchMaterial camTypeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}