package revant.gwtfrontend.main.presenters.impl.live;

import revant.gwtfrontend.main.MainEventBus;
import revant.gwtfrontend.main.views.impl.live.MainModuleLayoutManagerView;
import org.appverse.web.framework.frontend.gwt.presenters.LayoutManagerPresenter;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.annotation.Presenter;

@Presenter(view = MainModuleLayoutManagerView.class)
public class MainModuleLayoutManagerPresenter extends
		LayoutManagerPresenter<MainEventBus> {

	@Override
	public void onChangeLayoutWidget(final IsWidget layoutWidget) {
		view.changeLayoutWidget(layoutWidget);
	}
}
