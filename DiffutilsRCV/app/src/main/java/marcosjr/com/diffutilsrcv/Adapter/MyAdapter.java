package marcosjr.com.diffutilsrcv.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import marcosjr.com.diffutilsrcv.R;
import marcosjr.com.diffutilsrcv.Util.MyDiffutilCallback;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<String> dataSource;

    public MyAdapter(List<String> dataSource) {
        this.dataSource = dataSource;
    }

    public void insertData (List<String> insertList)
    {
        /*
        ESTA FUNÇÃO ADICIONARÁ NOVOS DADOS À RECYCLERVIEW

         */
        MyDiffutilCallback diffutilCallback = new MyDiffutilCallback(dataSource,insertList);
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffutilCallback);

        dataSource.addAll(insertList);
        diffResult.dispatchUpdatesTo(this);
    }


    public void updateData (List<String> newList)
    {
        /*
        ESTA FUNÇÃO irá limpar os dados antigos e adicionar novos

         */
        MyDiffutilCallback diffutilCallback = new MyDiffutilCallback(dataSource,newList);
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffutilCallback);

        dataSource.clear();
        dataSource.addAll(newList);
        diffResult.dispatchUpdatesTo(this);
    }





    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.mmy_text_view.setText(dataSource.get(i));

    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mmy_text_view;

        public MyViewHolder(View itemView) {
            super(itemView);
            mmy_text_view = (TextView)itemView.findViewById(R.id.my_text_view);
        }
    }
}
