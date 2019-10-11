package com.example.borderlandscharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText characterInput;
    Button continueWithSelectedCharacter;
    Button selectNewCharacter;
    ImageView fl4kView;
    TextView fl4kBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterInput = findViewById(R.id.input_char);
        TextView main_header_title = findViewById(R.id.main_header_title);
        Button continueWithSelectedCharacter = findViewById(R.id.continue_with_selected_character);
        Button selectNewCharacter = findViewById(R.id.select_new_character);
        ImageView fl4kView = findViewById(R.id.fl4kView);
        TextView fl4kBio = findViewById(R.id.fl4kBio);
        //  ImageView amaraView = findViewById(R.id.amaraView); // setting these up for later for when I have them created
        //  TextView amaraBio = findViewById(R.id.amaraBio);
        //  ImageView mozeView = findViewById(R.id.mozeView);
        //  TextView mozeBio = findViewById(R.id.mozeBio);
        //  ImageView zaneView = findViewById(R.id.zaneView);
        //  TextView zaneBio = findViewById(R.id.zaneBio);

    }

    public void VerifyCharacterClick(View view) {
        characterInput = findViewById(R.id.input_char);
        String charName = characterInput.getText().toString().trim();
        Log.d("Character Name" , characterInput.getText().toString());

        if /*(charName == "FL4K")*/ (characterInput.getText().toString().trim().length() < 1)
    {
            continueWithSelectedCharacter.setVisibility(View.GONE);
            characterInput.setVisibility(View.GONE);
            fl4kView.setVisibility(View.VISIBLE);
            fl4kBio.setVisibility(View.VISIBLE);
            selectNewCharacter.setVisibility(View.VISIBLE);

        }
        else if (characterInput.getText().toString() == "Amara"){
            continueWithSelectedCharacter.setVisibility(View.GONE);
            characterInput.setVisibility(View.GONE);
            //amaraView.setVisibility(View.VISIBLE);
            //amaraBio.setVisibility(View.VISIBLE);
            selectNewCharacter.setVisibility(View.VISIBLE);
        }
        else if (characterInput.getText().toString() == "Moze"){
            continueWithSelectedCharacter.setVisibility(View.GONE);
            characterInput.setVisibility(View.GONE);
            //mozeView.setVisibility(View.VISIBLE);
            //mozeBio.setVisibility(View.VISIBLE);
            selectNewCharacter.setVisibility(View.VISIBLE);
        }
        else if (characterInput.getText().toString() == "Zane"){
            continueWithSelectedCharacter.setVisibility(View.GONE);
            characterInput.setVisibility(View.GONE);
            //zaneView.setVisibility(View.VISIBLE);
            //zaneBio.setVisibility(View.VISIBLE);
            selectNewCharacter.setVisibility(View.VISIBLE);
        }
        else {
            Toast.makeText(this, "Staaiirs! I can't climb stairs!", Toast.LENGTH_SHORT).show();
        }


        // Do something to validate the name entered into the EditText characterInput
        // For Example:
        // if characterInput text == Fl4k
        // {
        //    DO STUFF HERE TO SHOW HIDE VISIBILITY and update TextViews with text and matching colors
        //      **HINT HINT CHECK OUT colors.xml and use it as a R. (google how to use colors.xml in MainActivity)
        // }


    }

    public void ResetToCharacterSelection(View view) {

        // Do something to change the visibilities for all views
        // Hide/Gone the views for characters
        // show the main title, edittext and button
    }
}
