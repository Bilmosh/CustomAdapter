package com.bill.restaurant;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView l;

    String[] rest =
            {
                    "KFC",
                    "PizzaIn",
                    "BurgerKing",
                    "Debonnairs"


            } ;

    String[] motto =
                {
                   "For who are kuku about chicken",
                   "Chicken yourself inside",
                   "Burger Fest",
                   "Something meaty"
                };

    int[] images =
                {
                        R.drawable.kfc,
                        R.drawable.pizza,
                        R.drawable.burgerk,
                        R.drawable.debon
                };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);


        l = (ListView) findViewById(R.id.listv);

        List<HashMap<String,String>> alist=new ArrayList<HashMap<String,String>>();


        for (int i= 0;i<4;i++)
        {
            HashMap<String,String> hm = new HashMap<String, String>();

            hm.put("restaurant",rest[i]);
            hm.put("mottos",motto[i]);
            hm.put("logosimages",Integer.toString(images[i]));

            alist.add(hm);
        }

        String[] from = {"logoimages","motto","rest"};
        int[]to = {R.id.imageID,R.id.textVw1,R.id.textVw2};

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(),alist,R.layout.support,from,to);

        l.setAdapter(adapter);






        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.restaurant, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.


        int id = item.getItemId();

        if (id == R.id.kfc) {
            // Handle the camera action
        } else if (id == R.id.piza) {

        } else if (id == R.id.burger) {

        } else if (id == R.id.debo) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
