package com.example.prasanth.parcelable_learning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendDataActivity extends Activity {
public void onCreate(Bundle savedInstanceState)
{
    Button sendData;
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_layout);

    sendData=(Button)findViewById(R.id.name4);
    sendData.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String firsName,lastName,nickName;
            EditText fstName,lstName,nckName;
            fstName=(EditText)findViewById(R.id.name1);
            lstName=(EditText)findViewById(R.id.name2);
            nckName=(EditText)findViewById(R.id.name3);
            firsName=fstName.getText().toString();
            lastName=lstName.getText().toString();
            nickName=nckName.getText().toString();
            Toast.makeText(SendDataActivity.this,"SENDING TOTAL OBJECT USING PARCELABLE",Toast.LENGTH_LONG).show();
            ParcelabeData parcelableExample=new ParcelabeData(firsName,lastName,nickName);
            Intent intent=new Intent(SendDataActivity.this,DisplayDataActivity.class);
            Bundle b=new Bundle();
            b.putParcelable("parcelobject",parcelableExample);
            intent.putExtras(b);
            startActivity(intent);
        }
    });
}
}
