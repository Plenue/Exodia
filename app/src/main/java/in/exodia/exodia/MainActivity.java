package in.exodia.exodia;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()) {
                case R.id.nav_news:
                    selectedFragment = new NewsFeedFragment();
                    break;
                case R.id.nav_events:
                    selectedFragment = new EventFragment();
                    break;
                case R.id.nav_about:
                    selectedFragment = new AboutUsFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectedFragment).commit();

            return true;
        }
    };

    public void openDialog(){
        DialodStart exampleDialog = new DialodStart();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new NewsFeedFragment()).commit();
        }
    }

    public void music(View v){
        Intent intent = new Intent(MainActivity.this,Music.class);
        startActivity(intent);
    }

    public void contact(View v){
        Intent intent = new Intent(MainActivity.this,ContactUs.class);
        startActivity(intent);
    }
    public void dance(View v){
        Intent intent = new Intent(MainActivity.this,dance.class);
        startActivity(intent);
    }
    public void drama(View v){
        Intent intent = new Intent(MainActivity.this,Drama.class);
        startActivity(intent);
    }
    public void photo(View v){
        Intent intent = new Intent(MainActivity.this,Photo.class);
        startActivity(intent);
    }
    public void artfashion(View v){
        Intent intent = new Intent(MainActivity.this,artfashion.class);
        startActivity(intent);
    }
    public void program(View v){
        Intent intent = new Intent(MainActivity.this,programmer.class);
        startActivity(intent);
    }
    public void robo(View v){
        Intent intent = new Intent(MainActivity.this,robo.class);
        startActivity(intent);
    }
    public void mech(View v){
        Intent intent = new Intent(MainActivity.this,mech.class);
        startActivity(intent);
    }
    public void builder(View v){
        Intent intent = new Intent(MainActivity.this,builder.class);
        startActivity(intent);
    }
    public void entepre(View v){
        Intent intent = new Intent(MainActivity.this,entepreneurs.class);
        startActivity(intent);
    }
    public void onlineart(View v){
        Intent intent = new Intent(MainActivity.this,artonline.class);
        startActivity(intent);
    }
    public void onlinephoto(View v){
        Intent intent = new Intent(MainActivity.this,photoonline.class);
        startActivity(intent);
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    public void reach(View v){
        goToUrl ("http://www.iitmandi.ac.in/institute/campus/how_to_reach.php");
    }
    public void folder(View v){
        Intent intent = new Intent(MainActivity.this,doc.class);
        startActivity(intent);
    }
    public void pronite(View v){
        Intent intent = new Intent(MainActivity.this,pronite.class);
        startActivity(intent);
    }
    public void map(View v){
        openDialog();
    }
    public void regis(View v){
        goToUrl ("https://www.exodia.in/redirect-to-register/");
    }

}