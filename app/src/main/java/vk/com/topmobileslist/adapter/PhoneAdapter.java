package vk.com.topmobileslist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import vk.com.topmobileslist.R;
import vk.com.topmobileslist.dataprovider.PhoneDataProvider;

public class PhoneAdapter extends ArrayAdapter {

    List list = new ArrayList();

    static class DataHandler
    {
        ImageView phoneImage;
        TextView phoneName;
        TextView phoneRating;
    }

    public PhoneAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(@Nullable Object object) {
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        DataHandler handler;
        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater) this.getContext()
                                         .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.phone_custom_list_layout, parent, false);
            handler = new DataHandler();
            handler.phoneImage = row.findViewById(R.id.phone_image);
            handler.phoneName = row.findViewById(R.id.phone_name);
            handler.phoneRating = row.findViewById(R.id.phone_rating);
            row.setTag(handler);
        }
        else
            {
               handler=(DataHandler) row.getTag();
            }
        PhoneDataProvider dataProvider;
        dataProvider = (PhoneDataProvider) this.getItem(position);
        handler.phoneImage.setImageResource(dataProvider.getPhoneImage());
        handler.phoneName.setText(dataProvider.getPhoneName());
        handler.phoneRating.setText(dataProvider.getPhoneRating());
        return row;
    }
}
