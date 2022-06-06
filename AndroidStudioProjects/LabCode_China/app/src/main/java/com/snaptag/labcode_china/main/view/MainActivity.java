package com.snaptag.labcode_china.main.view;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.snaptag.labcode_china.R;
import com.snaptag.labcode_china.main.presenter.MainContract;
import com.snaptag.labcode_china.main.presenter.MainPresenter;
import com.snaptag.labcode_china.navigation.more.view.MoreControlFragment;
import com.snaptag.labcode_china.navigation.list.view.ListControlFragment;
import com.snaptag.labcode_china.navigation.scan.page.ScanSuccessActivity;
import com.snaptag.labcode_china.navigation.scan.view.ScanControlFragment;
import com.snaptag.labcode_china.network.NetworkConfirm;


public class MainActivity extends AppCompatActivity implements MainContract.View {

    static String thisName = "MainActivity";

    private Fragment scanControlFragment, listControlFragment, moreControlFragment;
    private MainContract.Presenter presenter;
    private ScanSuccessActivity scanSuccessActivity;
    NetworkConfirm confirm = NetworkConfirm.getInstance();

    private FrameLayout frameLayout;
    private BottomNavigationView bottomNavigationView;
    private TextView textView;

    private String fragmentFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(thisName,"onCreate() 실행");

        Intent intent = getIntent(); //이 액티비티를 부른 인텐트를 받는다.
        fragmentFlag = intent.getStringExtra("FRAGMENT_FLAG");
        if (fragmentFlag == null){
            fragmentFlag = "callScan";
        }

        init();
    }

    private void init() {

        Log.d(thisName,"init() 실행");

        presenter = new MainPresenter(this);

        scanControlFragment = ScanControlFragment.newInstance();
        listControlFragment = ListControlFragment.newInstance();
        moreControlFragment = MoreControlFragment.newInstance();

        textView = findViewById(R.id.topTitle);
        frameLayout = findViewById(R.id.main_content);      //fragment 변경될 공간
        bottomNavigationView = findViewById(R.id.bottom_nav);

        if (fragmentFlag.equals("callScan")){
            Log.d(thisName,"init() 내부 fragmentFlag가 scan일 경우");
            callScan();
        } else if (fragmentFlag.equals("callList")){
            callList();
        }else if (fragmentFlag.equals("callMore")){
            callMore();
        }

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                presenter.controlNavigation(item.getItemId(),MainActivity.this);
                if (item.getItemId() == R.id.page_scan) {fragmentFlag = "callScan";}
                else if (item.getItemId() == R.id.page_list) {fragmentFlag = "callList";}
                else if (item.getItemId() == R.id.page_more) {fragmentFlag = "callMore";}
                return true;
            }
        });
    }


    @Override
    public void networkError() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_network_alert);
        dialog.setCancelable(false);

        TextView agree = dialog.findViewById(R.id.alert_tv_button);
        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(confirm.confirmNetwork(MainActivity.this)){
                    dialog.dismiss();
                    init();
                } else {
                    dialog.dismiss();
                    networkError();
                }
            }
        });
        dialog.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(thisName,"onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(thisName,"onResume()");
    }

    @Override
    public void callScan() {
        Log.d(thisName, "callScan()");
        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, scanControlFragment).commit();
        textView.setText("");
    }

    @Override
    public void callList() {
        Log.d(thisName,"callList()");
        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, listControlFragment).commit();
        textView.setText(R.string.txt_list);
    }

    @Override
    public void callMore() {
        Log.d(thisName,"callMore()");
        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, moreControlFragment).commit();
        textView.setText(R.string.txt_more);
    }


}