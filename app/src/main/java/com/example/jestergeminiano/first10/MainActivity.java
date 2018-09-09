package com.example.jestergeminiano.first10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView firstTenOutput = (TextView) findViewById(R.id.firstTenEven);
                int targetEvenCount = 10;
                int currEvenCount = 0;

                // the below for loop will continue to run as long as the number of
                // even numbers found are less than the target number of even numbers
                // you want to print.
                for(int i=1;currEvenCount<targetEvenCount;i++)
                {
                    // This is condition which finds if current value in i is an even or not
                    // if its an even number, currEvenCount is incremented by 1.
                    if(i%2==0)
                    {
                        currEvenCount++;

                        firstTenOutput.append(String.valueOf(i));
                        firstTenOutput.append("\n"); // for new line
                    }
                }

            }
        });
    }
}
