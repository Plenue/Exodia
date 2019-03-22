package in.exodia.exodia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class astro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astro);
    }

    public void backact(View v){
        onBackPressed();
    }

    public void call1(View v){
        try {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_USER_ACTION);
            callIntent.setData(Uri.parse("tel:+919999999999"));
            startActivity(callIntent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Problem while calling..",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void call2(View v){
        try {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_USER_ACTION);
            callIntent.setData(Uri.parse("tel:+919999999999"));
            startActivity(callIntent);
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Problem while calling..",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

}
