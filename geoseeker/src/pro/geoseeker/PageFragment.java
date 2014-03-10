package pro.geoseeker;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * �����, �������������� �������� �������� ���������� pager.
 * 
 * 
 */
public class PageFragment extends Fragment {

	static final String TAG = "myLogs";

	static final String ARGUMENT_PAGE_NUMBER = "arg_page_number";
	static final String SAVE_PAGE_NUMBER = "save_page_number";

	int pageNumber;

	/**
	 * ����������� �������-����������� ��� �������� ������ ����������
	 * PageFragment � ��������� ��������� ��������� ������ ��������. �� �����
	 * ��������� ������������ �������� ����� ����������, ����� ������ ����������
	 * ��������� �� ���������.
	 */
	static PageFragment newInstance(int page) {

		PageFragment pageFragment = new PageFragment();

		Bundle arguments = new Bundle();
		arguments.putInt(ARGUMENT_PAGE_NUMBER, page);

		pageFragment.setArguments(arguments);

		return pageFragment;
	}

	/**
	 * �������, ���������� ��� �������� ������ ����������.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// �������� �������� �������� �� ����������
		// (����� �������� ��� ������� � ��������� ����������� ��������
		// newInstance).
		pageNumber = getArguments().getInt(ARGUMENT_PAGE_NUMBER);

		// ���� � ����������� ��������� ���������� ����� ��������, �� ��
		// ����������� � ����������� � ���������� savedPageNumber.
		int savedPageNumber = -1; // ����� �� ������������.
		// if (savedInstanceState != null) {
		// savedPageNumber = savedInstanceState.getInt(SAVE_PAGE_NUMBER);
		// }

		Log.d(TAG, "PageFragment::onCreate, pageNumber = [" + pageNumber
				+ "], savedPageNumber = [" + savedPageNumber + "]");
	}

	/**
	 * �������, ���������� ��� �������� ����� ���������.
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// ���������� �����.
		// � ����������� �� ����, ����� ����� ����� ����������� ��������, ���
		// ����������� ������ ����������.
		View view;
		switch (pageNumber) {
		case 0:
			
			// �����, ���������� ������.
			view = inflater.inflate(R.layout.list_screen, null);
			
			Log.d(TAG, "PageFragment::onCreateView, pageNumber = " + pageNumber);
			
			break;
			
		case 1:
			
			// �����, ���������� ����� Google.
			view = inflater.inflate(R.layout.googlemap_main_screen, null);
			
			Log.d(TAG, "PageFragment::onCreateView, pageNumber = " + pageNumber);
			
			break;
			
		case 2:
			
			// �����, ���������� ����� 2���.
			view = inflater.inflate(R.layout.dgis_main_screen, null);
			
			Log.d(TAG, "PageFragment::onCreateView, pageNumber = " + pageNumber);
			
			break;
			
		default:
			
			// ���� ����� �������� ����������, �� ������������ �������� ��������.
			view = inflater.inflate(R.layout.splash_screen, null);
		}

		Log.d(TAG, "PageFragment::onCreateView, pageNumber = [" + pageNumber
				+ "]");

		return view;
	}

	/**
	 * ������� ��������� ��� ���������� ��������� ���������.
	 */
	@Override
	public void onSaveInstanceState(Bundle outState) {

		super.onSaveInstanceState(outState);

		// outState.putInt(SAVE_PAGE_NUMBER, pageNumber);

		Log.d(TAG, "PageFragment::onSaveInstanceState, pageNumber = ["
				+ pageNumber + "]");
	}

	/**
	 * ������� ���������� ��� ����������� ��������� PageFragment.
	 */
	@Override
	public void onDestroy() {

		super.onDestroy();

		Log.d(TAG, "PageFragment::onDestroy, pageNumber = [" + pageNumber + "]");
	}
}
