package com.example.recyclerview.smt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.recyclerview.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class Main3Activity extends AppCompatActivity {
    private static final String TAG = "Main3Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("Services");
//        DatabaseReference childRef = mRef.child("Haircut");

//        childRef.push().setValue("SalonB");
//        childRef.push().setValue("SalonC");

//        DatabaseReference nails = mRef.child("Nails");
//        nails.child("sadefadfsa").setValue("SalonD");
//        nails.child("wqrefxccsa").setValue("SalonE");


        DatabaseReference provider = FirebaseDatabase.getInstance().getReference("Providers");
//        Map<String, String> data = new HashMap<>();
//        data.put("Name", "SalonD");
//        data.put("Address","Delhi");
//        data.put("longi","27.48152");
//        data.put("lati","90.2622");
//        provider.child("sadefadfsa").setValue(data);

        DatabaseReference addService = provider.child("sadefadfsa").child("Services");
//        Map<String, String> service = new HashMap<>();
//        service.put("serviceName","Nails");
//        service.put("rate","200");
//        addService.child("Hair").setValue("100");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        String service = intent.getStringExtra("service");
        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("Services").child(service);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value="";
                for(DataSnapshot itemSnapshot: dataSnapshot.getChildren()){
                    value+=itemSnapshot.getValue(String.class);
                    value+=" ";
                }
                Log.d(TAG, "onDataChange: "+ value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
