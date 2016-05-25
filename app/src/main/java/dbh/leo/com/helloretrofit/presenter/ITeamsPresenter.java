package dbh.leo.com.helloretrofit.presenter;

import dbh.leo.com.helloretrofit.view.TeamView;

/**
 * Created by leo on 2016/5/23.
 */
public interface ITeamsPresenter<T> {


    /**
     * 加载数据成功
     *
     * @param t
     */
    void loadDataSuccess(T t);

    /**
     * 记载数据失败
     */
    void loadDataFailure();


    void attachView(TeamView view);


    void detachView();

}
