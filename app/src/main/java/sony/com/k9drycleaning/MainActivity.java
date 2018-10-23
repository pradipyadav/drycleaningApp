package sony.com.k9drycleaning;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


//    ImageView imgRateCard,imgPress,imgDrycleaning,imgContactus,imgShare,imgFeedback,imgAboutus,imgLanguage,imgServices;
    ViewFlipper v_flipper;

    LinearLayout linearRateCard,linearPress,linearDrycleaning,linearServices,linearContactUs,linearShare,linearFeedback,linearAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        loadLocal();

        setContentView(R.layout.activity_main);

//        loadLocal();


//        Image slider;
        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};

        v_flipper = findViewById(R.id.v_flipper);

        linearRateCard=findViewById(R.id.linearRateCard);
        linearPress=findViewById(R.id.linearPress);
        linearDrycleaning=findViewById(R.id.linearDrycleaning);
        linearServices=findViewById(R.id.linearServices);
        linearContactUs=findViewById(R.id.linearContactUs);
        linearShare=findViewById(R.id.linearShare);
        linearFeedback=findViewById(R.id.linearFeedback);
        linearAboutUs=findViewById(R.id.linearAboutUs);


        for (int image : images) {

            flipperImage(image);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();

//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
    }


//Language change

    private void showChangeLanguaqgeDialog() {

        final String[] listItem = {"मराठी", "English"};

        AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);
        mbuilder.setTitle("Choose Language....");
        mbuilder.setSingleChoiceItems(listItem, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                if (i == 0) {

                    //Marathi
                    setLocal("mr");
                    recreate();
                } else if (i == 1) {

                    //English
                    setLocal("en");
                    recreate();
                }

                dialog.dismiss();

            }
        });

        AlertDialog mDialog = mbuilder.create();
        mDialog.show();

    }

    private void setLocal(String lang) {

        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }

    public void loadLocal() {

        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocal(language);
    }

    public void flipperImage(int image) {

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);

        linearRateCard.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent rateCard=new Intent(MainActivity.this,RateCard.class);
                        startActivity(rateCard);

                    }
                }
        );

        linearPress.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent press=new Intent(MainActivity.this,Press.class);
                        startActivity(press);

                        Bundle bundle=getIntent().getExtras();
                        String uname=bundle.getString("uname");


                    }
                }
        );

        linearDrycleaning.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent dryclean=new Intent(MainActivity.this,Drycleaning.class);
                        startActivity(dryclean);

                    }
                }
        );

        linearContactUs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent contacts=new Intent(MainActivity.this,ContactUs.class);
                        startActivity(contacts);

                    }
                }
        );

        linearServices.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent services=new Intent(MainActivity.this,Services.class);
                        startActivity(services);

                    }
                }
        );

        linearFeedback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent feedback=new Intent(MainActivity.this,FeedbackActivity.class);
                        startActivity(feedback);

                    }
                }
        );

        linearAboutUs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent aboutus=new Intent(MainActivity.this,AboutUs.class);
                        startActivity(aboutus);

                    }
                }
        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
//
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            showChangeLanguaqgeDialog();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
//
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);

//    }
//
////
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.ratecard)
//        {
//            Intent rateCard=new Intent(MainActivity.this,RateCard.class);
//            startActivity(rateCard);
//        }
//        else if (id == R.id.press)
//        {
//            Intent press=new Intent(MainActivity.this,Press.class);
//            startActivity(press);
//
//        }
//        else if (id == R.id.dryclean)
//        {
//            Intent dryclean=new Intent(MainActivity.this,Drycleaning.class);
//            startActivity(dryclean);
//
//        }
//        else if (id == R.id.services)
//        {
//            Intent services=new Intent(MainActivity.this,Services.class);
//            startActivity(services);
//
//
//
//        }
//        else if (id == R.id.contacts) {
//
////            Intent contacts=new Intent(MainActivity.this,Contact_us.class);
////            startActivity(contacts);
//
//            Intent contacts=new Intent(MainActivity.this,ContactUs.class);
//            startActivity(contacts);
//        }
//        else if (id == R.id.nav_share) {
//
//        }
//
//        else if (id == R.id.nav_feedback){
//            Intent feedback=new Intent(MainActivity.this,FeedbackActivity.class);
//            startActivity(feedback);
//        }
//        else if (id == R.id.changelanguage) {
//
//            showChangeLanguaqgeDialog();
//        }
//
////        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
////        drawer.closeDrawer(GravityCompat.START);
////        return true;
//    }
//}
