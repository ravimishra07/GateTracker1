package in.stantech.gatetracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


public class CSDatabases extends Fragment {
    protected CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
    protected TextView tv, tv1;
    protected float ttl;

    protected int v1, v2, v3, v4, v5, v6, v7, v8, v9, total;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_csdatabases, container, false);

        cb1 = view.findViewById(R.id.cb1);
        cb2 = view.findViewById(R.id.cb2);
        cb3 = view.findViewById(R.id.cb3);
        cb4 = view.findViewById(R.id.cb4);
        cb5 = view.findViewById(R.id.cb5);
        cb6 = view.findViewById(R.id.cb6);
        cb7 = view.findViewById(R.id.cb7);
        cb8 = view.findViewById(R.id.cb8);
        cb9 = view.findViewById(R.id.cb9);


        tv = view.findViewById(R.id.tv);
        tv1 = view.findViewById(R.id.tv1);
        initialState();
        clkListner();
        return view;
    }


    private void initialState() {
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences("this", 0);
        v1 = sharedPreferences.getInt("cb1", 0);
        v2 = sharedPreferences.getInt("cb2", 0);
        v3 = sharedPreferences.getInt("cb3", 0);
        v4 = sharedPreferences.getInt("cb4", 0);
        v5 = sharedPreferences.getInt("cb5", 0);
        v6 = sharedPreferences.getInt("cb6", 0);
        v7 = sharedPreferences.getInt("cb7", 0);
        v8 = sharedPreferences.getInt("cb8", 0);
        v9 = sharedPreferences.getInt("cb9", 0);

        total = (v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9 );

        savePreferences("CSDatabases", (total));
        ttl = (total * 100) / 9;
        //  this.tv.setText(String.valueOf((ttl)));
        this.tv.setText("Progress:" + total + "/9");
        this.tv1.setText("               " + ttl + "%");
        if (total == 9) {
            Toast.makeText(this.getContext(), "Awesome! You are now master of this subject!!", Toast.LENGTH_SHORT).show();
        }
        switch (v1) {
            case R.styleable.View_android_focusable:
                this.cb1.setChecked(true);
                break;
        }
        switch (v2) {
            case R.styleable.View_android_focusable:
                this.cb2.setChecked(true);
                break;
        }
        switch (v3) {
            case R.styleable.View_android_focusable:
                this.cb3.setChecked(true);
                break;
        }
        switch (v4) {
            case R.styleable.View_android_focusable:
                this.cb4.setChecked(true);
                break;
        }
        switch (v5) {
            case R.styleable.View_android_focusable:
                this.cb5.setChecked(true);
                break;
        }
        switch (v6) {
            case R.styleable.View_android_focusable:
                this.cb6.setChecked(true);
                break;
        }
        switch (v7) {
            case R.styleable.View_android_focusable:
                this.cb7.setChecked(true);
                break;
        }
        switch (v8) {
            case R.styleable.View_android_focusable:
                this.cb8.setChecked(true);
                break;
        }
        switch (v9) {
            case R.styleable.View_android_focusable:
                this.cb9.setChecked(true);
                break;
        }

    }

    public void savePreferences(String key, int value) {
        SharedPreferences.Editor editor = this.getActivity().getSharedPreferences("this", 0).edit();
        editor.putInt(key, value);
        editor.commit();
    }

    private void clkListner() {
        this.cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb1", 1);
                    initialState();
                } else {
                    savePreferences("cb1", 0);
                }
                initialState();
            }
        });
        this.cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb2", 1);
                    initialState();
                } else {
                    savePreferences("cb2", 0);
                }
                initialState();
            }
        });
        this.cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb3", 1);

                    initialState();
                } else {
                    savePreferences("cb3", 0);
                }
                initialState();
            }
        });
        this.cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb4", 1);
                    initialState();
                } else {
                    savePreferences("cb4", 0);
                }
                initialState();
            }
        });
        this.cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb5", 1);
                    initialState();
                } else {
                    savePreferences("cb5", 0);
                }
                initialState();
            }
        });
        this.cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb6", 1);

                    initialState();
                } else {
                    savePreferences("cb6", 0);
                }
                initialState();
            }
        });
        this.cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb7", 1);
                    initialState();
                } else {
                    savePreferences("cb7", 0);
                }
                initialState();
            }
        });
        this.cb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb8", 1);
                    initialState();
                } else {
                    savePreferences("cb8", 0);
                }
                initialState();
            }
        });
        this.cb9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb9", 1);

                    initialState();
                } else {
                    savePreferences("cb9", 0);
                }
                initialState();
            }
        });

    }
}
