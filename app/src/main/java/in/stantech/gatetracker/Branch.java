package in.stantech.gatetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Branch extends AppCompatActivity {
Button ec,ee,cs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        ec=findViewById(R.id.btnec);
        ee=findViewById(R.id.btnee);
        cs=findViewById(R.id.btncs);
        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Branch.this,MainActivity.class);
                startActivity(i);

            }
        });

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Branch.this,EEMainActivity.class);
                startActivity(i);

            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Branch.this,CSMainActivity.class);
                startActivity(i);

            }
        });

    }
}
