package com.blogbasbas.hari3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.blogbasbas.hari3.activity.MyBrowserActivity;
import com.blogbasbas.hari3.activity.RsArifinActivity;
import com.blogbasbas.hari3.activity.RsEkaActivity;
import com.blogbasbas.hari3.activity.YoutubeActivity;

public class MainActivity extends AppCompatActivity {
    ListView lvhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvhome = (ListView)findViewById(R.id.lvhome);
        lvhome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posisi, long l) {
                switch (posisi) {
                    case 0:
                        // pindah activity
                        startActivity(new Intent(MainActivity.this, RsArifinActivity.class));
                        break;
                    case 1:
                        // pindah activity
                        startActivity(new Intent(MainActivity.this, RsEkaActivity.class));
                        break;
                    case 2:
                        // pindah activity
                        startActivity(new Intent(MainActivity.this, YoutubeActivity.class));
                        break;
                    case 3:
                        // pindah activity
                        startActivity(new Intent(MainActivity.this, MyBrowserActivity.class));
                        break;
                }
            }
        });
    }
    //pnaggil main menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //pilih item menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.mn_rs){
            startActivity(new Intent(MainActivity.this, RsArifinActivity.class));
        } else  if(id==R.id.mn_youtube){
            startActivity(new Intent(MainActivity.this, YoutubeActivity.class));
        } else  if(id==R.id.mn_home){
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        } else if (id==R.id.mn_about){
            showAbout();

        } else if (id==R.id.mn_exit){
            showExit();
        }
        return super.onOptionsItemSelected(item);
    }

    private void showExit() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Konfirmasi Exit");
        alert.setMessage("Keluar dari aplikasi?");
        alert.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
                System.exit(0);
            }
        });
        alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }

    private void showAbout() {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("My App");
        alert.setMessage("My App V.1. - Copyright 2017");
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }

    //method set menu item mn_msgbox tidak tampil di bagian menu item karena berada di activity dia sendri
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item = menu.findItem(R.id.mn_home);
        item.setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }
}
