package org.tensorflow.demo;

import android.app.Activity;
import android.Manifest;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.Image.Plane;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Size;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.List;

import org.tensorflow.demo.env.ImageUtils;
import org.tensorflow.demo.env.Logger;
import org.tensorflow.demo.R; // Explicit import needed for internal Google builds.

public class ChoixActivity extends Activity {
    Button mButton1 = null;
    Button mButton2 = null;
    Button mButton3 = null;
    List<Integer> valeursDetectees = BlackJackActivity.getValeursDetectees();
    String choix = BlackJackActivity.ChoixConseil(BlackJackActivity.sommeMain(valeursDetectees),BlackJackActivity.carteDealer);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choix_action);
        addListenerOnButton();}
    public void addListenerOnButton(){
        final Context context = this;
        mButton1 = findViewById(R.id.arreter);
        mButton2 = findViewById(R.id.tirer);
        mButton3 = findViewById(R.id.doubler);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,HomeActivity.class);
                startActivity(intent);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetectorActivity.class);
                startActivity(intent);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,HomeActivity.class);
                startActivity(intent)}
        });
    }

}
