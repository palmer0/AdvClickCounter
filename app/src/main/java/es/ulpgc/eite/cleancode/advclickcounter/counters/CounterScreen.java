package es.ulpgc.eite.cleancode.advclickcounter.counters;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class CounterScreen {

  public static void configure(CounterContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    CounterState state = mediator.getCounterState();

    CounterContract.Router router = new CounterRouter(mediator);
    CounterContract.Presenter presenter = new CounterPresenter(state);
    CounterContract.Model model = new CounterModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
