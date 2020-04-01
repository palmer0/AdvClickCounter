package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.R;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class ClickListActivity
    extends AppCompatActivity implements ClickListContract.View {

  public static String TAG = ClickListActivity.class.getSimpleName();

  private ClickListContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_click);
    getSupportActionBar().setTitle(R.string.click_title);

    // do the setup
    ClickListScreen.configure(this);

    if (savedInstanceState == null) {
      presenter.onStart();

    } else {
      presenter.onRestart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();

    // load the data
    presenter.onResume();
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();

    presenter.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();

    presenter.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();

    presenter.onDestroy();
  }


  public void onClickButtonPressed(View view) {
    presenter.onClickButtonPressed();
  }

  @Override
  public void onDataUpdated(ClickListViewModel viewModel) {
    //Log.e(TAG, "onDataUpdated()");

    CounterData counter = viewModel.counter;

    // deal with the datasource
    ((ListView) findViewById(R.id.clickList)).setAdapter(new ClickListAdapter(
            this, counter.clicks, new View.OnClickListener() {

          @Override
          public void onClick(View view) {
            ClickData data = (ClickData) view.getTag();
            presenter.onClickListPressed(data);
          }
        })
    );
  }

  @Override
  public void injectPresenter(ClickListContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
