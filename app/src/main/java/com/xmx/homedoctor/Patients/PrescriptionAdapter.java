package com.xmx.homedoctor.Patients;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.xmx.homedoctor.Constants;
import com.xmx.homedoctor.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by The_onE on 2016/4/2.
 */
public class PrescriptionAdapter extends BaseAdapter {
    Context mContext;
    List<Prescription> mPrescriptions;

    PrescriptionAdapter(Context context, List<Prescription> record) {
        mContext = context;
        mPrescriptions = record;
    }

    @Override
    public int getCount() {
        return mPrescriptions.size();
    }

    @Override
    public Object getItem(int i) {
        return mPrescriptions.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mPrescriptions.get(i).getId();
    }

    static class ViewHolder {
        TextView title;
        TextView text;
        TextView suggestion;
        TextView time;
        CardView card;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_prescription, null);
            holder = new ViewHolder();
            holder.title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.text = (TextView) convertView.findViewById(R.id.tv_text);
            holder.suggestion = (TextView) convertView.findViewById(R.id.tv_suggestion);
            holder.time = (TextView) convertView.findViewById(R.id.tv_time);
            holder.card = (CardView) convertView.findViewById(R.id.record_card);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if (position < mPrescriptions.size()) {
            Prescription record = mPrescriptions.get(position);
            String title = record.getTitle();
            String text = record.getText();
            String suggestion = record.getSuggestion();
            Date time = record.getTime();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

            holder.title.setText(title);
            holder.text.setText(text);
            holder.suggestion.setText(suggestion);
            holder.time.setText(df.format(time));
            int type = record.getType();
            int bg = Color.GRAY;
            switch (type) {
                case Constants.GOOD_TYPE:
                    bg = Color.GREEN;
                    break;
                case Constants.HIGH_TYPE:
                    bg = Color.BLUE;
                    break;
                case Constants.HIGHEST_TYPE:
                    bg = Color.RED;
                    break;
            }
            holder.card.setCardBackgroundColor(bg);
        } else {
            holder.title.setText("加载失败");
        }

        return convertView;
    }
}
