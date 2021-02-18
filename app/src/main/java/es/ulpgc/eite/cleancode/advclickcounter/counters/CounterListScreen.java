package es.ulpgc.eite.cleancode.advclickcounter.counters;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class CounterListScreen {

  public static void configure(CounterListContract.View view) {

    AppMediator mediator = AppMediator.getInstance();
    //CounterListState state = mediator.getCounterListState();

    //CounterListContract.Router router = new CounterListRouter(mediator);
    //CounterListContract.Presenter presenter = new CounterListPresenter(state);
    CounterListContract.Presenter presenter = new CounterListPresenter(mediator);
    CounterListContract.Model model = new CounterListModel();
    presenter.injectModel(model);
    //presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
