package marcosjr.com.testercv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import marcosjr.com.testercv.Adapter.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/20/08/34/brazil-1842205_1280.jpg");
        mNames.add("Brasil São Paulo");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/07/13/14/15/dubai-1514540_1280.jpg");
        mNames.add("Dubai Marina Árabe Unidos Emirates");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/19/21/29/temple-1841296_1280.jpg");
        mNames.add("Japão Templo Japonês");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/10/18/21/16/plaza-espana-1751442_1280.jpg");
        mNames.add("Espanha Sevilha Plaza Espana");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/03/21/17/10/nightlife-2162772_1280.jpg");
        mNames.add("Korea República Da Coreia Jongno Tabuleta");

        mImageUrls.add("https://cdn.pixabay.com/photo/2015/07/28/20/24/hong-kong-864884_1280.jpg");
        mNames.add(" China Hong kong Linha Do Horizonte");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/08/16/19/07/los-angeles-1598747_1280.jpg");
        mNames.add("EUA Los Angeles Califórnia Linha DO Horizonte");

        mImageUrls.add("https://cdn.pixabay.com/photo/2013/09/27/17/16/monaco-187184_1280.jpg");
        mNames.add("França Monaco Porto City View Principado De Mônaco");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/08/28/04/10/montreal-2688393_1280.jpg");
        mNames.add("Canadá Montreal Mont Royal Cênico Vista Mont Real");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/09/04/10/24/amsterdam-1643644_1280.jpg");
        mNames.add("Holanda Amsyerdam");

        mImageUrls.add("https://cdn.pixabay.com/photo/2014/02/23/19/32/milan-273124_1280.jpg");
        mNames.add("Italia Milão Duomo Monumento");

        mImageUrls.add("https://cdn.pixabay.com/photo/2017/05/11/23/54/carew-castle-2305685_1280.jpg");
        mNames.add("Pais de gales Carew Castelo");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/09/03/11/58/istanbul-1641539_1280.jpg");
        mNames.add(" Turquia Catedral Istambul");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/06/23/51/frankfurt-1804481_1280.jpg");
        mNames.add("Alemanha Frankfurt");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/10/07/13/00/copenhagen-1721511_1280.jpg");
        mNames.add("Dinamarca Copenhaga");

        mImageUrls.add("https://cdn.pixabay.com/photo/2016/11/14/19/20/stockholm-1824368_1280.jpg");
        mNames.add("Suécia Stockholm");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
