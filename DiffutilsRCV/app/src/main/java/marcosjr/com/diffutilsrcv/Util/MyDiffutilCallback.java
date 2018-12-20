package marcosjr.com.diffutilsrcv.Util;

import android.support.v7.util.DiffUtil;

import java.util.List;

public class MyDiffutilCallback extends DiffUtil.Callback {

    private List<String> oldList;//velha lista
    private List<String> newList;// nova lista

    public MyDiffutilCallback(List<String> oldList, List<String> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldItemPosition == newItemPosition;
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition) == newList.get(newItemPosition);
    }
}
