package in.stantech.gatetracker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class CSMainActivity extends AppCompatActivity {
    private AdView mAdView;


    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    loadHome();
                    return true;
                case R.id.navigation_dashboard:
                    loadProgress();
                    return true;
                case R.id.navigation_notifications:
                    loadProfile();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csmain);
        TabLayout tabs = findViewById(R.id.tabs);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);




        MobileAds.initialize(this, "ca-app-pub-4932231968308275~5220060992");

        AdView adView = new AdView(this);
        // adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-4932231968308275/6505222507");



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        adView.setAdSize(AdSize.SMART_BANNER);
        loadHome();
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void loadHome(){
        //Toast.makeText(this, "Hiiiii", Toast.LENGTH_SHORT).show();
        // ProfileFrag profileFrag =ProfileFrag.ne
        //ProfileFrag fragment = ProfileFrag.newInstance();
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl, new CSMain());
        ft.addToBackStack(null);
        ft.commit();

    }
    private void loadProgress(){
        //startActivity(new Intent(EEMain.this,Chart.class));
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl, new CSProgress());
        ft.addToBackStack(null);
        ft.commit();
    }
    private void loadProfile(){
        //startActivity(new Intent(EEMain.this,Profile.class));
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl, new ECProfile());
        ft.addToBackStack(null);
        ft.commit();
    }


}
