package test.baway.com.mvp.view;

import java.util.List;

import test.baway.com.mvp.bean.MyBean;

/**
 * Created by 额头发 on 2017/11/7.
 */

public interface MyViewInfo {
    void showSuccess(List<MyBean.SongListBean> list);
    void failError(String msg);
}
