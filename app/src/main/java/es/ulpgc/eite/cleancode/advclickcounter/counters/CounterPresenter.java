package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class CounterPresenter implements CounterContract.Presenter {

  public static String TAG = CounterPresenter.class.getSimpleName();

  private WeakReference<CounterContract.View> view;
  private CounterState state;
  private CounterContract.Model model;
  private CounterContract.Router router;

  public CounterPresenter(CounterState state) {
    this.state = state;
  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new CounterState();
    }

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // update the model if is necessary
    model.onRestartScreen(state.counters);
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // use passed state if is necessary
    ClickToCounterState savedState = router.getStateFromNextScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromNextScreen(savedState.counter);
    }

    // call the model and update the state
    state.counters = model.getStoredCounterList();

    Log.e(TAG, "size: "+state.counters.size());

    // update the view
    view.get().onDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onListPressed(CounterData counter) {
    Log.e(TAG, "onClickListPressed()");

    router.passStateToNextScreen(new CounterToClickState(counter));
    router.navigateToNextScreen();
  }

  @Override
  public void onCounterButtonPressed() {
    Log.e(TAG, "onCounterButtonPressed()");

    model.onAddCounter(new CounterData());
    onResume();
  }

  @Override
  public void injectView(WeakReference<CounterContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CounterContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(CounterContract.Router router) {
    this.router = router;
  }
}
