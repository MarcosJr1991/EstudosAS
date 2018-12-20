package marcosjr.com.fragmentcomunicacaofragment.Fragmentos;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import marcosjr.com.fragmentcomunicacaofragment.Interface.IMainActivity;
import marcosjr.com.fragmentcomunicacaofragment.MainActivity;
import marcosjr.com.fragmentcomunicacaofragment.R;

public class BFragment extends Fragment{

    private static final String TAG = "BFragment";

    //widgets
    private TextView mDisplayMessage;


    //vars
    private IMainActivity mIMainActivity;
    private String mIncomingMessage = "";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIMainActivity.setToolbarTitle(getTag());

        Bundle bundle = this.getArguments();
        if(bundle != null){
            mIncomingMessage = bundle.getString(getString(R.string.intent_message));
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        mDisplayMessage = view.findViewById(R.id.incomin_gmessage);

        setIncomingMessage();

        return view;
    }

    private void setIncomingMessage(){
        if(!mIncomingMessage.equals("")){
            mDisplayMessage.setText(mIncomingMessage);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mIMainActivity = (MainActivity) getActivity();
    }
}