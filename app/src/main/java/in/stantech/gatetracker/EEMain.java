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

public class EEMain extends Fragment {
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_eemain, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.eevp);
        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) view.findViewById(R.id.eetabs);
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

        adapter.addFragment(new EEAnalogandDigitalCircuits(), "Analog And Digital Circuits");
        adapter.addFragment(new EEControlSystem(), "Control System");
        adapter.addFragment(new EEElectricalMachines(), "Electrical Machines");
        adapter.addFragment(new EEElectricCircuit(), "Electric Circuits");
        adapter.addFragment(new EEElectromagneticField(), "Electricomagnetic Field");
        adapter.addFragment(new EElectricAndElectronicMeasu(), "Electric And Electronic Measurement");
        adapter.addFragment(new EEMaths(), "Engineering Maths");
        adapter.addFragment(new EEPowerElectronics(), "Power Electronics");
        adapter.addFragment(new EEPowerSystem(), "Power System");
        adapter.addFragment(new EESignalSystem(), "Signal System");

        viewPager.setAdapter(adapter);
    }
}