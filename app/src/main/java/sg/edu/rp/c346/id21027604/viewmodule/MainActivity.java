package sg.edu.rp.c346.id21027604.viewmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome;
    TextView module1;
    ImageView image1;
    TextView module2;
    ImageView image2;
    TextView module3;
    ImageView image3;
    TextView module4;
    ImageView image4;
    TextView module5;
    ImageView image5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = findViewById(R.id.welcome);
        module1 = findViewById(R.id.module1);
        image1 = findViewById(R.id.imageView);
        module2 = findViewById(R.id.module2);
        image2 = findViewById(R.id.imageView2);
        module3 = findViewById(R.id.module3);
        image3 = findViewById(R.id.imageView3);
        module4 = findViewById(R.id.module4);
        image4 = findViewById(R.id.imageView4);
        module5 = findViewById(R.id.module5);
        image5 = findViewById(R.id.imageView5);

        module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, modulepage1.class);
                intent.putExtra("module","C218");
                intent.putExtra("modName1","UI/UX Design For Apps");
                intent.putExtra("modYr1","2022");
                intent.putExtra("modSem1", "1");
                intent.putExtra("modCredit1", "4");
                intent.putExtra("modVenue1", "E66B");
                startActivity(intent);
            }
        });
        module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, modulepage1.class);
                intent2.putExtra("module", "C346");
                intent2.putExtra("modName2", "Android Programming");
                intent2.putExtra("modYr2", "2022");
                intent2.putExtra("modSem2", "1");
                intent2.putExtra("modCredit2", "4");
                intent2.putExtra("modVenue2", "E62E");
                startActivity(intent2);
            }
        });
        module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, modulepage1.class);
                intent3.putExtra("module", "C206");
                intent3.putExtra("modName3", "Software Development Process");
                intent3.putExtra("modYr3", "2022");
                intent3.putExtra("modSem3", "1");
                intent3.putExtra("modCredit3", "4");
                intent3.putExtra("modVenue3", "E66K");
                startActivity(intent3);
            }
        });
        module4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, modulepage1.class);
                intent4.putExtra("module", "C203");
                intent4.putExtra("modName4", "Web Application in PHP");
                intent4.putExtra("modYr4", "2022");
                intent4.putExtra("modSem4", "1");
                intent4.putExtra("modCredit4", "4");
                intent4.putExtra("modVenue4", "W65H");
                startActivity(intent4);
            }
        });
        module5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, modulepage1.class);
                intent5.putExtra("module", "C235");
                intent5.putExtra("modName4", "IT Security and Management");
                intent5.putExtra("modYr4", "2022");
                intent5.putExtra("modSem4", "1");
                intent5.putExtra("modCredit4", "4");
                intent5.putExtra("modVenue4", "E65H");
                startActivity(intent5);
            }
        });
    }
}