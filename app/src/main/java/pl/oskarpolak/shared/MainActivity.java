package pl.oskarpolak.shared;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

         fragmentManager = getFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();

    }



    @OnClick(R.id.button)
    public void onBackClick() {
        fragmentTransaction.replace(R.id.frameLayout, new RedFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.button2)
    public void onNextClick() {
        fragmentTransaction.replace(R.id.frameLayout, new GreenFragment());
        fragmentTransaction.commit();
    }

}
