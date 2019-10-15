package vk.com.topmobileslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import vk.com.topmobileslist.adapter.PhoneAdapter;
import vk.com.topmobileslist.dataprovider.PhoneDataProvider;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private int[] phone_image_resource = {R.mipmap.honor, R.mipmap.iphone, R.mipmap.mi, R.mipmap.pixel,
                                          R.mipmap.samsung};
    private String[] phone_names;
    private String[] phone_ratings;
    private PhoneDataProvider dataProvider;
    private PhoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.phone_listview);
        phone_names = getResources().getStringArray(R.array.phone_names);
        phone_ratings = getResources().getStringArray(R.array.phone_ratings);
        int resourceIterator=0;
        adapter = new PhoneAdapter(getApplicationContext(), R.layout.phone_custom_list_layout);
        listView.setAdapter(adapter);
        for(int i:phone_image_resource)
        {
            dataProvider = new PhoneDataProvider(i, phone_names[resourceIterator],
                    phone_ratings[resourceIterator]);
            adapter.add(dataProvider);
            resourceIterator=resourceIterator+1;
        }
    }
}
