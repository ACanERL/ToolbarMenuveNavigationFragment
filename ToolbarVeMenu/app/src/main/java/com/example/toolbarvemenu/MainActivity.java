package com.example.toolbarvemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toolbarvemenu.Fragments.TakvimFragment;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity  {
  Toolbar toolbar;
  NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Dashboard");
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater menuInflater=getMenuInflater();
       menuInflater.inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.takvim){
            TakvimFragment takvimFragment=new TakvimFragment();

            navController=Navigation.findNavController(this,R.id.fragment);
            navController.popBackStack(R.id.takvimFragment,true);
            navController.popBackStack(R.id.ayarlarFragment,true);
            navController.navigate(R.id.action_mainFragment_to_takvimFragment);

            return takvimFragment.onOptionsItemSelected(item);
        }else if(item.getItemId()==R.id.ayarlar){
            navController=Navigation.findNavController(this,R.id.fragment);
            navController.popBackStack(R.id.takvimFragment,true);
            navController.popBackStack(R.id.ayarlarFragment,true);
            navController.navigate(R.id.action_mainFragment_to_ayarlarFragment);
        }else if(item.getItemId()==R.id.cıkıs){
          finish();
        }
        return super.onOptionsItemSelected(item);
    }



}