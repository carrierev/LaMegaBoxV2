package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class JeanMarieFragment extends Fragment {

    private MediaPlayer jmOne;


	public JeanMarieFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_jean_marie, container,
				false);
        ImageButton firstJm = (ImageButton) view.findViewById(R.id.jmOne);
        firstJm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jmOne.start();
            }
        });

		return view;
	}

    @Override
    public void onPause() {
        releaseMedia();
        super.onPause();
    }

    @Override
    public void onResume() {
        loadMedia();
        super.onResume();
    }

    public void loadMedia()
    {
        jmOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.jm);
    }

    public void releaseMedia()
    {
        jmOne.release();
    }


}