package com.jameel_achive.comingsoon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Department> mData;

    public RecyclerViewAdapter(Context mContext, List<Department> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.depart_item, parent, false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.tv_departName.setText(mData.get(position).getmDepartmentName());
        holder.tv_departDesc.setText(mData.get(position).getmDepartmentInfo());
        holder.img_departImage.setImageResource(mData.get(position).getmImageResourceId());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout item_department;
        private TextView tv_departName;
        private TextView tv_departDesc;
        private ImageView img_departImage;


        public MyViewHolder(View itemView) {
            super(itemView);

            item_department = (LinearLayout) itemView.findViewById(R.id.departList_item_id);
            tv_departName = (TextView) itemView.findViewById(R.id.department_name);
            tv_departDesc = (TextView) itemView.findViewById(R.id.department_description);
            img_departImage = (ImageView) itemView.findViewById(R.id.depart_image);
        }
    }
}
