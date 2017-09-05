package gaugechart.ssa.alrais.custom_gauge_ssa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import gaugechart.ssa.alrais.customgaugechart.CustomGauge;


public class MainActivity extends AppCompatActivity {

    CustomGauge guage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guage =(CustomGauge)findViewById(R.id.gauge2);
        TextView text =(TextView)findViewById(R.id.textView2);
        guage.setEndValue(10000);
        String i ="6544";
        Double d=Double.parseDouble(i);
        Log.i("chekedmode",d.toString());
        guage.setGauge(this,guage,d,60,text);
//        text.setText(Double.toString(curr_value));




    }
}
