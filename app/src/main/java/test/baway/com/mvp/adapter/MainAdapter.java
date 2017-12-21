package test.baway.com.mvp.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import test.baway.com.mvp.R;
import test.baway.com.mvp.bean.MyBean;

/**
 * Created by 额头发 on 2017/11/7.
 */

public class MainAdapter extends RecyclerView.Adapter{

    private View view;
    List<MyBean.SongListBean> list;
    private MyViewHolder myViewHolder;

    public MainAdapter(List<MyBean.SongListBean> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        myViewHolder = (MyViewHolder) holder;
        MyBean.SongListBean listBean = list.get(position);
        myViewHolder.tv.setText(listBean.getTitle());
        Uri uri = Uri.parse(listBean.getPic_big());
        myViewHolder.draw.setImageURI(uri);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView draw;
        private final TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            draw = itemView.findViewById(R.id.draw);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
