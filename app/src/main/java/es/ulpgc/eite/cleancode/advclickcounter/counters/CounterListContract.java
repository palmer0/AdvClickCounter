package es.ulpgc.eite.cleancode.advclickcounter.counters;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public interface CounterListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(CounterListViewModel viewModel);
    void navigateToNextScreen();

  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);
    //void injectRouter(Router router);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onListPressed(CounterData counter);
    void onCounterButtonPressed();
  }

  interface Model {
    List<CounterData> getStoredCounterList();
    void onDataFromNextScreen(CounterData counter);
    void onRestartScreen(List<CounterData> counters);
    void onAddCounter(CounterData counter);

  }

//  interface Router {
//
//    void passStateToNextScreen(CounterToClickState state);
//    ClickToCounterState getStateFromNextScreen();
//  }
}
