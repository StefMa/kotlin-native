package basiccalculator.konan.jetbrains.org.basiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import org.konan.basiccalculator.BasicCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BasicCalculator calculator = new BasicCalculator();
        final TextView output = findViewById(R.id.calculator_output);
        output.setText(
                new StringBuilder()
                        .append("1+1=").append(calculator.plus(1, 1))
                        .append("\n").append("1-1=").append(calculator.minus(1, 1))
                        .append("\n").append("1*1=").append(calculator.mult(1, 1))
                        .append("\n").append("1/1=").append(calculator.div(1, 1))
                        .append("\n").append("1 == ").append(calculator.number(1))
                        .toString()
        );
    }
}
