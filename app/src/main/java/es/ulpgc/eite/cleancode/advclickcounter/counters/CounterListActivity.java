package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.cleancode.advclickcounter.R;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterListActivity
    extends AppCompatActivity implements CounterListContract.View {

  public static String TAG = CounterListActivity.class.getSimpleName();

  private CounterListContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_counter);
    getSupportActionBar().setTitle(R.string.counter_title);

    // do the setup
    CounterListScreen.configure(this);

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


  public void onCounterButtonPressed(View view) {
    presenter.onCounterButtonPressed();
  }

  @Override
  public void onDataUpdated(CounterListViewModel viewModel) {
    //Log.e(TAG, "onDataUpdated()");

    // deal with the datasource
    ((ListView) findViewById(R.id.counterList)).setAdapter(new CounterListAdapter(
            this, viewModel.counters, new View.OnClickListener() {

          @Override
          public void onClick(View view) {
            CounterData counter = (CounterData) view.getTag();
            presenter.onListPressed(counter);
          }
        })
    );
  }


  @Override
  public void injectPresenter(CounterListContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
