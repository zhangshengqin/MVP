package test.baway.com.mvp.presenter;

import java.util.List;

import test.baway.com.mvp.bean.MyBean;
import test.baway.com.mvp.model.MyModel;
import test.baway.com.mvp.model.MyModelInfo;
import test.baway.com.mvp.model.RequsetListener;
import test.baway.com.mvp.view.MyViewInfo;

/**
 * Created by 额头发 on 2017/11/7.
 */

public class MyPresenter {
    MyViewInfo myViewInfo;
    MyModelInfo myModelInfo;

    public MyPresenter(MyViewInfo myViewInfo) {
        this.myViewInfo = myViewInfo;
        myModelInfo = new MyModel();
    }

    public void getSuccess(String url){
        myModelInfo.RequestSuccess(url, new RequsetListener() {
            @Override
            public void onSuccess(List<MyBean.SongListBean> list) {
                myViewInfo.showSuccess(list);
            }

            @Override
            public void onError(String r) {
                myViewInfo.failError(r);
            }
        });
    }
}
