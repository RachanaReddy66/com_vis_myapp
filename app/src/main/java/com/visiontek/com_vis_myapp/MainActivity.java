package com.visiontek.com_vis_myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cloudpos.DeviceException;
import com.cloudpos.POSTerminal;
import com.cloudpos.printer.Format;
import com.cloudpos.printer.PrinterDevice;

public class MainActivity extends AppCompatActivity {
    Button send_bt;
    EditText name_bt,surname_bt;

    Context context;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_bt = findViewById(R.id.sendId);
        name_bt = findViewById(R.id.nameId);
        surname_bt = findViewById(R.id.surnameId);
        context = this;

  /*      if (device == null) {
            try {
                device = (PrinterDevice) POSTerminal.getInstance(context).getDevice("cloudpos.device.printer");

                if (device != null) {
                    device.open();
                } else {
                    // Handle the case when PrinterDevice is null
                    Toast.makeText(context, "Printer device is null", Toast.LENGTH_SHORT).show();
                }
            } catch (DeviceException e) {
                e.printStackTrace();
                // Handle the exception
                Toast.makeText(context, "Error opening printer device", Toast.LENGTH_SHORT).show();
            }
        }*/

        send_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = name_bt.getText().toString();
                String sname = surname_bt.getText().toString();
                Intent intent = new Intent(getApplicationContext(),printActivity.class);
                intent.putExtra("user_name",name);
                intent.putExtra("user_surname",sname);
                startActivity(intent);
           /*     try {
                    Format format = new Format();
                    format.setParameter(Format.FORMAT_ALIGN, Format.FORMAT_ALIGN_LEFT);
                    device.printText("Welcome to Visiontek");
                    device.printText("\n\n\n");
                } catch (DeviceException e) {
                    e.printStackTrace();
                    // Handle the exception
                    Toast.makeText(context, "Error printing text", Toast.LENGTH_SHORT).show();
                }*/

            }
        });
    }


   /* @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            device.close();
        } catch (DeviceException e) {
            e.printStackTrace();
        }
    }*/

}
