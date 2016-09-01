package com.justwayward.reader.ui.contract;

import com.justwayward.reader.bean.BooksByCats;

/**
 * @author yuyh.
 * @date 16/9/1.
 */
public interface SubRankContract {


    interface View {
        void showCategoryList(BooksByCats data);

        void complete();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {

        void getRankList(String id);
    }
}
