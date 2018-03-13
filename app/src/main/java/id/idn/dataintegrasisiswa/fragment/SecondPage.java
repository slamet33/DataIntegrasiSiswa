package id.idn.dataintegrasisiswa.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.idn.dataintegrasisiswa.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondPage extends Fragment {


    public SecondPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_page, container, false);
    }

}
