package proyecto2.app1.com.example.pc.c175;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton1, boton2, boton3, boton4, boton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);
        boton5 = (Button) findViewById(R.id.boton5);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_nav, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        try {
            switch (view.getId()) {
                case R.id.boton1:
                    MainNavActivity.option=1;
                    Intent i1 = new Intent(this, MainNavActivity.class);
                    startActivity(i1);
                    BlankFragment fragment1 = new BlankFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction FragmentTransaction = fragmentManager.beginTransaction();
                    FragmentTransaction.add(R.id.activity2, fragment1, null);
                    return;

                case R.id.boton2:
                    MainNavActivity.option=2;
                    Intent in = new Intent(this, MainNavActivity.class);
                    startActivity(in);
                    return;
                case R.id.boton3:
                    MainNavActivity.option=3;
                    Intent i =new Intent(this, MainNavActivity.class);
                    startActivity(i);
                    return;
                case R.id.boton4:
                    MainNavActivity.option=4;
                    Intent i2 = new Intent(this, MainNavActivity.class);
                    startActivity(i2);
                    return;
                case R.id.boton5:
                    MainNavActivity.option=5;
                    Intent i3 = new Intent(this, MainNavActivity.class);
                    startActivity(i3);
                    return;


            }
        } catch (Exception e) {
            System.out.print("Verifique valores ingresados");
        }

    }


}
