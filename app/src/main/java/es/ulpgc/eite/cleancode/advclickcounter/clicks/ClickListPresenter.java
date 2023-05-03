package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;
import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;

public class ClickListPresenter implements ClickListContract.Presenter {

  public static String TAG = "AdvClickCounter.ClickListPresenter";

  private WeakReference<ClickListContract.View> view;
  private ClickListState state;
  private ClickListContract.Model model;
  //private ClickListContract.Router router;
  private AppMediator mediator;

  public ClickListPresenter(AppMediator mediator) {
    this.mediator = mediator;
    //state = mediator.getClickListState();
  }

//  public ClickListPresenter(ClickListState state) {
//    this.state = state;
//  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state
    state = new ClickListState();
    /*if (state == null) {
      state = new ClickListState();
    }*/

    // use passed state if is necessary
    CounterToClickState savedState = getStateFromPreviousScreen();
    //CounterToClickState savedState = router.getStateFromPreviousScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromPreviousScreen(savedState.counter);
    }
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // get back the state
    state = mediator.getClickListState();

    // update the model if is necessary
    model.onRestartScreen(state.counter);
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // call the model and update the state
    state.counter = model.getStoredData();

    // update the view
    view.get().onDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    passStateToPreviousScreen(new ClickToCounterState(state.counter));

    /*
    router.passStateToPreviousScreen(
        new ClickToCounterState(state.counter)
    );
    */
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // save the state
    mediator.setClickListState(state);
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");
  }

  private void passStateToPreviousScreen(ClickToCounterState state) {
    mediator.setPreviousDetailScreenState(state);
  }

  private CounterToClickState getStateFromPreviousScreen() {
    return mediator.getPreviousDetailScreenState();
  }

  @Override
  public void onClickListPressed(ClickData click) {
    // Log.e(TAG, "onClickListPressed()");

    model.onUpdateClick(click);
    onResume();
  }

  @Override
  public void onClickButtonPressed() {
    // Log.e(TAG, "onClickButtonPressed()");

    model.onAddClick(new ClickData());
    onResume();
  }

  @Override
  public void injectView(WeakReference<ClickListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ClickListContract.Model model) {
    this.model = model;
  }

//  @Override
//  public void injectRouter(ClickListContract.Router router) {
//    this.router = router;
//  }

}
