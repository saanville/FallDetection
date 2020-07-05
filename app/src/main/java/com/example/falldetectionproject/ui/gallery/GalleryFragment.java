package com.example.falldetectionproject.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.falldetectionproject.MainActivity;
import com.example.falldetectionproject.R;
import com.example.falldetectionproject.ui.home.HomeFragment;

public class GalleryFragment extends Fragment{

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        //final TextView textView = root.findViewById(R.id.text_gallery);
        final Button goButton = root.findViewById(R.id.goButton);
        final EditText regPhoneNo = root.findViewById(R.id.reg_phoneNo);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final String phone = regPhoneNo.getText().toString();
                Toast toast = Toast.makeText(v.getContext(), phone, Toast.LENGTH_SHORT);
                toast.show();
                //Intent i = new Intent(GalleryFragment.class, HomeFragment.class);
                //startActivity(i);
            }
        });

        /*galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}