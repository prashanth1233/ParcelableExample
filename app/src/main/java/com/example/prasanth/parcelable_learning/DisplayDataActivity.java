package com.example.prasanth.parcelable_learning;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayDataActivity extends Activity {
    public void onCreate(Bundle savedInstanceState)
    {
         TextView fstName,lstName,nckName;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_layout);
        ParcelabeData parcelabeData =getIntent().getParcelableExtra("parcelobject");
        String fName= parcelabeData.getName1();
        String lName= parcelabeData.getName2();
        String sweetName= parcelabeData.getName3();
        fstName=(TextView)findViewById(R.id.t1);
        lstName=(TextView)findViewById(R.id.t2);
        nckName=(TextView)findViewById(R.id.t3);
        fstName.setText("YOUR FIRST NAME IS "+fName);
        lstName.setText("YOUR LAST NAME IS "+lName);
        nckName.setText("YOUR SWEET NAME IS "+sweetName);
    }
}
