package in.stantech.gatetracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class EEprogress extends Fragment {

    TextView tvttl,tvEEAnalogAndDigital, tvEEControl, tvEEMachine, tvEEElectricCircuit, tvEEElectromagField, tvEEElectricAndElectronicMeasu, tvEEMaths, tvEEPowerElectronics,tvEEPowerSystem,tvEESignalSystem;
    int EEAnalogAndDigital, EEControl,EEMachines, EEElectricCircuit,EEElectromagField,EEElectricAndElectronicMeasu, EEMaths,EEPowerElectronics,EEPowerSystem,EESignalSystem;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_eeprogress, container, false);
        tvEEAnalogAndDigital = view.findViewById(R.id.tvEEAnalogAndDigital);
        tvEEControl= view.findViewById(R.id.tvEEControl);
        tvEEMachine = view.findViewById(R.id.tvEEMachines);
        tvEEElectricCircuit = view.findViewById(R.id.tvEElectricCircuit);
        tvEEElectromagField = view.findViewById(R.id.tvEEElectromagField);
        tvEEElectricAndElectronicMeasu = view.findViewById(R.id.tvECElectricAndElectronicMeasu);
        tvEEPowerElectronics = view.findViewById(R.id.tvEEPowerElectronics);
        tvEEPowerSystem = view.findViewById(R.id.tvEEPowerSystem);
        tvEESignalSystem = view.findViewById(R.id.tvEESignalSystem);
        tvEEMaths = view.findViewById(R.id.tvEEMaths);
        tvttl=view.findViewById(R.id.tvTotal);
        pEEAnalogAndDigital();
        pEEControl();
        pEEMachine();
        pEEElectricCircuit();
        pECElectromagField();
        pEEElectricAndElectronicMeasu();
        pEEMaths();
        pEEPowerElectronics ();
        pEEPowerSystem ();
        pEESignalSystem ();

        return view;
    }

    private void pEEControl() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEControl = sharedPreferences.getInt("EEControlSystem", 0);
        tvEEControl.setText("Control System: " + ((EEControl * 100) / 15) + "%");

    }

    private void pEEAnalogAndDigital() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEAnalogAndDigital = sharedPreferences.getInt("ECAnalog", 0);
        tvEEAnalogAndDigital.setText("Analog And Digital circuits: " + ((EEAnalogAndDigital * 100) / 19) + "%");

    }


    private void pEEMachine() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEMachines = sharedPreferences.getInt("EEElectricalMachines", 0);
        tvEEMachine.setText("Electric Machines: " + ((EEMachines * 100) / 26) + "%");

    }

    private void pEEElectricCircuit() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEElectricCircuit = sharedPreferences.getInt("EEElectricalCircuits", 0);
        tvEEElectricCircuit.setText("Electric Circuits " + ((EEElectricCircuit * 100) / 15) + "%");

    }

    private void pECElectromagField() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEElectromagField = sharedPreferences.getInt("EEElectromagneticFields", 0);
        tvEEElectromagField.setText("Electromagetic Field: " + ((EEElectromagField * 100) / 22) + "%");

    }

    private void pEEElectricAndElectronicMeasu() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        int EEElectricAndElectromagMeasu = sharedPreferences.getInt("EEElectricalAndElectronicsMeasu", 0);
        tvEEElectricAndElectronicMeasu.setText("Electric And Electronic Measurement " + ((EEElectricAndElectromagMeasu * 100) / 10) + "%");

    }

    private void pEEMaths() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEMaths = sharedPreferences.getInt("EEMaths", 0);
        tvEEMaths.setText("Engineering Mathematics: " + ((EEMaths* 100) / 39) + "%");

    }

    private void pEEPowerElectronics() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        EEPowerElectronics = sharedPreferences.getInt("EEPowerElectronics", 0);
        tvEEPowerElectronics.setText("Power Electronics " + ((EEPowerElectronics * 100) / 17) + "%");
    }

    private void pEESignalSystem() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        //int EESignalsAndSystem= sharedPreferences.getInt("EESignalsAndSystem", 0);
        EESignalSystem = sharedPreferences.getInt("EESignalSystem", 0);
        //int sumchemdisp2 = sharedPreferences.getInt("suminorgchem", 0);
        // int sumchemdisp3 = sharedPreferences.getInt("sumorgchem", 0);
        tvEESignalSystem.setText("Signal System: " + ((EESignalSystem * 100) / 8) + "%");

    }

    private void pEEPowerSystem() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        // int EESignalsAndSystem= sharedPreferences.getInt("EESignalsAndSystem", 0);
        EEPowerSystem = sharedPreferences.getInt("EEPowerSystem", 0);
        //int sumchemdisp2 = sharedPreferences.getInt("suminorgchem", 0);
        //int sumchemdisp3 = sharedPreferences.getInt("sumorgchem", 0);
        tvEEPowerSystem.setText("Power System: " + ((EEPowerSystem * 100) / 19) + "%");

    }




}