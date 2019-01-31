package in.exodia.exodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class builder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
    }
    public void backact(View v){
        onBackPressed();
    }
}
