package com.example.six_1228_am.presenter;

import com.example.six_1228_am.MainActivity;
import com.example.six_1228_am.api.Api;
import com.example.six_1228_am.model.IHomeListModel;
import com.example.six_1228_am.model.IHomeListModelI;

public class IHomePresenter implements IHomePresentein,IHomeListModel.ModelInterface {
   private final IHomeListModel iHomeListModel;
   MainActivity mainActivity;

    public IHomePresenter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        //初始化Model层
        iHomeListModel = new IHomeListModel(this);
    }

    @Override
    public void getModleData() {
     iHomeListModel.getDate(Api.SHOPLIST);
    }

    @Override
    public void succuful(String data) {
    mainActivity.getViewData(data);
    }

    @Override
    public void fail() {
    mainActivity.getViewData("加载失败");
    }
}
