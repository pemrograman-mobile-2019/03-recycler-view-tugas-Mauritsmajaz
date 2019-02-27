package com.example.mores.myapplication;

import android.graphics.drawable.DrawableContainer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mores.myapplication.Models.Adapter.ContactAdapter;
import com.example.mores.myapplication.Models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rvContact);
        contacts = Contact.createContactsList( 10);
        ContactAdapter contactAdapter = new ContactAdapter(contacts);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);
    }
}
