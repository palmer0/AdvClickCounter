package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.data.ClickData;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public interface ClickListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(ClickListViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void onResume();

    void onStart();

    void onRestart();

    void onBackPressed();

    void onPause();

    void onDestroy();

    void onClickListPressed(ClickData click);

    void onClickButtonPressed();
  }

  interface Model {
    CounterData getStoredData();

    void onRestartScreen(CounterData counter);

    void onDataFromPreviousScreen(CounterData counter);

    void onAddClick(ClickData clickData);

    void onUpdateClick(ClickData click);
  }

  interface Router {

    CounterToClickState getStateFromPreviousScreen();

    void passStateToPreviousScreen(ClickToCounterState state);
  }
}
