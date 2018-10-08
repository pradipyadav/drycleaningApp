package sony.com.k9drycleaning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends AppCompatActivity {

    EditText editTextName,editTextContact,editTextFeedback;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
//
//        editTextName=findViewById(R.id.editTextName);
//        editTextContact=findViewById(R.id.editTextContact);
//        editTextFeedback=findViewById(R.id.editTextFeedback);
//
//        btnSubmit=findViewById(R.id.btnSubmit);
    }
}
