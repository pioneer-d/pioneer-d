package com.snaptag.labcode_china.navigation.list.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.snaptag.labcode_china.R;
import com.snaptag.labcode_china.api.Get;
import com.snaptag.labcode_china.api.SnaptagAPI;
import com.snaptag.labcode_china.navigation.list.data.ListItemData;
import com.snaptag.labcode_china.navigation.list.fag.BlankFragment;
import com.snaptag.labcode_china.navigation.list.fag.ListFragment;
import com.snaptag.labcode_china.navigation.list.presenter.ListContract;
import com.snaptag.labcode_china.navigation.list.presenter.ListPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ListControlFragment extends Fragment implements ListContract.View {

    ListContract.Presenter presenter;
    View view;

    static String BASEURL = "https://admin.labcode.kr/";

    String image = "test1";
    String genre = "test2";
    String product = "test3";
    String brand = "test4";

    //fragment 종류
    private Fragment blankFragment;
    private Fragment listFragment;

    private static ListControlFragment instance;
    private ListControlFragment() { }

    public static ListControlFragment newInstance(){
        if(instance == null){
            instance = new ListControlFragment();
        }
        Bundle args = new Bundle();

        instance.setArguments(args);
        return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            presenter = new ListPresenter(this);
            init();

        }
    }


    private void init(){
        presenter.controlView();
    }   //-> 여기부터 진행

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_control_list, container, false);
    }

    @Override
    public void goBlank() {
        blankFragment = new BlankFragment();
        getChildFragmentManager().beginTransaction().replace(R.id.list_child_content,blankFragment).commit();
        //addToBackStack 고려해야함.
    }

    @Override
    public void goList(ListItemData itemData) {
        listFragment = new ListFragment();

        image = (itemData.getSourceImage() == null) ? "test" : itemData.getSourceImage();
        genre = (itemData.getProductGenre() == null) ? "test2" : itemData.getProductGenre();
        product = (itemData.getProductName() == null) ? "test3" : itemData.getProductName();
        brand = (itemData.getBrandName() == null) ? "test4" : itemData.getBrandName();


        Bundle bundle = new Bundle();
        bundle.putString("image",image);
        bundle.putString("genre",genre);
        bundle.putString("product",product);
        bundle.putString("brand",brand);
        listFragment.setArguments(bundle);

        getChildFragmentManager().beginTransaction().replace(R.id.list_child_content, listFragment).commit();




    }

    @Override
    public void goDetail() {

    }
}