package dbh.leo.com.helloretrofit.view;

/**
 * Created by leo on 2016/5/25.
 */
public interface TeamView<T> {
    /**
     * 显示数据
     * @param t
     */
    void showData(T t);

    /**
     * 显示progressbar
     */
    void showProgress();

    /**
     * 隐藏progressbar
     */
    void hideProgress();
}
