package dbh.leo.com.helloretrofit.adapter;

/**
 * Created by leo on 2016/5/24.
 */
public interface MultiItemTypeSupport<T> {
    int getLayoutId(int itemType);

    int getItemViewType(int position, T t);
}
