package com.example.pratik.fragment_retrofit;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pratik.fragment_retrofit.Model.ListOfShow;
import com.example.pratik.fragment_retrofit.Model.ProgramInfo;

import java.util.List;

/**
 * Created by Pratik on 17-Dec-16.
 */

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    List<ListOfShow> listOfShows;
    ProgramInfo programInfo;

    public CustomBaseAdapter(Context context, List<ListOfShow> items ,ProgramInfo programInfo) {
        this.context = context;
        this.listOfShows = items;
        this.programInfo = programInfo;
    }

    /*private view holder class*/
    private class ViewHolder {
        TextView tv_writer;
        TextView tv_showtime;
        TextView tv_channel;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.tv_channel = (TextView) convertView.findViewById(R.id.tv_channel);
            holder.tv_showtime = (TextView) convertView.findViewById(R.id.tv_showtime);
            holder.tv_writer = (TextView) convertView.findViewById(R.id.tv_writer);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.tv_channel.setText(programInfo.getChannelName());

        ListOfShow listOfShow = (ListOfShow) getItem(position);
        holder.tv_showtime.setText(listOfShow.getShowTime());
        holder.tv_writer.setText(listOfShows.get(position).getShowDetails().getWriter());


        return convertView;
    }

    @Override
    public int getCount() {
        return listOfShows.size();
    }

    @Override
    public Object getItem(int position) {
        return listOfShows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listOfShows.indexOf(getItem(position));
    }
}