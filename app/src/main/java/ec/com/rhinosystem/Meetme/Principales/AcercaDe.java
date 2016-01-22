package ec.com.rhinosystem.Meetme.Principales;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn2crack.R;


/**
 * Created by Ronny on 09/09/2014.
 */

public class AcercaDe extends Fragment {

    public AcercaDe(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.acercade_panel, container, false);

        return rootView;
    }
}
