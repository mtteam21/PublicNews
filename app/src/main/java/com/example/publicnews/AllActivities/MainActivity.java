package com.example.publicnews.AllActivities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
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
import com.example.publicnews.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    public static ImageView openCloseDrawerIcon;
    private View v;
    private  ImageView closeNavMenu;
    public BottomNavigationView bottomNavigationView;
    public static DrawerLayout drawer;
    public static NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openCloseDrawerIcon = findViewById(R.id.openCloseDrawerIcon);
        closeNavMenu = findViewById(R.id.closeNavigationMenu);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
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
        int id = item.getItemId() ;
//        if (id == R.id.action_settings ) {
//            return true;
//        }
        return super .onOptionsItemSelected(item) ;
    }
    @SuppressWarnings ( "StatementWithEmptyBody" )
    @Override
    public boolean onNavigationItemSelected ( @NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId() ;
//        if (id == R.id. nav_camera ) {
//            // Handle the camera action
//        } else if (id == R.id. nav_gallery ) {
//        } else if (id == R.id. nav_slideshow ) {
//        } else if (id == R.id. nav_manage ) {
//        } else if (id == R.id. nav_share ) {
//        } else if (id == R.id. nav_send ) {
//        }
        DrawerLayout drawer = findViewById(R.id. drawer_layout ) ;
        drawer.closeDrawer(GravityCompat. START ) ;
        return true;
    }
}