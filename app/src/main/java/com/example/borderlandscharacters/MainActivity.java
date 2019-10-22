package com.example.borderlandscharacters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText characterInput;
    Button continueWithSelectedCharacter;
    Button selectNewCharacter;
    ImageView charView;
    ScrollView charScroll;
    TextView charBio;
    TextView main_header_title;
    TextView charTitle;
    ConstraintLayout background;
    int defaultColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterInput = findViewById(R.id.input_char);

        /*   TODO: NOTES FROM BAILEYBREW
         *   These are declared as GLOBAL and LOCAL which means that the GLOBAL references aren't getting updated,
         *   because your code assumes that the local is what needs the assignment --- get rid of the declarations
         *   in front of the view names - This will apply those declarations to the GLOBAL refs instead of LOCAL
         *
         *   IE: TextView main_header_title = findViewById(R.id.main_header_title);
         *   becomes: main_header_title = findViewById(R.id.main_header_title);
         */

        main_header_title = findViewById(R.id.main_header_title);
        continueWithSelectedCharacter = findViewById(R.id.continue_with_selected_character);
        selectNewCharacter = findViewById(R.id.select_new_character);
        charView = findViewById(R.id.fl4kView);
        charScroll = findViewById(R.id.charScroll);
        charBio = findViewById(R.id.charBio);
        charTitle = findViewById(R.id.charTitle);
        background = findViewById(R.id.background);

    }

    public void VerifyCharacterClick(View view) {

        String charName = characterInput.getText().toString().trim();


        Log.d("Char Name", charName);


            continueWithSelectedCharacter.setVisibility(View.GONE);
            characterInput.setVisibility(View.GONE);
            main_header_title.setVisibility(View.GONE);
            selectNewCharacter.setVisibility(View.VISIBLE);
            charScroll.setVisibility(View.VISIBLE);
            charView.setVisibility(View.VISIBLE);
            charTitle.setVisibility(View.VISIBLE);
            background.setBackgroundColor(defaultColor);
            int defaultColor = getResources().getColor(R.color.noCharacterSelected);
            int colorPrimaryFL4k = getResources().getColor(R.color.colorPrimaryFl4k);
            int colorSecondaryFL4K = getResources().getColor(R.color.colorSecondaryFl4k);
            int colorAccentFL4K = getResources().getColor(R.color.colorAccentFl4k);

            String character = charName;
            switch (character){
                case "FL4K":
                    charBio.setText("An emergent AI driven in an ongoing quest for self-discovery, FL4K wanders from world to world accompanied by beasts. While they feel an connection with the primal wisdom of animals, the social construct of humans are strange to them. On their endless hunt, FL4K’s loyal Skag, Spiderant, and Jabber companions help them track and claim their quarry, be it human, Vault Monster, or anything in between.");
                    charBio.setTextColor(colorSecondaryFL4K);
                    charView.setImageResource(R.drawable.fl4k);
                    charTitle.setText("FL4K");
                    charTitle.setTextColor(colorAccentFL4K);
                    background.setBackgroundColor(colorPrimaryFL4k);


                    break;
                case "Moze":
                    charBio.setText("Once a soldier in the Vladof army’s Ursa Corps, Moze left their service to pursue her own mercenary interests and hunt for Vaults.When the going gets tough, she can use her digistruct pack to summon her heavy mech “Iron Bear” and face down an army without flinching, using powerful mounted weapons to mow the opposition down. A veteran of wars from across the six galaxies, Moze and Iron Bear are a force to be reckoned with.");
                    charView.setImageResource(R.drawable.moze);
                    charTitle.setText("Moze");
                    break;
                case "Amara":
                    charBio.setText("A hero born in the slums of Partali, Amara is most at home on the battlefield or in a brawl. Never content to stand idly by, she uses her Siren abilities, to smash oppressors and dismantle her foes. While in her Phasetrance, she channels her Siren energy to form powerful arms that can shoot blasts of force or crush enemies in their grip. Brash, aggressive, and self-assured, Amara doesn’t let anything stand in her way.");
                    charView.setImageResource(R.drawable.amara);
                    charTitle.setText("Amara");
                    break;
                case "Zane":
                    charBio.setText("Zane Flynt, brother of the infamous bandits Captain and Baron Flynt, has been around the galactic block more than a few times. Over the years, he’s worked for, against, and along with every major corporation conducting espionage and assassination for the highest bidder. With cutting edge technology and decades of mercenary experience, Zane uses his Sentinel Drone and other gadgets to disorient, disrupt, and destroy his targets.");
                    charView.setImageResource(R.drawable.zane);
                    charTitle.setText("Zane");
                    break;
                default:
                    continueWithSelectedCharacter.setVisibility(View.VISIBLE);
                    characterInput.setVisibility(View.VISIBLE);
                    main_header_title.setVisibility(View.VISIBLE);
                    selectNewCharacter.setVisibility(View.GONE);
                    charScroll.setVisibility(View.GONE);
                    charView.setVisibility(View.GONE);
                    charTitle.setVisibility(View.GONE);
                    background.setBackgroundColor(defaultColor);

                    Toast.makeText(this, "Please enter a Borderlands 3 Character", Toast.LENGTH_SHORT).show();


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
        continueWithSelectedCharacter.setVisibility(View.VISIBLE);
        characterInput.setVisibility(View.VISIBLE);
        main_header_title.setVisibility(View.VISIBLE);
        selectNewCharacter.setVisibility(View.GONE);
        selectNewCharacter.setVisibility(View.GONE);
        charScroll.setVisibility(View.GONE);
        charView.setVisibility(View.GONE);
        charTitle.setVisibility(View.GONE);
        characterInput.setText("");
        background.setBackgroundColor(defaultColor);
        Toast.makeText(this, "So, you want to hear another story, huh? One where the very fate of Pandora hangs in the balance?", Toast.LENGTH_LONG).show();

        // Do something to change the visibilities for all views
        // Hide/Gone the views for characters
        // show the main title, edittext and button
    }
}
