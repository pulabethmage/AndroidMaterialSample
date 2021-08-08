package co.urbanraw.materialdesignsample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {

    AutoCompleteTextView editTextFilledExposedDropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        setTitle("Home Activity");

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button


        // Populting the dropdwon or Spinner
        String[] type = new String[] {"Bed-sitter", "Single", "1- Bedroom", "2- Bedroom","3- Bedroom"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, R.layout.dropdown_menu_popup_item, type);

         editTextFilledExposedDropdown = findViewById(R.id.filled_exposed_dropdown);
        editTextFilledExposedDropdown.setAdapter(adapter);
        //End  Populting the dropdwon or Spinner


    }


    public void btn_fab_click(View v)
    {
        Toast.makeText(HomeActivity.this,  editTextFilledExposedDropdown.getText(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(HomeActivity.this,BottomAppbarActivity.class);
        startActivity(intent);
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