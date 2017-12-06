package com.example.ui_functional_prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.Result;

import com.google.zxing.client.android.Intents;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.io.IOException;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

import static android.Manifest.permission.CAMERA;

public class MainActivity extends AppCompatActivity{
    View barcodeResult;
    private static final int MY_CAMERA_PERMISSON = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        scanBarcode(barcodeResult);
    }

    @Override
    public void onResume() {
        super.onResume(); AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("No Valid QR Code Detected");
        builder.setPositiveButton("Scan Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                scanBarcode(barcodeResult);
            }
        });
        AlertDialog alert1 = builder.create();
        alert1.show();
    }
    public void scanBarcode(View v){
        Intent intent = new Intent(this, barcodescanner.class);
        startActivityForResult(intent, 0 );
    }

    @Override
    protected void onActivityResult(int requestCode , int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0){
            if(resultCode == CommonStatusCodes.SUCCESS){
                if(data!= null){
                    Barcode barcode = data.getParcelableExtra("barcode");
                    if(barcode.displayValue.equals("aaa")){
                        Intent intent = new Intent(this, MainMenu.class);
                        startActivity(intent);
                    }
                }
            }
        }
    }
}
