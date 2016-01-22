package ec.com.rhinosystem.Meetme.Principales;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learn2crack.R;
/**
 * Created by Ronny on 01/09/2014.
 */
public class Invitaciones extends Fragment {

    TextView txtturismo,txtacademico,txtperfil;
         @Override
         public View onCreateView(LayoutInflater inflater, ViewGroup container,
                    Bundle savedInstanceState) {
                // TODO Auto-generated method stub
             View  v = inflater.inflate(R.layout.lista_eventos, container,false);


             FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
             Fragment productDetails = new ListaInvitaciones();
             fragmentTransaction.replace(R.id.fragment_lista_eventos, productDetails);
             fragmentTransaction.commit();

                    return v;
               }

}

