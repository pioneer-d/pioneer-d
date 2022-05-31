package com.snaptag.labcode_china.accessRight.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.snaptag.labcode_china.BuildConfig;
import com.snaptag.labcode_china.main.view.MainActivity;
import com.snaptag.labcode_china.R;
import com.snaptag.labcode_china.accessRight.presenter.AccessRightContract;
import com.snaptag.labcode_china.accessRight.presenter.AccessRightPresenter;

public class AccessRightActivity extends AppCompatActivity implements AccessRightContract.View {

    AccessRightContract.Presenter presenter;
    private final String[] REQUIRE_PERMISSIONS_1 = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private final String[] REQUIRE_PERMISSIONS_2 = new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION};
    private int REQUEST_CODE_PERMISSIONS = 1001;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_right);
        init();
    }

    private void init(){
        presenter = new AccessRightPresenter(this,this, this);
        imageButton = (ImageButton) findViewById(R.id.button);
        if (presenter.checkPermission()){
            goMain();
        }
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                permissionCheck();
            }
        });
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (presenter.checkPermission()){
            goMain();
        } else {
            notAllowed();
        }

    }

    @Override
    public void notAllowed() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        intent.setData(Uri.parse("package:" + BuildConfig.APPLICATION_ID));
        startActivity(intent);
        Toast.makeText(this, R.string.txt_camera_location_right, Toast.LENGTH_SHORT).show();
        finish();   // 일단 finish
    }

    @Override
    public void goMain() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }


    private void permissionCheck(){
        // SDK 23버전 이하 버전에서는 Permission이 필요하지 않음
        if(Build.VERSION.SDK_INT >= 23){
            // 권한 체크한 후에 리턴이 false로 들어온다면
            if (!presenter.checkPermission()){
                // 권한 요청
                presenter.requestPermission();
            }
        }
    }
}