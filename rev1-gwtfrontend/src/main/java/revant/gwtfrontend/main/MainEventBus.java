package revant.gwtfrontend.main;

import revant.gwtfrontend.main.presenters.impl.live.MainModuleLayoutManagerPresenter;

import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.event.EventBus;

@Events(startPresenter = MainModuleLayoutManagerPresenter.class)
public interface MainEventBus extends EventBus {


}
