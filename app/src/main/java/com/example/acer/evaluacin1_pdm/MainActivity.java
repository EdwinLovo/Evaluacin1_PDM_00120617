package com.example.acer.evaluacin1_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.acer.evaluacin1_pdm.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private LinearLayout l1,l2,l3,l5,l4,l6,l7,l8,l9;
    private EditText usuario,correo;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.linear1);
        l2 = findViewById(R.id.linear2);
        l3 = findViewById(R.id.linear3);
        l4 = findViewById(R.id.linear4);
        l5 = findViewById(R.id.linear5);
        l6 = findViewById(R.id.linear6);
        l7 = findViewById(R.id.linear7);
        l8 = findViewById(R.id.linear8);
        l9 = findViewById(R.id.linear9);

        t1 = findViewById(R.id.cont1);
        t2 = findViewById(R.id.cont2);
        t3 = findViewById(R.id.cont3);
        t4 = findViewById(R.id.cont4);
        t5 = findViewById(R.id.cont5);
        t6 = findViewById(R.id.cont6);
        t7 = findViewById(R.id.cont7);
        t8 = findViewById(R.id.cont8);
        t9 = findViewById(R.id.cont9);

        usuario = findViewById(R.id.usuario);
        correo = findViewById(R.id.correo);
        boton = findViewById(R.id.enviar);

        l1.setOnClickListener(v->{
            AppConstant.cont1= Integer.parseInt(t1.getText().toString());
            AppConstant.cont1++;
            t1.setText(Integer.toString(AppConstant.cont1));
        });

        l2.setOnClickListener(v->{
            AppConstant.cont2= Integer.parseInt(t2.getText().toString());
            AppConstant.cont2++;
            t2.setText(Integer.toString(AppConstant.cont2));
        });

        l3.setOnClickListener(v->{
            AppConstant.cont3= Integer.parseInt(t3.getText().toString());
            AppConstant.cont3++;
            t3.setText(Integer.toString(AppConstant.cont3));
        });

        l4.setOnClickListener(v->{
            AppConstant.cont4= Integer.parseInt(t4.getText().toString());
            AppConstant.cont4++;
            t4.setText(Integer.toString(AppConstant.cont4));
        });

        l5.setOnClickListener(v->{
            AppConstant.cont5= Integer.parseInt(t5.getText().toString());
            AppConstant.cont5++;
            t5.setText(Integer.toString(AppConstant.cont5));
        });

        l6.setOnClickListener(v->{
            AppConstant.cont6= Integer.parseInt(t6.getText().toString());
            AppConstant.cont6++;
            t6.setText(Integer.toString(AppConstant.cont6));
        });

        l7.setOnClickListener(v->{
            AppConstant.cont7= Integer.parseInt(t7.getText().toString());
            AppConstant.cont7++;
            t7.setText(Integer.toString(AppConstant.cont7));
        });

        l8.setOnClickListener(v->{
            AppConstant.cont8= Integer.parseInt(t8.getText().toString());
            AppConstant.cont8++;
            t8.setText(Integer.toString(AppConstant.cont8));
        });

        l9.setOnClickListener(v->{
            AppConstant.cont9= Integer.parseInt(t9.getText().toString());
            AppConstant.cont9++;
            t9.setText(Integer.toString(AppConstant.cont9));
        });

        boton.setOnClickListener(v->{
            String user = usuario.getText().toString();
            String email = correo.getText().toString();
            int c1 = AppConstant.cont1;
            int total = AppConstant.cont1+AppConstant.cont2+AppConstant.cont3+AppConstant.cont4+AppConstant.cont5+AppConstant.cont6+AppConstant.cont7+AppConstant.cont8+AppConstant.cont9;
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra(AppConstant.user,user);
            intent.putExtra(AppConstant.email,email);
            intent.putExtra("total3",total+"");
            intent.putExtra("c1",AppConstant.cont1+"");
            intent.putExtra("c2",AppConstant.cont2+"");
            intent.putExtra("c3",AppConstant.cont3+"");
            intent.putExtra("c4",AppConstant.cont4+"");
            intent.putExtra("c5",AppConstant.cont5+"");
            intent.putExtra("c6",AppConstant.cont6+"");
            intent.putExtra("c7",AppConstant.cont7+"");
            intent.putExtra("c8",AppConstant.cont8+"");
            intent.putExtra("c9",AppConstant.cont9+"");

            startActivity(intent);
        });

    }
}
