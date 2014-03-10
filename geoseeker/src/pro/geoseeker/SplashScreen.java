package pro.geoseeker;

import pro.geoseeker.R;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		new AppLoader().execute();
	}

	/**
	 * �����, ����������� ����������� �������� ������.
	 */
	private class AppLoader extends AsyncTask<Void, Void, Void> {

		/**
		 * ����������� ������.
		 */

		@Override
		protected Void doInBackground(Void... arg0) {

			// ������������ ��������.

			return null;
		}

		/**
		 * �������, ���������� ����� ���������� ���������� ����������� ������.
		 */
		@Override
		protected void onPostExecute(Void aVoid) {

			super.onPostExecute(aVoid);

			// ������� ����� Intent ��� �������� �� MainActivity
			Intent intent = new Intent(SplashScreen.this, MainMenu.class);

			// ��������� ����� Activity c Intent-��.
			startActivity(intent);

			// ��������� ������ ������
			finish();
		}

	}
}
