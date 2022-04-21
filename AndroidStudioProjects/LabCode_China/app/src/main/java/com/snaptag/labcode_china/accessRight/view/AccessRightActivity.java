package com.snaptag.labcode_china.accessRight.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.snaptag.labcode_china.MainActivity;
import com.snaptag.labcode_china.R;
import com.snaptag.labcode_china.accessRight.presenter.AccessRightContract;
import com.snaptag.labcode_china.accessRight.presenter.AccessRightPresenter;

public class AccessRightActivity extends AppCompatActivity implements AccessRightContract.View {

    AccessRightContract.Presenter presenter;
    private final String[] REQUIRE_PERMISSIONS = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private int REQUEST_CODE_PERMISSIONS = 1001;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_right);

        init();
    }

    private void init(){
        presenter = new AccessRightPresenter(this,this);
        imageButton = (ImageButton) findViewById(R.id.button);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.controlCheck();
            }
        });
    }

    @Override
    public void alertCheckRight() {
        //ActivityCompat.shouldShowRequestPermissionRationale(AccessRightActivity.this,"앱을 사용하기 위해 카메라 권한이 필요합니다.");
        ActivityCompat.requestPermissions(this,REQUIRE_PERMISSIONS,REQUEST_CODE_PERMISSIONS);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 1001 && grantResults.length > 0){
            goMain();
        } else {
            Toast.makeText(this, "해당 앱은 카메라 권한이 필요합니다.", Toast.LENGTH_SHORT).show();
            notAllowed();
        }
    }

    @Override
    public void notAllowed() {
        finish();   // 일단 finish
    }

    @Override
    public void goMain() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}