package sg.edu.rp.c346.id21027604.viewmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class modulepage1 extends AppCompatActivity {

    TextView bigMod;
    TextView modDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulepage1);

        bigMod = findViewById(R.id.mod);
        modDetails = findViewById(R.id.modDetails);

        Intent intentReceived = getIntent();
        String selectModule = intentReceived.getStringExtra("module");

        if(selectModule.trim().equalsIgnoreCase("C218")){
            String modName = intentReceived.getStringExtra("modName1");
            String modYear = intentReceived.getStringExtra("modYr1");
            String modSem = intentReceived.getStringExtra("modSem1");
            String modCredit = intentReceived.getStringExtra("modCredit1");
            String modVenue = intentReceived.getStringExtra("modVenue1");

            modDetails.setText("Module Code: " + selectModule + "\nModule Name: " + modName + "\nAcademic Year: " + modYear +
                    "\nSemester: " + modSem + "\nModule Credit: " + modCredit + "\nVenue: " + modVenue);
        }
    }
}