package ec.com.rhinosystem.Meetme.Principales;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learn2crack.R;

import java.util.HashMap;

import ec.com.rhinosystem.Meetme.Controller.DatabaseHandler;


public class ProfileFragment extends Fragment {

	public ProfileFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {




        View rootView = inflater.inflate(R.layout.profile_panel, container, false);


        DatabaseHandler db = new DatabaseHandler(getActivity());
        /**
         * Hashmap to load data from the Sqlite database
         **/
        HashMap<String,String> user = new HashMap<String, String>();
        user = db.getUserDetails();


        final TextView nameusser = (TextView) rootView.findViewById(R.id.nombreusuario);
        nameusser.setText(user.get("fname")+" "+user.get("lname"));

        final TextView usuario = (TextView) rootView.findViewById(R.id.usuario);
        usuario.setText(user.get("uname"));
        final TextView mailusser = (TextView) rootView.findViewById(R.id.correousuario);
        mailusser.setText(user.get("email"));


        final TextView namecom = (TextView) rootView.findViewById(R.id.ncompleto);
        namecom.setText(user.get("fname")+" "+user.get("lname"));


        final TextView mail = (TextView) rootView.findViewById(R.id.correoperfil);
        mail.setText(user.get("email"));

        return rootView;
    }
}
