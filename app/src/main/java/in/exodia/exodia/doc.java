package in.exodia.exodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class doc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
    }
    public void backact(View v){
        onBackPressed();
    }
}
