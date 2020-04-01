package com.example.recyclerview.smt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.recyclerview.R;
import com.example.recyclerview.RecyclerAdapter;

import java.util.ArrayList;


public class BookingActivity extends AppCompatActivity {

    private static final String TAG = "BookingActivity";

    RecyclerViewAdapter adapter;
    ArrayList<Service> serviceArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        serviceArrayList = new ArrayList<>();

        initData();
        initRecyclerView2();
    }

    private void initData(){
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52",
                "https://i.redd.it/tpsnoz5bzo501.jpg","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","" +
                "https://seeklogo.com/images/S/salon-logo-573CEE0E3B-seeklogo.com.jpg","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
        serviceArrayList.add(new Service("Hair Cut","120","Man","5","12.52","","SalonA"));
    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init RecyclerView");
        RecyclerView recyclerView = findViewById(R.id.recycler_view3);
        adapter = new RecyclerViewAdapter(this,serviceArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
