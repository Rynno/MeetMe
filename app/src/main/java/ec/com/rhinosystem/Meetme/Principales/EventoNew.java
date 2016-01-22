package ec.com.rhinosystem.Meetme.Principales;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn2crack.R;


public class EventoNew extends Fragment {

	public EventoNew(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.academico_panel, container, false);
         
        return rootView;
    }
}
