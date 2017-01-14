package pl.oskarpolak.shared;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {





    public RedFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.buttonShowToast)
    public void onClickToast() {
        Toast.makeText(this.getActivity(), "Zostałem klinięty z fragmentu", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_red, container, false);

        ButterKnife.bind(this, v);

        return v;
    }

}
