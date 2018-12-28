package com.example.six_1228_am;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.six_1228_am.presenter.IHomePresentein;
import com.example.six_1228_am.presenter.IHomePresenter;
import com.example.six_1228_am.view.IHomeListView;

public class MainActivity extends AppCompatActivity implements IHomeListView {

    private TextView textView;
    private IHomePresenter iHomePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text_view);
        //初始化p
        iHomePresenter = new IHomePresenter(this);
        iHomePresenter.getModleData();
    }

    @Override
    public void getViewData(String mViewData) {
     textView.setText(mViewData);
    }
}
