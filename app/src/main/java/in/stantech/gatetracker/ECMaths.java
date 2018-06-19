package in.stantech.gatetracker;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ravi on 13/1/18.
 */

public class ECMaths extends Fragment {
    protected   CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39;
    protected    TextView tv,tv1;
    protected   float ttl;

    protected int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21,v22,v23,v24,v25,v26,v27,v28,v29,v30,v31,v32,v33,v34,v35,v36,v37,v38,v39,total;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.fragment_ecmaths, container, false);

        cb1 = view.findViewById(R.id.cb1);
        cb2 = view.findViewById(R.id.cb2);
        cb3 = view.findViewById(R.id.cb3);
        cb4 = view.findViewById(R.id.cb4);
        cb5 = view.findViewById(R.id.cb5);
        cb6 = view.findViewById(R.id.cb6);
        cb7 = view.findViewById(R.id.cb7);
        cb8 = view.findViewById(R.id.cb8);
        cb9 = view.findViewById(R.id.cb9);
        cb10 = view.findViewById(R.id.cb10);
        cb11= view.findViewById(R.id.cb11);
        cb12= view.findViewById(R.id.cb12);
        cb13= view.findViewById(R.id.cb13);
        cb14= view.findViewById(R.id.cb14);
        cb15= view.findViewById(R.id.cb15);
        cb16= view.findViewById(R.id.cb16);
        cb17= view.findViewById(R.id.cb17);
        cb18= view.findViewById(R.id.cb18);
        cb19= view.findViewById(R.id.cb19);
        cb20= view.findViewById(R.id.cb20);
        cb21= view.findViewById(R.id.cb21);
        cb22= view.findViewById(R.id.cb22);
        cb23= view.findViewById(R.id.cb23);
        cb24= view.findViewById(R.id.cb24);
        cb25= view.findViewById(R.id.cb25);
        cb26= view.findViewById(R.id.cb26);
        cb27= view.findViewById(R.id.cb27);
        cb28= view.findViewById(R.id.cb28);
        cb29= view.findViewById(R.id.cb29);
        cb30= view.findViewById(R.id.cb30);
        cb31 = view.findViewById(R.id.cb31);
        cb32 = view.findViewById(R.id.cb32);
        cb33= view.findViewById(R.id.cb33);
        cb34= view.findViewById(R.id.cb34);
        cb35= view.findViewById(R.id.cb35);
        cb36 = view.findViewById(R.id.cb36);
        cb37= view.findViewById(R.id.cb37);
        cb38 = view.findViewById(R.id.cb38);
        cb39= view.findViewById(R.id.cb39);

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
        v10 = sharedPreferences.getInt("cb10", 0);
        v11 = sharedPreferences.getInt("cb11", 0);
        v12 = sharedPreferences.getInt("cb12", 0);
        v13 = sharedPreferences.getInt("cb13", 0);
        v14 = sharedPreferences.getInt("cb14", 0);
        v15 = sharedPreferences.getInt("cb15", 0);
        v16 = sharedPreferences.getInt("cb16", 0);
        v17 = sharedPreferences.getInt("cb17", 0);
        v18 = sharedPreferences.getInt("cb18", 0);
        v19= sharedPreferences.getInt("cb19", 0);
        v20= sharedPreferences.getInt("cb20", 0);
        v21 = sharedPreferences.getInt("cb21", 0);
        v22= sharedPreferences.getInt("cb22", 0);
        v23= sharedPreferences.getInt("cb23", 0);
        v24= sharedPreferences.getInt("cb24", 0);
        v25= sharedPreferences.getInt("cb25", 0);
        v26= sharedPreferences.getInt("cb26", 0);
        v27 = sharedPreferences.getInt("cb27", 0);
        v28 = sharedPreferences.getInt("cb28", 0);
        v29= sharedPreferences.getInt("cb29", 0);
        v30= sharedPreferences.getInt("cb30", 0);
        v31= sharedPreferences.getInt("cb31", 0);
        v32= sharedPreferences.getInt("cb32", 0);
        v33= sharedPreferences.getInt("cb33", 0);
        v34= sharedPreferences.getInt("cb34", 0);
        v35= sharedPreferences.getInt("cb35", 0);
        v36= sharedPreferences.getInt("cb36", 0);
        v37= sharedPreferences.getInt("cb37", 0);
        v38= sharedPreferences.getInt("cb38", 0);
        v39= sharedPreferences.getInt("cb39", 0);
        total = (v1 + v2+ v3+v4+v5+v6+v7+v8+v9+v10+v11+v12+v13+v14+v15+v16+v17+v18+v19+v20+v21+v22+v23+v24+v25+v26+v27+v28+v29+v30+v31+v32+v33+v34+v35+v36+v37+v38+v39);

        savePreferences("ECMaths", (total));
        ttl=(total*100)/39;
        //  this.tv.setText(String.valueOf((ttl)));
        this.tv.setText("Progress: "+total+"/39");
        this.tv1.setText("               "+ttl+"%");
        if(total==39){
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
        switch (v10) {
            case R.styleable.View_android_focusable:
                this.cb10.setChecked(true);
                break;
        }
        switch (v11) {
            case R.styleable.View_android_focusable:
                this.cb11.setChecked(true);
                break;
        }
        switch (v12) {
            case R.styleable.View_android_focusable:
                this.cb12.setChecked(true);
                break;
        }
        switch (v13) {
            case R.styleable.View_android_focusable:
                this.cb13.setChecked(true);
                break;
        }
        switch (v14) {
            case R.styleable.View_android_focusable:
                this.cb14.setChecked(true);
                break;
        }
        switch (v15) {
            case R.styleable.View_android_focusable:
                this.cb15.setChecked(true);
                break;
        }
        switch (v16) {
            case R.styleable.View_android_focusable:
                this.cb16.setChecked(true);
                break;
        }
        switch (v17) {
            case R.styleable.View_android_focusable:
                this.cb17.setChecked(true);
                break;
        }
        switch (v18) {
            case R.styleable.View_android_focusable:
                this.cb18.setChecked(true);
                break;
        }
        switch (v19) {
            case R.styleable.View_android_focusable:
                this.cb19.setChecked(true);
                break;
        }
        switch (v20) {
            case R.styleable.View_android_focusable:
                this.cb20.setChecked(true);
                break;
        }
        switch (v21) {
            case R.styleable.View_android_focusable:
                this.cb21.setChecked(true);
                break;
        }
        switch (v22) {
            case R.styleable.View_android_focusable:
                this.cb22.setChecked(true);
                break;
        }
        switch (v23) {
            case R.styleable.View_android_focusable:
                this.cb23.setChecked(true);
                break;
        }
        switch (v24) {
            case R.styleable.View_android_focusable:
                this.cb24.setChecked(true);
                break;
        }
        switch (v25) {
            case R.styleable.View_android_focusable:
                this.cb25.setChecked(true);
                break;
        }
        switch (v26) {
            case R.styleable.View_android_focusable:
                this.cb26.setChecked(true);
                break;
        }
        switch (v27) {
            case R.styleable.View_android_focusable:
                this.cb27.setChecked(true);
                break;
        }
        switch (v28) {
            case R.styleable.View_android_focusable:
                this.cb28.setChecked(true);
                break;
        }
        switch (v29) {
            case R.styleable.View_android_focusable:
                this.cb29.setChecked(true);
                break;
        }
        switch (v30) {
            case R.styleable.View_android_focusable:
                this.cb30.setChecked(true);
                break;
        }
        switch (v31) {
            case R.styleable.View_android_focusable:
                this.cb31.setChecked(true);
                break;
        }
        switch (v32) {
            case R.styleable.View_android_focusable:
                this.cb32.setChecked(true);
                break;
        }
        switch (v33) {
            case R.styleable.View_android_focusable:
                this.cb33.setChecked(true);
                break;
        }
        switch (v34) {
            case R.styleable.View_android_focusable:
                this.cb34.setChecked(true);
                break;
        }
        switch (v35) {
            case R.styleable.View_android_focusable:
                this.cb35.setChecked(true);
                break;
        }
        switch (v36) {
            case R.styleable.View_android_focusable:
                this.cb36.setChecked(true);
                break;
        }
        switch (v37) {
            case R.styleable.View_android_focusable:
                this.cb37.setChecked(true);
                break;
        }
        switch (v38) {
            case R.styleable.View_android_focusable:
                this.cb38.setChecked(true);
                break;
        }
        switch (v39) {
            case R.styleable.View_android_focusable:
                this.cb39.setChecked(true);
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
        this.cb10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb10", 1);
                    initialState();
                } else {
                    savePreferences("cb10", 0);
                }
                initialState();
            }
        });
        this.cb11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb11", 1);

                    initialState();
                } else {
                    savePreferences("cb11", 0);
                }
                initialState();
            }
        });
        this.cb12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb12", 1);
                    initialState();
                } else {
                    savePreferences("cb12", 0);
                }
                initialState();
            }
        });
        this.cb13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb13", 1);

                    initialState();
                } else {
                    savePreferences("cb13", 0);
                }
                initialState();
            }
        });
        this.cb14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb14", 1);
                    initialState();
                } else {
                    savePreferences("cb14", 0);
                }
                initialState();
            }
        });
        this.cb15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb15", 1);

                    initialState();
                } else {
                    savePreferences("cb15", 0);
                }
                initialState();
            }
        });
        this.cb16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb16", 1);

                    initialState();
                } else {
                    savePreferences("cb16", 0);
                }
                initialState();
            }
        });
        this.cb17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb17", 1);
                    initialState();
                } else {
                    savePreferences("cb17", 0);
                }
                initialState();
            }
        });
        this.cb18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb18", 1);

                    initialState();
                } else {
                    savePreferences("cb18", 0);
                }
                initialState();
            }
        });
        this.cb19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb19", 1);

                    initialState();
                } else {
                    savePreferences("cb19", 0);
                }
                initialState();
            }
        });
        this.cb20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb20", 1);

                    initialState();
                } else {
                    savePreferences("cb20", 0);
                }
                initialState();
            }
        });

        this.cb21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb21", 1);

                    initialState();
                } else {
                    savePreferences("cb21", 0);
                }
                initialState();
            }
        });
        this.cb22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb22", 1);
                    initialState();
                } else {
                    savePreferences("cb22", 0);
                }
                initialState();
            }
        });
        this.cb23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb23", 1);
                    initialState();
                } else {
                    savePreferences("cb23", 0);
                }
                initialState();
            }
        });
        this.cb24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb24", 1);

                    initialState();
                } else {
                    savePreferences("cb24", 0);
                }
                initialState();
            }
        });
        this.cb25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb25", 1);
                    initialState();
                } else {
                    savePreferences("cb25", 0);
                }
                initialState();
            }
        });
        this.cb26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb26", 1);
                    initialState();
                } else {
                    savePreferences("cb26", 0);
                }
                initialState();
            }
        });
        this.cb27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb27", 1);

                    initialState();
                } else {
                    savePreferences("cb27", 0);
                }
                initialState();
            }
        });
        this.cb28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb28", 1);
                    initialState();
                } else {
                    savePreferences("cb28", 0);
                }
                initialState();
            }
        });
        this.cb29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb29", 1);
                    initialState();
                } else {
                    savePreferences("cb29", 0);
                }
                initialState();
            }
        });
        this.cb30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb30", 1);

                    initialState();
                } else {
                    savePreferences("cb30", 0);
                }
                initialState();
            }
        });
        this.cb31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb31", 1);
                    initialState();
                } else {
                    savePreferences("cb31", 0);
                }
                initialState();
            }
        });
        this.cb32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb32", 1);
                    initialState();
                } else {
                    savePreferences("cb32", 0);
                }
                initialState();
            }
        });
        this.cb33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb33", 1);

                    initialState();
                } else {
                    savePreferences("cb33", 0);
                }
                initialState();
            }
        });
        this.cb34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb34", 1);
                    initialState();
                } else {
                    savePreferences("cb34", 0);
                }
                initialState();
            }
        });
        this.cb35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb35", 1);
                    initialState();
                } else {
                    savePreferences("cb35", 0);
                }
                initialState();
            }
        });
        this.cb36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb36", 1);

                    initialState();
                } else {
                    savePreferences("cb36", 0);
                }
                initialState();
            }
        });
        this.cb37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb37", 1);
                    initialState();
                } else {
                    savePreferences("cb37", 0);
                }
                initialState();
            }
        });
        this.cb38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb38", 1);
                    initialState();
                } else {
                    savePreferences("cb38", 0);
                }
                initialState();
            }
        });
        this.cb39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked()) {
                    savePreferences("cb39", 1);

                    initialState();
                } else {
                    savePreferences("cb39", 0);
                }
                initialState();
            }
        });
    }
}