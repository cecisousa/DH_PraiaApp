package br.com.digitalhouse.dh_praiaapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class PraiaDaJustaFragment extends Fragment {
    private Button btnCuriosidade;

    public PraiaDaJustaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_praia_da_justa, container, false);

        btnCuriosidade = view.findViewById(R.id.buttonCuriosidade2);

        btnCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Placeholder 2",Snackbar.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
