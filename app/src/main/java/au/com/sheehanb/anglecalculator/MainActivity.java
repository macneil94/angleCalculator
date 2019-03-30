package au.com.sheehanb.anglecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText aEditText;
    private EditText bEditText;
    private EditText cEditText;
    private EditText dEditText;
    private EditText eEditText;

    public final String LOG_TAG = "angle_calculator";

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
        System.out.println("aEditText.getText() = " + aEditText.getText());

        double width = Double.parseDouble(aEditText.getText().toString());
        double angle = Double.parseDouble(dEditText.getText().toString());

        double backcut = calc_backcut(width, angle);
        double cutlength = calc_cutlength(width, angle);

        Log.d(LOG_TAG, "backcut = " + backcut);
        Log.d(LOG_TAG, "cutlength = " + cutlength);
    }

    public void update_fields(){}

    public double calc_backcut(double a, double d) {
        Log.d("angle_calculator", "calc_backcut: a=" + a + " d=" + d);

        d = Math.toRadians(d);

        double tanD = Math.tan(d);

        return a / tanD;
    }

    public double calc_cutlength(double a, double d) {
        Log.d(LOG_TAG, "calc_cutlength: a=" + a + " d=" + d);
        return a / (Math.sin(d));
    }

    private void updateFigures(){}
}
