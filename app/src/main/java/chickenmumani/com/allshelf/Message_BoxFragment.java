package chickenmumani.com.allshelf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chickenmumani.com.allshelf.R;

public class Message_BoxFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_messagebox,container,false);

        return v;
    }

    public void onResume(){
        super.onResume();
        ((Navi_Activity) getActivity())
                .setActionBarTitle("메세지함");

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
