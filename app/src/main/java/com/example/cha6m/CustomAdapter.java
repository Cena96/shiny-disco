package com.example.cha6m.developers;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    List<rowitem> mRowItems;

    public CustomAdapter(Context context,List<rowitem> rowItems){
        mContext=context;
        mRowItems=rowItems;
    }
    @Override
    public int getCount() {
        return mRowItems.size();
    }

    @Override
    public Object getItem(int i) {
        return mRowItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mRowItems.indexOf(i);
    }


    private class ViewHolder{
        ImageButton mcall;
        TextView developer;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;

        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView=inflater.inflate(R.layout.listactivity,null);
            holder=new ViewHolder();
            holder.developer=convertView.findViewById(R.id.text);
            holder.mcall=convertView.findViewById(R.id.imageButton);

            rowitem row_pos=mRowItems.get(position);
            holder.mcall.setImageResource(R.drawable.call);
            holder.developer.setText(row_pos.getDeveloper_name());
            convertView.setTag(holder);

        }
        else{
            holder=(ViewHolder)convertView.getTag();
        }
        return convertView;
    }
}
