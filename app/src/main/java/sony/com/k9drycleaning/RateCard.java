package sony.com.k9drycleaning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class RateCard extends AppCompatActivity {

TextView pressShirt,pressPant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_card);

        pressShirt=findViewById(R.id.press_Rate_Shirt);

//        Intent intent=new Intent(RateCard.this,Drycleaning.class);
//        Bundle bundle=new Bundle();
//        bundle.putString("pressShirtRate",pressShirt.getText().toString());
//        intent.putExtras(bundle);
//        startActivity(intent);
    }
}
