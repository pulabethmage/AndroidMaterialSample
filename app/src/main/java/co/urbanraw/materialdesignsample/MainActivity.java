package co.urbanraw.materialdesignsample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends Activity {

    TextInputLayout etAddress_layout;
    TextInputEditText etaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAddress_layout = findViewById(R.id.lay04);
        etaddress = findViewById(R.id.et_address);


        etAddress_layout.setEndIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, etaddress.getText(), Toast.LENGTH_SHORT).show();
            }
        });




    }

        public void btn_click(View v)
        {
            Toast.makeText(MainActivity.this, "Button Clicked!!", Toast.LENGTH_SHORT).show();
        }

}