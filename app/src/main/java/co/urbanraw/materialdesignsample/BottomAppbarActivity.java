package co.urbanraw.materialdesignsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.zip.Inflater;

public class BottomAppbarActivity extends AppCompatActivity {


    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_appbar);

        setTitle("Home Activity");
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        bottomAppBar = findViewById(R.id.bottomAppBar);
        floatingActionButton = findViewById(R.id.floatingButton);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(BottomAppbarActivity.this,"Floating Button Pressed!!", Toast.LENGTH_SHORT).show();
            }
        });



        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(BottomAppbarActivity.this,"Handle navigation icon press!", Toast.LENGTH_SHORT).show();
            }
        });


        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.search:
                        Toast.makeText(BottomAppbarActivity.this, "Search press!", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.more:
                        Toast.makeText(BottomAppbarActivity.this, "Title press!", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return BottomAppbarActivity.super.onOptionsItemSelected(item);
                }
            } });

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            //Back button press
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }




}