package ke.co.testpinterestlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class MainActivity extends AppCompatActivity {

    AppCompatButton buttonAboutAlc,buttonMyProfile;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonAboutAlc= findViewById(R.id.buttonAboutAlc);
        buttonMyProfile= findViewById(R.id.buttonMyProfile);

        buttonAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {


                startActivity(new Intent(context,AboutAlcActivity.class));
            }
        });

        buttonMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                startActivity(new Intent(context,MyProfileActivity.class));

            }
        });

    }




}
