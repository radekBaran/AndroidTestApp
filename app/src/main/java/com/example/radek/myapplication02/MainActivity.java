package com.example.radek.myapplication02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String OPTION_1 = "Option 1";
    private static final String OPTION_2 = "Option 2";
    private static final String OPTION_3 = "Option 3";
    private static final String OPTION_4 = "Option 4";

    @BindView(R.id.submit_button) Button mButtonSubmit;
    @BindView(R.id.cancel_button) Button mButtonCancel;

    @BindView(R.id.name_edit_text) EditText mEditTextName;
    @BindView(R.id.surname_edit_text) EditText mEditTextSurname;
    @BindView(R.id.phone_edit_text) EditText mEditTextPhone;
    @BindView(R.id.email_edit_text) EditText mEditTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        editTextHints();
        Log.d("Komunikat !", "CREATE");
    }

    @Override
    protected void onStop() {
        Log.d("Komunikat !", "STOP!");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.d("Komunikat !", "PAUSE!");
        super.onPause();
    }

    @Override
    protected void onPostResume() {
        Log.d("Komunikat !", "Resume!");
        super.onPostResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is parent.
        menu.add(1,1,1, OPTION_1);
        menu.add(2,2,2, OPTION_2);
        menu.add(3,3,3, OPTION_3);
        menu.add(4,4,4, OPTION_4);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Kliknięto "+ item.getItemId(), Toast.LENGTH_SHORT).show();
        int id = item.getItemId();

        if(String.valueOf(id).equals(OPTION_1)){
            Toast.makeText(this, "Klik Option 1", Toast.LENGTH_SHORT).show();
        } else if(String.valueOf(id).equals(OPTION_2)){
            Toast.makeText(this, "Klik Option 2", Toast.LENGTH_SHORT).show();
        } else if(String.valueOf(id).equals(OPTION_3)){
            Toast.makeText(this, "Klik Option 3", Toast.LENGTH_SHORT).show();
        } else if(String.valueOf(id).equals(OPTION_4)){
            Toast.makeText(this, "Klik Option 4", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @OnClick(R.id.cancel_button)
    public void onClickCancelButton(){
        Toast.makeText(this, "Kliknięto; "+ mButtonCancel.getText(), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.submit_button)
    public void onClickSubmitButton(){
        Toast.makeText(this, "Kliknięto: "+ mButtonSubmit.getText(), Toast.LENGTH_SHORT).show();
    }

    public void editTextHints(){
        mEditTextName.setHint("Your name");
        mEditTextSurname.setHint("Your surname");
        mEditTextPhone.setHint("Your phone");
        mEditTextEmail.setHint("Your e-mail");
    }
}
