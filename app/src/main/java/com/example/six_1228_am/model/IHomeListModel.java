package com.example.six_1228_am.model;

import com.example.six_1228_am.network.MyTask;

public class IHomeListModel implements IHomeListModelI{
    ModelInterface modelInterface;

    public IHomeListModel(ModelInterface modelInterface) {
        this.modelInterface = modelInterface;
    }

    @Override
    public void getDate(final String url) {
        new Runnable(){

            @Override
            public void run() {
                new MyTask<String>(url,"GET").setTaskListener(new MyTask.TaskListeners() {
                    @Override
                    public void result(String t) {
                        if (t!=null){
                            modelInterface.succuful(t);
                        }else {
                            modelInterface.fail();
                        }
                    }
                }).execute();

            }
        }.run();


    }
    public interface ModelInterface{
        void succuful(String data);
        void fail();
    }
}
