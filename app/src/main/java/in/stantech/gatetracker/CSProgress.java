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


public class CSProgress extends Fragment {
    TextView tvttl, tvCSAlgorithm, tvCSCompilerDesign, tvCSComputerNetwork,
    tvCSComputerOrganization, tvCSDatabases, tvCSDataStructures, tvCSMaths, tvCSDigitalLogic, tvCSOperatingSystem, tvCSTheoryOfComputation;
    int CSAlgorithm, CSCompilerDesign, CSComputerNetworks, CSComputerOrganization, CSDatabases, CSDataStructures, CSMaths, CSDigitalLogic, CSOperatingSystem, CSTheoryOfComputation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_csprogress, container, false);
        tvCSAlgorithm = view.findViewById(R.id.tvCSAlgorithm);
        tvCSCompilerDesign = view.findViewById(R.id.tvCSCompilerDesign);
        tvCSComputerNetwork = view.findViewById(R.id.tvCSComputerNetwork);
        tvCSComputerOrganization = view.findViewById(R.id.tvCSComputerOrganization);
        tvCSDatabases = view.findViewById(R.id.tvCSDatabases);
        tvCSDataStructures = view.findViewById(R.id.tvCSDataStructures);
        tvCSMaths = view.findViewById(R.id.tvCSMaths);
        tvCSDigitalLogic= view.findViewById(R.id.tvCSDigitalLogic);
        tvCSOperatingSystem = view.findViewById(R.id.tvCSOperatingSystem);
        tvCSTheoryOfComputation = view.findViewById(R.id.tvCSTheoryOfComputation);
        tvttl = view.findViewById(R.id.tvTotal);
        pCSAlgorithm();
        pCSCompilerDesign();
        pCSComputerNetworks();
        pCSComputerOrganization();
        pCSDataStructures();
        pCSMaths();
        pCSDigitalLogic();
        pCSDatabases();
        pCSOperatingSystem();
        pCSTheoryOfComputation();

        return view;
    }

    private void pCSAlgorithm() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSAlgorithm = sharedPreferences.getInt("CSAlgorithm", 0);
        tvCSAlgorithm.setText("Algorithm: " + ((CSAlgorithm * 100) / 13) + "%");

    }

    private void pCSCompilerDesign() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSCompilerDesign = sharedPreferences.getInt("CSCompilerDesign", 0);
        tvCSCompilerDesign.setText("Compiler Design: " + ((CSCompilerDesign * 100) / 5) + "%");

    }


    private void pCSComputerNetworks() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSComputerNetworks = sharedPreferences.getInt("CSComputerNetworks", 0);
        tvCSComputerNetwork.setText("Computer Networks: " + ((CSComputerNetworks * 100) / 14) + "%");

    }

    private void pCSComputerOrganization() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSComputerOrganization = sharedPreferences.getInt("CSComputerOrganization", 0);
        tvCSComputerOrganization.setText("Computer Organization " + ((CSComputerOrganization * 100) / 9) + "%");

    }

    private void pCSDataStructures() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSDataStructures = sharedPreferences.getInt("CSDataStructures", 0);
        tvCSDataStructures.setText("Data Structures: " + ((CSDataStructures * 100) / 10) + "%");

    }

    private void pCSMaths() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        int CSMaths = sharedPreferences.getInt("CSMaths", 0);
        tvCSMaths.setText("Engineering Maths " + ((CSMaths * 100) / 10) + "%");

    }

    private void pCSDigitalLogic() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSDigitalLogic = sharedPreferences.getInt("CSDigitalLogic", 0);
        tvCSDigitalLogic.setText("Engineering Mathematics: " + ((CSDigitalLogic * 100) / 6) + "%");

    }

    private void pCSDatabases() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        CSDatabases = sharedPreferences.getInt("CSDatabases", 0);
        tvCSDatabases.setText("Databases" + ((CSDatabases * 100) / 9) + "%");
    }

    private void pCSOperatingSystem() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        //int EESignalsAndSystem= sharedPreferences.getInt("EESignalsAndSystem", 0);
        CSOperatingSystem = sharedPreferences.getInt("CSOperatingSystem", 0);
        //int sumchemdisp2 = sharedPreferences.getInt("suminorgchem", 0);
        // int sumchemdisp3 = sharedPreferences.getInt("sumorgchem", 0);
        tvCSOperatingSystem.setText("Operating System: " + ((CSOperatingSystem * 100) / 10) + "%");

    }

    private void pCSTheoryOfComputation() {

        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        // int EESignalsAndSystem= sharedPreferences.getInt("EESignalsAndSystem", 0);
        CSTheoryOfComputation = sharedPreferences.getInt("CSTheoryOfComputation", 0);

        tvCSTheoryOfComputation.setText("Theory Of Computation: " + ((CSTheoryOfComputation * 100) / 5) + "%");

    }


}
