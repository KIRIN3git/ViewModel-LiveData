package kirin3.jp.viewmodel_livedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class CountViewModel : ViewModel() {
    // ViewModelに属するカウンター
//    var counterB: Int = 0

    // Int型のLiveViewを作成
    val counterB: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
    // 初期値を0に設定
    init{
        counterB.value = 0
    }
}