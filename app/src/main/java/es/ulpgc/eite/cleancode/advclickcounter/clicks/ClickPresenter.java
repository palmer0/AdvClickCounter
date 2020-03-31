package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class ClickPresenter implements ClickContract.Presenter {

  public static String TAG = ClickPresenter.class.getSimpleName();

  private WeakReference<ClickContract.View> view;
  private ClickState state;
  private ClickContract.Model model;
  private ClickContract.Router router;

  public ClickPresenter(ClickState state) {
    this.state = state;
  }

  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new ClickState();
    }

    // use passed state if is necessary
    CounterToClickState savedState = router.getStateFromPreviousScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromPreviousScreen(savedState.counter);
    }
  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    // update the model if is necessary
    model.onRestartScreen(state.counter);
  }

  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");

    /*
    // use passed state if is necessary
    ClickState savedState = router.getStateFromNextScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromNextScreen(savedState.data);
    }
    */

    // call the model and update the state
    state.counter = model.getStoredData();

    // update the view
    view.get().onDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");

    router.passStateToPreviousScreen(
        new ClickToCounterState(state.counter)
    );
  }

  @Override
  public void onPause() {
    // Log.e(TAG, "onPause()");
  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");
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
  public void injectView(WeakReference<ClickContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ClickContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(ClickContract.Router router) {
    this.router = router;
  }
}
