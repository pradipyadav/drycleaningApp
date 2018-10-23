package sony.com.k9drycleaning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Press extends AppCompatActivity {


    EditText qPressShirt,qPressPant,qPressShirtStarch,qPressPantStarch,qPressKurta,qPressKurta2piece,qPressTop,
            qPressSalwar,qPressDupatta,qPressSaree,qPressShaluPaithani,qPressNavwari,qPressBlause,qPressPunjabiSuit,
            qPressDhotarSohale,qPressCoat,qPressSherwani,qPressSweater,qPressbedsheetSingle,qPressbedsheetDouble,
            qPressSolaSingChadar,qPressSolaDoubleChadar,qPressBlanketSingle,qPressBlanketDouble,qPressCarSeatCover,
            qPressSchoolBag,qPressCarpet,qPressColor,qPressTotal,rPressTotal;

    TextView rPressShirt,rPressPant,rPressShirtStarch,rPressPantStarch,rPressKurta,rPressKurta2piece,rPressTop,
            rPressSalwar,rPressDupatta,rPressSaree,rPressShaluPaithani,rPressNavwari,rPressBlause,rPressPunjabiSuit,
            rPressDhotarSohale,rPressCoat,rPressSherwani,rPressSweater,rPressbedsheetSingle,rPressbedsheetDouble,
            rPressSolaSingChadar,rPressSolaDoubleChadar,rPressBlanketSingle,rPressBlanketDouble,rPressCarSeatCover,
            rPressSchoolBag,rPressCarpet,rPressColor;

    int x=0;


    Button btnPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press);

//      EditText***********************************************************************************

        qPressShirt=findViewById(R.id.qPressShirt);
        qPressPant=findViewById(R.id.qPressPant);
        qPressShirtStarch=findViewById(R.id.qPressShirtStarch);
        qPressPantStarch=findViewById(R.id.qPressPantStarch);
        qPressKurta=findViewById(R.id.qPressKurta);
        qPressKurta2piece=findViewById(R.id.qPressKurta2piece);
        qPressSalwar=findViewById(R.id.qPressSalwar);
        qPressDupatta=findViewById(R.id.qPressDupatta);
        qPressSaree=findViewById(R.id.qPressSaree);
        qPressShaluPaithani=findViewById(R.id.qPressShaluPaithani);
        qPressNavwari=findViewById(R.id.qPressNavwari);
        qPressBlause=findViewById(R.id.qPressBlause);
        qPressPunjabiSuit=findViewById(R.id.qPressPunjabiSuit);
        qPressTop=findViewById(R.id.qPressTop);
        qPressDhotarSohale=findViewById(R.id.qPressDhotarSohale);
        qPressCoat=findViewById(R.id.qPressCoat);
        qPressSherwani=findViewById(R.id.qPressSherwani);
        qPressSweater=findViewById(R.id.qPressSweater);
        qPressbedsheetSingle=findViewById(R.id.qPressbedsheetSingle);
        qPressbedsheetDouble=findViewById(R.id.qPressbedsheetDouble);
        qPressSolaSingChadar=findViewById(R.id.qPressSolaSingChadar);
        qPressSolaDoubleChadar=findViewById(R.id.qPressSolaDoubleChadar);
        qPressBlanketSingle=findViewById(R.id.qPressBlanketSingle);
        qPressBlanketDouble=findViewById(R.id.qPressBlanketDouble);
        qPressCarSeatCover=findViewById(R.id.qPressCarSeatCover);
        qPressSchoolBag=findViewById(R.id.qPressSchoolBag);
        qPressColor=findViewById(R.id.qPressColor);
        qPressCarpet=findViewById(R.id.qPressCarpet);
        qPressTotal=findViewById(R.id.qPressTotal);
        rPressTotal=findViewById(R.id.rPressTotal);


//        TextView*********************************************************************


        rPressShirt=findViewById(R.id.rPressShirt);
        rPressPant=findViewById(R.id.rPressPant);
        rPressShirtStarch=findViewById(R.id.rPressShirtStarch);
        rPressPantStarch=findViewById(R.id.rPressPantStarch);
        rPressKurta=findViewById(R.id.rPressKurta);
        rPressKurta2piece=findViewById(R.id.rPressKurta2piece);
        rPressSalwar=findViewById(R.id.rPressSalwar);
        rPressDupatta=findViewById(R.id.rPressDupatta);
        rPressSaree=findViewById(R.id.rPressSaree);
        rPressShaluPaithani=findViewById(R.id.rPressShaluPaithani);
        rPressNavwari=findViewById(R.id.rPressNavwari);
        rPressBlause=findViewById(R.id.rPressBlause);
        rPressPunjabiSuit=findViewById(R.id.rPressPunjabiSuit);
        rPressTop=findViewById(R.id.rPressTop);
        rPressDhotarSohale=findViewById(R.id.rPressDhotarSohale);
        rPressCoat=findViewById(R.id.rPressCoat);
        rPressSherwani=findViewById(R.id.rPressSherwani);
        rPressSweater=findViewById(R.id.rPressSweater);
        rPressbedsheetSingle=findViewById(R.id.rPressbedsheetSingle);
        rPressbedsheetDouble=findViewById(R.id.rPressbedsheetDouble);
        rPressSolaSingChadar=findViewById(R.id.rPressSolaSingChadar);
        rPressSolaDoubleChadar=findViewById(R.id.rPressSolaDoubleChadar);
        rPressBlanketSingle=findViewById(R.id.rPressBlanketSingle);
        rPressBlanketDouble=findViewById(R.id.rPressBlanketDouble);
        rPressCarSeatCover=findViewById(R.id.rPressCarSeatCover);
        rPressSchoolBag=findViewById(R.id.rPressSchoolBag);
        rPressColor=findViewById(R.id.rPressColor);
        rPressCarpet=findViewById(R.id.rPressCarpet);
        rPressTotal=findViewById(R.id.rPressTotal);
        rPressTotal=findViewById(R.id.rPressTotal);


        btnPress=(Button)findViewById(R.id.btnPressSubmit);


        btnPress.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                    }
                }
        );

    }

    public void selectProduct(){

        if (x==0){


        }
    }
}
