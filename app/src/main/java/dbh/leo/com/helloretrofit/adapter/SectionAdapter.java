package dbh.leo.com.helloretrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leo on 2016/5/24.
 */
public abstract class SectionAdapter<T> extends MultiItemBaseAdapter<T> {
    private static final int TYPE_SECTION = 0;
    private SectionSupport mSectionSupport;
    private LinkedHashMap<String, Integer> mSections;
    final RecyclerView.AdapterDataObserver mObserver = new RecyclerView.AdapterDataObserver() {
        @Override
        public void onChanged() {
            super.onChanged();
            findSection();
        }
    };
    private MultiItemTypeSupport<T> headerItemTypeSupport = new MultiItemTypeSupport<T>() {
        @Override
        public int getLayoutId(int itemType) {
            if (itemType == TYPE_SECTION) {
                return mSectionSupport.sectionHeaderLayoutId();
            } else {
                return mLayoutId;
            }
        }

        @Override
        public int getItemViewType(int position, T t) {
            return mSections.values().contains(position) ? TYPE_SECTION : 1;
        }
    };

    public SectionAdapter(Context context, int layoutId, List<T> datas, SectionSupport sectionSupport) {
        super(context, datas, null);
        mLayoutId = layoutId;
        mTMultiItemTypeSupport = headerItemTypeSupport;
        mSections = new LinkedHashMap<>();
        mSectionSupport = sectionSupport;

        findSection();
        registerAdapterDataObserver(mObserver);
    }


    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(mObserver);
    }

    public void findSection() {
        int n = mDatas.size();
        int nSections = 0;
        mSections.clear();

        for (int i = 0; i < n; i++) {
            String sectionName = mSectionSupport.getTitle(mDatas.get(i));
            if (!mSections.containsKey(sectionName)) {
                mSections.put(sectionName, i + nSections);
                nSections++;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mTMultiItemTypeSupport.getItemViewType(position, null);
    }

    @Override
    public int getItemCount() {
        return super.getItemCount() + mSections.size();
    }

    public int getIndexForPosition(int position) {
        int nSection = 0;
        for (Map.Entry<String, Integer> entry : mSections.entrySet()) {
            if (entry.getValue() < position) {
                nSection++;
            }
        }
        return position - nSection;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        position = getIndexForPosition(position);
        if (holder.getItemViewType() == TYPE_SECTION) {
            holder.setText(mSectionSupport.sectionTitleTextviewId(), mSectionSupport.getTitle(mDatas.get(position)));
        }
        super.onBindViewHolder(holder, position);
    }
}
