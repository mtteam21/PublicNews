package com.example.publicnews.AllActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.publicnews.Fragments.HomeFragment;
import com.example.publicnews.Fragments.NotificationFragment;
import com.example.publicnews.Fragments.ProfileFragment;
import com.example.publicnews.Fragments.SearchFragment;
import com.example.publicnews.Fragments.UploadFragment;
import com.example.publicnews.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import static com.example.publicnews.Fragments.UploadFragment.REQUEST_TAKE_GALLERY_VIDEO;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    public static ImageView openCloseDrawerIcon;
    private View v;
    private  ImageView closeNavMenu;
    public BottomNavigationView bottomNavigationView;
    public static DrawerLayout drawer;
    public static NavigationView navigationView;
    private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openCloseDrawerIcon = findViewById(R.id.openCloseDrawerIcon);
        closeNavMenu = findViewById(R.id.closeNavigationMenu);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        floatingActionButton = findViewById(R.id.fabl);
        v = findViewById(R.id.toolBarDesign);
        bottomNavigationView.setBackground(null);

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        drawer = findViewById(R.id.drawer_layout) ;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer , null , R.string.navigation_drawer_open ,
                R.string.navigation_drawer_close ) ;
        drawer.addDrawerListener(toggle) ;
        toggle.syncState();

        navigationView = findViewById(R.id.nav_view) ;
        navigationView.setNavigationItemSelectedListener(this) ;

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                floatingActionButton.setVisibility(View.GONE);
               getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

                Fragment fragment = new UploadFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.mainC, fragment);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });
        openCloseDrawerIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               drawer.openDrawer(GravityCompat.START);
               if(drawer.isDrawerOpen(navigationView)){
                   drawer.closeDrawer(GravityCompat.END);
               }
            }
        });

        closeNavMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawer.isDrawerOpen(navigationView)){
                    drawer.closeDrawers();
                }
            }
        });

        Fragment fragment = new HomeFragment();
        loadFragment(fragment);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;

            switch (item.getItemId()) {
                case R.id.navHome:
                    v.setVisibility(View.VISIBLE);
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navNotification:
                    fragment = new NotificationFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navSearch:
                    v.setVisibility(View.GONE);
                    fragment = new SearchFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navProfile:
                     v.setVisibility(View.GONE);
                     fragment = new ProfileFragment();
                     loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.con, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    @Override
    public void onBackPressed () {
        DrawerLayout drawer = findViewById(R.id. drawer_layout ) ;
        if (drawer.isDrawerOpen(GravityCompat. START )) {
            drawer.closeDrawer(GravityCompat. START ) ;
        } else {
            super .onBackPressed() ;
        }
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu) ;
        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        return super .onOptionsItemSelected(item) ;
    }
    @SuppressWarnings ( "StatementWithEmptyBody" )
    @Override
    public boolean onNavigationItemSelected ( @NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId() ;

        DrawerLayout drawer = findViewById(R.id. drawer_layout ) ;
        drawer.closeDrawer(GravityCompat. START ) ;
        return true;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_TAKE_GALLERY_VIDEO) {
                Uri selectedImageUri = data.getData();

                // OI FILE Manager
                String filemanagerstring = selectedImageUri.getPath();
                Toast.makeText(this, filemanagerstring, Toast.LENGTH_SHORT).show();
                // MEDIA GALLERY
                String selectedImagePath = getPath(selectedImageUri);
                if (selectedImagePath != null) {

                    Intent intent = new Intent(MainActivity.this,
                            VerifyAndSubmitActivity.class);
                    intent.putExtra("path", selectedImagePath);
                    startActivity(intent);
                }
            }
        }
    }

    // UPDATED!
    public String getPath(Uri uri) {
        String[] projection = { MediaStore.Video.Media.DATA };
        Cursor cursor = getContentResolver().query(uri, projection, null, null, null);
        if (cursor != null) {
            // HERE YOU WILL GET A NULLPOINTER IF CURSOR IS NULL
            // THIS CAN BE, IF YOU USED OI FILE MANAGER FOR PICKING THE MEDIA
            int column_index = cursor
                    .getColumnIndexOrThrow(MediaStore.Video.Media.DATA);
            cursor.moveToFirst();
            return cursor.getString(column_index);
        } else
            return null;
    }
}