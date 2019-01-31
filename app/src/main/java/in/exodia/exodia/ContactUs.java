package in.exodia.exodia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }
    public void backact(View v){
        onBackPressed();
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void facebook(View v){
        goToUrl ("https://www.facebook.com/Exodia.IITMandi/");
    }
    public void twitter(View v){
        goToUrl ("https://twitter.com/Exodia_IITMandi");
    }
    public void insta(View v){
        goToUrl ("https://www.instagram.com/exodia.in");
    }
    public void flic(View v){
        goToUrl ("https://www.flickr.com/photos/140120696@N06/");
    }
    public void linkin(View v){
        goToUrl ("https://in.linkedin.com/company/exodia-iit-mandi");
    }
    public void you(View v){
        goToUrl ("https://www.youtube.com/user/exodiaiitmandi");
    }
//    public void email(View v){
//        android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
//        android.content.ClipData clip = android.content.ClipData.newPlainText("Copied Text", text);
//        clipboard.setPrimaryClip(clip);
//    }
    public void rish(View v){
        goToUrl("https://www.facebook.com/Rishabh.DharmaniRD?ref=br_rs");
    }
    public void nak(View v){
        goToUrl("https://www.facebook.com/nakul.yadav.50746");
    }
    public void team(View v){
        goToUrl("http://www.exodia.in/team/");
    }
}
