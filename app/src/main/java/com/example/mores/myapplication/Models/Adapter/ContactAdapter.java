package com.example.mores.myapplication.Models.Adapter;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mores.myapplication.Models.Contact;
import com.example.mores.myapplication.R;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Viewholder>{
   private List<Contact> mContact;

   public ContactAdapter(List<Contact>mContact){
       this.mContact = mContact;
   }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context=viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_contact,viewGroup,false);

        Viewholder viewholder = new Viewholder(contactView);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
    Contact itemContact = mContact.get(i);
    TextView textView = viewholder.nametextView;
    textView.setText(itemContact.getName());

    Button buttoncontact = viewholder.messageButton;
    buttoncontact.setText(itemContact.isOnline()?"Message":"Offline");
    buttoncontact.setEnabled(itemContact.isOnline());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
       private TextView nametextView;
       private Button messageButton;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            nametextView = itemView.findViewById(R.id.contact_name);
            messageButton = itemView.findViewById(R.id.message_button);
        }
    }
}
