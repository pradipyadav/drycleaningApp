package sony.com.k9drycleaning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclearView extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclear_view);

        RecyclerView programingList=findViewById(R.id.recyclearView);
        programingList.setLayoutManager(new LinearLayoutManager(this));

        String[] values={};

        programingList.setAdapter(new RecyclearAdapter(values));
    }
}
