package test.baway.com.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.List;

import butterknife.BindView;
import test.baway.com.mvp.adapter.MainAdapter;
import test.baway.com.mvp.app.Api;
import test.baway.com.mvp.bean.MyBean;
import test.baway.com.mvp.presenter.MyPresenter;
import test.baway.com.mvp.view.MyViewInfo;


public class MainActivity extends AppCompatActivity implements MyViewInfo{


    Button btn;
    private RecyclerView rlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rlv = (RecyclerView) findViewById(R.id.rlv);

        MyPresenter myPresenter = new MyPresenter(this);
        myPresenter.getSuccess(Api.PATH);
    }

    @Override
    public void showSuccess(List<MyBean.SongListBean> list) {

        rlv.setLayoutManager(new LinearLayoutManager(this));
        rlv.setAdapter(new MainAdapter(list));
    }

    @Override
    public void failError(String msg) {

    }
}
