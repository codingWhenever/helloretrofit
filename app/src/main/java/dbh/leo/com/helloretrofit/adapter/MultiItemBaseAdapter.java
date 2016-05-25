package dbh.leo.com.helloretrofit.adapter;

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by leo on 2016/5/24.
 */
public abstract class MultiItemBaseAdapter<T> extends BaseAdapter<T> {
    protected MultiItemTypeSupport<T> mTMultiItemTypeSupport;

    public MultiItemBaseAdapter(Context context, List<T> datas, MultiItemTypeSupport<T> TMultiItemTypeSupport) {
        super(context, -1, datas);
        mTMultiItemTypeSupport = TMultiItemTypeSupport;
    }

    @Override
    public int getItemViewType(int position) {
        return mTMultiItemTypeSupport.getItemViewType(position, mDatas.get(position));
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mTMultiItemTypeSupport == null) {
            return super.onCreateViewHolder(parent, viewType);
        }
        int layoutId = mTMultiItemTypeSupport.getLayoutId(viewType);
        ViewHolder holder = ViewHolder.get(mContext, null, parent, layoutId, -1);
        return holder;
    }
}
