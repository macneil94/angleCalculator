package au.com.sheehanb.anglecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText aEditText;
    private EditText bEditText;
    private EditText cEditText;
    private EditText dEditText;

    public final String LOG_TAG = "angle_calculator";

    DecimalFormat doubleFormat = new DecimalFormat("###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aEditText = findViewById(R.id.a_editText); // a - width
        bEditText = findViewById(R.id.b_editText);
        cEditText = findViewById(R.id.c_editText);
        dEditText = findViewById(R.id.d_editText); // d - angle
    }

    public void calcAngle(View view) {

        double width = Double.parseDouble(aEditText.getText().toString());
        double angle = Double.parseDouble(dEditText.getText().toString());

        double backcut = calc_backcut(width, angle);
        double cutlength = calc_cutlength(width, angle);

        update_fields(backcut, cutlength);

    }

    public void update_fields(double backcut, double cutlength) {
        bEditText.setText(doubleFormat.format(backcut));
        cEditText.setText(doubleFormat.format(cutlength));
    }

    // b - backcut
    public double calc_backcut(double a, double d) {
        d = Math.toRadians(d);

        double tanD = Math.tan(d);

        return a / tanD;
    }

    //  c - cutlength
    public double calc_cutlength(double a, double d) {
        d = Math.toRadians(d);

        double sinD = Math.sin(d);

        return a / sinD;
    }
}
