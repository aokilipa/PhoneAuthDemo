package ke.co.citesoft.phoneauthdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity {

    @BindView(R.id.etPhoneNumber)
    EditText _phoneNumber;
    @BindView(R.id.btnNext)
    Button _btnNext;

    String phoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);

        _btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendPhone();
            }
        });
    }

    public void sendPhone(){
        phoneNumber = _phoneNumber.getText().toString();
        Intent intent = new Intent(SignUpActivity.this, PhoneVerificationActivity.class);
        intent.putExtra("phone_number", phoneNumber);
        startActivity(intent);
    }
}
