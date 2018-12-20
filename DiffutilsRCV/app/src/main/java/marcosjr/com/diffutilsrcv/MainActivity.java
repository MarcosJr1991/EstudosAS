package marcosjr.com.diffutilsrcv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import marcosjr.com.diffutilsrcv.Adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    Button btn_insert,btn_update;
    RecyclerView recyclerView;

    List<String> dataSource = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btn_insert = (Button)findViewById(R.id.btn_isert);
        btn_update = (Button)findViewById(R.id.btn_update);

        initData();

        final MyAdapter adapter = new MyAdapter(dataSource);
        recyclerView.setAdapter(adapter);

        //Event
        btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> insertList = new ArrayList<>();//atribuir dados antigos
                for (int i=0;i<3;i++)
                    insertList.add(UUID.randomUUID().toString());//Adicionando nova data
                adapter.insertData(insertList);
                recyclerView.smoothScrollToPosition(adapter.getItemCount()-1);//rolagem automática até o último item
            }
        });

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<String> update = new ArrayList<>();//atribuir dados antigos
                for (int i=0;i<3;i++)
                    update.add(UUID.randomUUID().toString());//Adicionando nova data
                adapter.updateData(update);//ou insert


            }
        });


    }

    private void initData() {
        for (int i=0;i<3;i++)
            dataSource.add(UUID.randomUUID().toString());
    }
}
