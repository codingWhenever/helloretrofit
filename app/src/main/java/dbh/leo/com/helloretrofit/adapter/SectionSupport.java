package dbh.leo.com.helloretrofit.adapter;

/**
 * Created by leo on 2016/5/24.
 */
public interface SectionSupport<T> {
    /**
     * 获取header的布局
     * @return
     */
    int sectionHeaderLayoutId();

    /**
     * header对应的textview
     * @return
     */
    int sectionTitleTextviewId();

    /**
     * header需要显示的文本信息
     * @param t
     * @return
     */
    String getTitle(T t);
}
