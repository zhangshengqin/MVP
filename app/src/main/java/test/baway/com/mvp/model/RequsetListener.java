package test.baway.com.mvp.model;

import java.util.List;

import test.baway.com.mvp.bean.MyBean;

/**
 * Created by 额头发 on 2017/11/7.
 */

public interface RequsetListener {
    void onSuccess(List<MyBean.SongListBean> list);
    void onError(String r);
}
