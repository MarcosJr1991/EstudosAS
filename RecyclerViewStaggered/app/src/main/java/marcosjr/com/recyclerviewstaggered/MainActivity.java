package marcosjr.com.recyclerviewstaggered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

import marcosjr.com.recyclerviewstaggered.RecyclerView.StaggeredRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();


    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/11/23/48/italy-1587287_1280.jpg");
        mNames.add("Italia Montanhas Pragser Wildsee");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/05/22/13/lisbon-1801727_1280.jpg");
        mNames.add("Portugal Lisboa");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/11/23/48/italy-1587287_1280.jpg");
        mNames.add(" EUA Nova Iorque");

        mImageUrls.add("https://cdn.pixabay.com/photo/2012/10/10/05/04/locomotive-60539_1280.jpg");
        mNames.add("Russia Locomotiva");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/20/08/34/brazil-1842205_1280.jpg");
        mNames.add("Brasil São Paulo");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/04/25/09/26/eiffel-tower-3349075_1280.jpg");
        mNames.add("França Paris");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/03/27/18/58/sea-1283651_1280.jpg");
        mNames.add("Espanha Málaga");

        mImageUrls.add("https://cdn.pixabay.com/photo/2014/11/01/18/46/dubrovnik-512798_1280.jpg");
        mNames.add("Croácia Dubrovnik");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/16/17/12/rotterdam-1598418_1280.jpg");
        mNames.add("Holanda Rotterdam");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/12/06/16/22/torres-del-paine-1079691_1280.jpg");
        mNames.add("Chile Patagônia");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/08/25/18/30/casa-rosada-907344_1280.jpg");
        mNames.add("Argentina Buenos Aires");

        mImageUrls.add("https://cdn.pixabay.com/photo/2013/09/21/18/37/river-184612_1280.jpg");
        mNames.add("Paraguai Rio Paraguai");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/03/15/17/21/cartagena-de-indias-674706_1280.jpg");
        mNames.add("Colômbia Cartagena De Indias ");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/10/16/22/10/venezuela-991906_1280.jpg");
        mNames.add("Venezuela Puerto La Cruz");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/04/15/46/machu-picchu-1569324_1280.jpg");
        mNames.add("Peru Machu Picchu Montanhas");

        mImageUrls.add("https://cdn.pixabay.com/photo/2013/11/25/09/47/japan-217878_1280.jpg");
        mNames.add("Japão Tóquio");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/12/08/00/26/cityscape-1081704_1280.jpg");
        mNames.add("China Hong Kong");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/10/17/07/53/busan-night-scene-1747130_1280.jpg");
        mNames.add("Korea Busan Ponte Gwangan");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/01/27/23/46/toronto-3112508_1280.jpg");
        mNames.add("Canada Toronto");

        mImageUrls.add("https://cdn.pixabay.com/photo/2013/07/01/18/22/copenhagen-142711_1280.jpg");
        mNames.add("Dinamarca Copenhaga");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/07/20/18/36/sweden-853150_1280.jpg");
        mNames.add("Suécia Sundborn");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/03/14/09/13/lake-2142371_1280.jpg");
        mNames.add("Iraque Lago Kurdistan");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/11/25/12/34/hamburg-2976711_1280.jpg");
        mNames.add("Alemanha Hamburgo");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/10/21/00/43/giza-1756946_1280.jpg");
        mNames.add("Egito Pirâmedes De Giza");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/07/20/22/56/mosque-1531510_960_720.jpg");
        mNames.add("Marrocos Mesquita Tinmel");

        mImageUrls.add("https://cdn.pixabay.com/photo/2014/08/12/00/01/oia-416135_1280.jpg");
        mNames.add("Grécia Oia Santorini");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/02/19/09/59/taj-mahal-1209004_1280.jpg");
        mNames.add("India Taj Mahal");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/11/06/12/11/king-mosque-1026730_1280.jpg");
        mNames.add("Irã Rei Mesquita Isfahan");

        mImageUrls.add("https://cdn.pixabay.com/photo/2012/10/25/23/18/railway-62849_1280.jpg");
        mNames.add("Suiça Bernina Ferroviária");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/01/30/17/22/africa-1170055_1280.jpg");
        mNames.add("Africa Namíbia");

        mImageUrls.add("https://cdn.pixabay.com/photo/2014/07/27/22/12/tucumcari-403227_1280.jpg");
        mNames.add("Mexico Tucumcari Novo Mexico");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/04/28/05/55/roatan-1358175_1280.jpg");
        mNames.add("Honduras Roatan Porto");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/08/02/16/47/andorra-2572395_960_720.jpg");
        mNames.add("Andorra Andorra La Vella");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/12/15/13/58/landscape-1908957_1280.jpg");
        mNames.add("Madagácar Paisagem");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/11/04/21/53/kiev-3795039_960_720.jpg");
        mNames.add("Ucrânia Kiev");

        mImageUrls.add("https://cdn.pixabay.com/photo/2018/08/13/20/58/montevideo-3603950_1280.jpg");
        mNames.add("Uruguai Montevideo");

        mImageUrls.add("https://cdn.pixabay.com/photo/2012/11/19/00/04/mt-fuji-66495_1280.jpg");
        mNames.add("Togo Toge Otome Fujinomiya");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/07/04/13/57/tunisia-2471197_1280.jpg");
        mNames.add("Tunísia Komachi");

        mImageUrls.add("https://cdn.pixabay.com/photo/2013/04/07/22/55/syria-101672_1280.jpg");
        mNames.add("Siria Anfiteatro");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggered recyclerview. ");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter =
                new StaggeredRecyclerViewAdapter(this,mNames,mImageUrls);

        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);


        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);

    }
}
