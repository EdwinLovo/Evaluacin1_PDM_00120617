package com.example.acer.evaluacin1_pdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.acer.evaluacin1_pdm.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView user,email,total;
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        user = findViewById(R.id.nameUser);
        email = findViewById(R.id.emaiUser);
        total = findViewById(R.id.total);

        t1 = findViewById(R.id.cont11);
        t2 = findViewById(R.id.cont22);
        t3 = findViewById(R.id.cont33);
        t4 = findViewById(R.id.cont44);
        t5 = findViewById(R.id.cont55);
        t6 = findViewById(R.id.cont66);
        t7 = findViewById(R.id.cont77);
        t8 = findViewById(R.id.cont88);
        t9 = findViewById(R.id.cont99);

        share = findViewById(R.id.share);

        Intent intent = getIntent();
        if(intent!=null){
            user.setText(intent.getStringExtra(AppConstant.user));
            email.setText(intent.getStringExtra(AppConstant.email));
            total.setText(intent.getStringExtra("total3"));
            t1.setText(intent.getStringExtra("c1"));
            t2.setText(intent.getStringExtra("c2"));
            t3.setText(intent.getStringExtra("c3"));
            t4.setText(intent.getStringExtra("c4"));
            t5.setText(intent.getStringExtra("c5"));
            t6.setText(intent.getStringExtra("c6"));
            t7.setText(intent.getStringExtra("c7"));
            t8.setText(intent.getStringExtra("c8"));
            t9.setText(intent.getStringExtra("c8"));

        }

        share.setOnClickListener(v->{
            String cadena ="Usuario: "+ user.getText().toString()+" Email: "+ email.getText().toString()+ " total: "+total.getText().toString();
            Intent mIntent = new Intent();
            mIntent.setType("text/plain");
            mIntent.setAction(Intent.ACTION_SEND);
            mIntent.putExtra(Intent.EXTRA_TEXT,cadena);
            startActivity(mIntent);
        });

    }
}
