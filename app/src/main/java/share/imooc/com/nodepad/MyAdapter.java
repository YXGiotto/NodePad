package share.imooc.com.nodepad;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus- on 2017/5/2.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Message>dataList;
    public MyAdapter(List<Message>dataList){
        this.dataList=dataList;
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
          Message msg=dataList.get(position);
        holder.tvTime.setText(msg.getTime());
        holder.tvContent.setText(msg.getContent());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
       TextView tvContent;
        TextView tvTime;
        public ViewHolder(View itemView) {
            super(itemView);
            tvContent= (TextView) itemView.findViewById(R.id.tv_content);
            tvTime= (TextView) itemView.findViewById(R.id.tv_time);
        }
    }
}
