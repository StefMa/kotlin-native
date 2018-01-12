package basiccalculator.konan.jetbrains.org.basiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import org.konan.arithmeticparser.Calculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calculator calculator = new Calculator();
    }
}
