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



public class CSMain extends Fragment {
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_csmain, container, false);
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

        adapter.addFragment(new CSAlgorithm(), "Algorithm");
        adapter.addFragment(new CSCompilerDesign(), "Compiler Design");
        adapter.addFragment(new CSComputerNetworks(), "Computer Network");
        adapter.addFragment(new CSComputerOrganization(), "Computer Organization");
        adapter.addFragment(new CSDatabases(), "Databases");
        adapter.addFragment(new CSDataStructure(), "Data Structure");
        adapter.addFragment(new CSDigitalLogic(), "Digital Logic");
        adapter.addFragment(new CSOperatingSystem(), "Operating System");
        adapter.addFragment(new CSMaths(), "Engineering Maths");
        adapter.addFragment(new CSTheoryOfComputation(), "Theory Of Computation");
        viewPager.setAdapter(adapter);
    }
}
