package au.com.sheehanb.anglecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText aEditText;
    private EditText bEditText;
    private EditText cEditText;
    private EditText dEditText;
    private EditText eEditText;

    /*
    String aString = aEditText.getText().toString();
    String bString = bEditText.getText().toString();
    String cString = cEditText.getText().toString();
    String dString = dEditText.getText().toString();
    String eString = eEditText.getText().toString();
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aEditText = findViewById(R.id.a_editText);
        bEditText = findViewById(R.id.b_editText);
        cEditText = findViewById(R.id.c_editText);
        dEditText = findViewById(R.id.d_editText);
        eEditText = findViewById(R.id.e_editText);
    }

    public void calcAngle(View view) {
        System.out.println("test");
    }

    private void updateFigures(){}
}
