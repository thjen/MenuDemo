package com.example.qthjen.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        /** hàm tạo giao diện menu**/
        getMenuInflater().inflate(R.menu.activity_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** sự kiện trong menu **/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mnSettting:
                Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnAdd:
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnAbout:
                Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnHelp:
                Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnExit:
                System.exit(0);
                break;
            case R.id.mm2Email:
                Toast.makeText(MainActivity.this, "Email", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mm2Sdt:
                Toast.makeText(MainActivity.this, "Phone number", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
