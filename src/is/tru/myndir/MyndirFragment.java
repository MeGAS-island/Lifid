package is.tru.myndir;


import is.tru.myndir.Constants.Extra;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyndirFragment extends Fragment {
	
	public MyndirFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		Log.v("DRAS", Extra.IMAGES);
 
		Intent intent = new Intent(getActivity(), ImageGridActivity.class);
		startActivity(intent);
         
		return null;
    }
	
}