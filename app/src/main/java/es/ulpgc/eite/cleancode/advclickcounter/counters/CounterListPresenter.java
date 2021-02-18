package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class CounterListPresenter implements CounterListContract.Presenter {

  public static String TAG = CounterListPresenter.class.getSimpleName();

  private WeakReference<CounterListContract.View> view;
  private CounterListState state;
  private CounterListContract.Model model;
  //private CounterListContract.Router router;
  private AppMediator mediator;

  public CounterListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    state = mediator.getCounterListState();
  }

//  public CounterListPresenter(CounterListState state) {
//    this.state = state;
//  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new CounterListState();
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
    ClickToCounterState savedState = getStateFromNextScreen();
    //ClickToCounterState savedState = router.getStateFromNextScreen();
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

    //router.passStateToNextScreen(new CounterToClickState(counter));
    passStateToNextScreen(new CounterToClickState(counter));
    view.get().navigateToNextScreen();
  }

  private void passStateToNextScreen(CounterToClickState state) {
    mediator.setNextMasterScreenState(state);
  }


  private ClickToCounterState getStateFromNextScreen() {
    return mediator.getNextMasterScreenState();
  }

  @Override
  public void onCounterButtonPressed() {
    Log.e(TAG, "onCounterButtonPressed()");

    model.onAddCounter(new CounterData());
    onResume();
  }

  @Override
  public void injectView(WeakReference<CounterListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CounterListContract.Model model) {
    this.model = model;
  }

//  @Override
//  public void injectRouter(CounterListContract.Router router) {
//    this.router = router;
//  }
}
