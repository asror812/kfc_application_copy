package com.example.app_v4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    ImageView flagButton;


    Button signIn;

    TextView haveAnAccount;

    Button signUp;

    Button homeButton;
    Button menuButton;
    Button profileButton;
    Button nextButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flagButton = findViewById(R.id.flagButton);

        flagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLanguageBottomSheet();
            }
        });


        signIn = findViewById(R.id.sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSignInBottomSheet();
            }
        });

        signUp = findViewById(R.id.sign_up);

        signUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){showSignInBottomSheet();}
        });

    }

    private void showSignInBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View bottomSheetView = getLayoutInflater().inflate(R.layout.sign_in_bottom_sheet, null);
        bottomSheetDialog.setContentView(bottomSheetView);

        bottomSheetDialog.show();

    }

    private void showLanguageBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View bottomSheetView = getLayoutInflater().inflate(R.layout.language_bottom_sheet, null);
        bottomSheetDialog.setContentView(bottomSheetView);

        RadioGroup radioGroup = bottomSheetView.findViewById(R.id.languageRadioGroup);
        Button saveButton = bottomSheetView.findViewById(R.id.saveLanguageButton);


        saveButton.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            haveAnAccount = findViewById(R.id.have_an_account);
            signUp = findViewById(R.id.sign_up);

            homeButton = findViewById(R.id.homeButton);
            menuButton = findViewById(R.id.menuButton);
            profileButton = findViewById(R.id.profileButton);
            nextButton = findViewById(R.id.nextButton);

            if (selectedId != -1) {
                if (selectedId == R.id.uzRadio) {
                    homeButton.setText("Uy");
                    menuButton.setText("Menyu");
                    profileButton.setText("Profil");
                    nextButton.setText("Keyingisi");
                    signIn.setText("Tizimga kirish");
                    haveAnAccount.setText("Shaxsiy akkauntingiz yo'qmi?");
                    signUp.setText("Hoziroq ro'yhatdan uting");
                    flagButton.setImageResource(R.drawable.uzbekistan);
                } else if (selectedId == R.id.enRadio) {
                    homeButton.setText("Home");
                    menuButton.setText("Menu");
                    profileButton.setText("Profile");
                    nextButton.setText("More");
                    signIn.setText("Sign in");
                    haveAnAccount.setText("Dont hava an account?");
                    signUp.setText("Sign up now");
                    flagButton.setImageResource(R.drawable.united_kingdom); // English flag
                } else if (selectedId == R.id.ruRadio) {
                    homeButton.setText("Дом");
                    menuButton.setText("Меню");
                    profileButton.setText("Профиль");
                    nextButton.setText("Далее");
                    signIn.setText("Войти");
                    haveAnAccount.setText("У вас нет учетной записи?");
                    signUp.setText("Зарегистрироваться сейчас");
                    flagButton.setImageResource(R.drawable.russia); // Russian flag
                }
            }
            bottomSheetDialog.dismiss();
        });

        bottomSheetDialog.show();
    }
}