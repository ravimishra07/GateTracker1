package in.stantech.gatetracker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ECMain extends Fragment {
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_ecmain, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.vp);
        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) view.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(9);
//setRetainInstance(true);
        //int yourLimit;
        //  viewPager.setOffscreenPageLimit(limit);
        if (savedInstanceState == null) {
            setupViewPager(viewPager);
        }
        return view;

    }

    private void setupViewPager(ViewPager viewPager) {
        MainActivity.Adapter adapter = new MainActivity.Adapter(getChildFragmentManager());

        adapter.addFragment(new ECAnalogCircuits(), "Analog Circuits");
        adapter.addFragment(new ECCommunication(), "Communication System");
        adapter.addFragment(new ECControlSystem(), "Control System");
        adapter.addFragment(new ECDigitalCircuits(), "Digital Circuits");
        adapter.addFragment(new ECElectromagnetics(), "Electromagnetics");
        adapter.addFragment(new ECElectronicDevices(), "Electronic Devices");
        adapter.addFragment(new ECMaths(), "Engineering Mathematics");
        adapter.addFragment(new ECNetworkAndSignal(), "Network And Signal System");
        viewPager.setAdapter(adapter);
    }
}