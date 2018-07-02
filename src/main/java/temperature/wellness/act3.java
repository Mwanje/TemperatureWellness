package temperature.wellness;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class act3 extends mainact {
    EditText input;
    TextView mTextview;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act3);
        mTextview = (TextView) findViewById(R.id.textView);

        input = (EditText) findViewById(R.id.editText1);
        Button Button1;

        Button1 = (Button) findViewById(R.id.button3);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double temp = Double.parseDouble("0" + input.getText().toString());
                if (temp >= 36 && temp <= 37.5) {
                    String w = "Normal";
                    TextView output = (TextView) findViewById(R.id.textView);
                    output.setText(w);

                } else {
                    String x = "Abnormal";
                    TextView output = (TextView) findViewById(R.id.textView);
                    output.setText(x);
                }

            }
        });

    }

}



