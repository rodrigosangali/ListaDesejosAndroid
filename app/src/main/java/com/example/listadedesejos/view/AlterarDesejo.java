package com.example.listadedesejos.view;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class AlterarDesejo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "alterar desejo", Toast.LENGTH_SHORT).show();
    }
}
