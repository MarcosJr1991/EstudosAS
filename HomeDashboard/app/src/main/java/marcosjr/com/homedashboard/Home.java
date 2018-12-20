package marcosjr.com.homedashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView bankCard,ideasCard,addCard,linksCard,wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //definindo cards
        bankCard = (CardView)findViewById(R.id.bank_card);
        ideasCard = (CardView)findViewById(R.id.ideas_card);
        addCard = (CardView)findViewById(R.id.add_card);
        linksCard = (CardView)findViewById(R.id.links_card);
        wifiCard = (CardView)findViewById(R.id.wifi_card);

        //ADD CLICK LISTENER TO THE CARDS
        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.bank_card : i = new Intent(this,Bank.class);startActivity(i); break;
            case R.id.ideas_card : i = new Intent(this,Ideas.class);startActivity(i);break;
            case R.id.add_card : i = new Intent(this,Add.class);startActivity(i);break;
            case R.id.links_card : i = new Intent(this,Links.class);startActivity(i);break;
            case R.id.wifi_card : i = new Intent(this,Wifi.class);startActivity(i);break;
            default:break;
        }

    }
}
