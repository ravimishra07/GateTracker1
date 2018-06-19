package in.stantech.gatetracker;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ECProgress extends Fragment {
    TextView tvttl,tvECAnalog, tvECComm, tvECControl, tvECDigitalCircuits, tvECElectromag, tvECElectronicDevices, tvECMAths, tvECNetwork;
int ECControl, ECNetwork,ECMaths, ECElectronic,ECElectromag,ECDigital, ECAnalog,PowerSys;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_ecprogress, container, false);
        tvECAnalog = view.findViewById(R.id.tvECAnalog);
        tvECComm = view.findViewById(R.id.tvECComm);
        tvECControl = view.findViewById(R.id.tvECControl);
        tvECDigitalCircuits = view.findViewById(R.id.tvECDigitalCircuits);
        tvECElectromag = view.findViewById(R.id.tvECElectromag);
        tvECElectronicDevices = view.findViewById(R.id.tvECElectronicDevices);
        tvECMAths = view.findViewById(R.id.tvECMAths);
        tvECNetwork = view.findViewById(R.id.tvECNetwork);
            tvttl=view.findViewById(R.id.tvTotal);
        pECAnalog();
        pECCom();
        pECControl();
        pECDigital();
        pECElectromag();
        pECElectDevices();
        pECMaths();
        pECNetwork ();

        return view;
    }


    private void pECNetwork() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
         ECNetwork = sharedPreferences.getInt("ECNetworkAndSignalSystem", 0);
        tvECNetwork.setText("Network And Signal System: " + ((ECNetwork * 100) / 25) + "%");

    }

    private void pECMaths() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
         ECMaths = sharedPreferences.getInt("ECMaths", 0);
        tvECMAths.setText("Engineering Maths " + ((ECMaths * 100) / 39) + "%");

    }

    private void pECElectDevices() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
         ECElectronic = sharedPreferences.getInt("ECElectronicsDevices", 0);
        tvECElectronicDevices.setText("Electronic devices: " + ((ECElectronic * 100) / 20) + "%");

    }

    private void pECElectromag() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        int ECElectromag = sharedPreferences.getInt("ECElectromagnetics", 0);
        tvECElectromag.setText("Electromagnetics: " + ((ECElectromag * 100) / 26) + "%");

    }

    private void pECDigital() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
         ECDigital = sharedPreferences.getInt("ECDigitalCircuit", 0);
        tvECDigitalCircuits.setText("Digital Circuits: " + ((ECDigital * 100) / 19) + "%");

    }

    private void pECAnalog() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
         ECAnalog = sharedPreferences.getInt("ECAnalog", 0);
        tvECAnalog.setText("Electrical And Electronics Measurement: " + ((ECAnalog * 100) / 22) + "%");
    }

    private void pECCom() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        //int EESignalsAndSystem= sharedPreferences.getInt("EESignalsAndSystem", 0);
         PowerSys = sharedPreferences.getInt("ECCommunication", 0);
        //int sumchemdisp2 = sharedPreferences.getInt("suminorgchem", 0);
        // int sumchemdisp3 = sharedPreferences.getInt("sumorgchem", 0);
        tvECComm.setText("Power System: " + ((PowerSys * 100) / 24) + "%");

    }

    private void pECControl() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        // int EESignalsAndSystem= sharedPreferences.getInt("EESignalsAndSystem", 0);
        ECControl = sharedPreferences.getInt("ECControlSystem", 0);
        //int sumchemdisp2 = sharedPreferences.getInt("suminorgchem", 0);
        //int sumchemdisp3 = sharedPreferences.getInt("sumorgchem", 0);
        tvECControl.setText("Control System: " + ((ECControl * 100) / 10) + "%");

    }



}